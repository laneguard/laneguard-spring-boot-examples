package com.macro.mall.tiny.jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ContainerTest
 * @Author WB-918966
 * @Date 2022/10/21 14:47
 * @Version 1.0
 **/
public class DelayQueueTest {

    @Test
    public void test2(){
        Collections.synchronizedList(new ArrayList());
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(DelayQueueTest.class);
    /**
     * 对于分布式的延迟队列，我们可以使用RabbitMQ、Redis等实现；
     * 对于进程内的延迟队列，Java本身就提供了比较方便使用的DelayQueue。DelayQueue是java.util
     * .concurrent包下面提供的一个类，它是一个阻塞队列（BlockingQueue），内部其实是对优先级队列（PriorityQueue）的封装实现；
     * 可以根据消息的TTL时间的大小来进行优先排序，DelayQueue能保证TTL时间越小的消息就会越优先被消费。
     * 可以说，DelayQueue是一个基于优先队列（PriorityQueue）实现的阻塞队列（BlockingQueue），队列中的消息的优先级是根据消息的TTL来决定的。
     * DelayQueue已经为我们解决了并发的线程安全问题，所以我们可以直接在多线程环境并发操作DelayQueue。
     */
    @Test
    public void test(){
        // 创建延迟消息队列
        DelayQueue<DelayMessage> delayQueue = new DelayQueue<>();
        // 创建并启动延迟队列的消费者线程
        new Thread(new DelayQueueConsumer(delayQueue)).start();
        //消息生成
        for (int i = 1; i <= 5; i++) {
            DelayMessage delayMessage = new DelayMessage(String.valueOf(i), i*1000L);
            LOGGER.info("Producer publish message: {}", String.valueOf(i));
            delayQueue.offer(delayMessage);
        }
        for (int i = 5; i > 0; i--) {
            String message = String.valueOf(i);
            DelayMessage delayMessage = new DelayMessage(message, i*1000L);
            LOGGER.info("Producer publish message: {}", message);
            delayQueue.offer(delayMessage);
        }
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            // 生成1~10的随机数：作为1秒-10秒的延迟时间
            int ttl = 1 + random.nextInt(10);
            String message = String.valueOf(ttl);
            DelayMessage delayMessage = new DelayMessage(message, ttl*1000L);
            LOGGER.info("Producer publish message: {}", message);
            delayQueue.offer(delayMessage);
        }
    }

    /**
     * 消息实体
     */
    public class DelayMessage implements Delayed {

        private String message;   // 延迟任务中的任务数据
        private long ttl;         // 延迟任务到期时间（过期时间）

        /**
         * 构造函数
         * @param message 消息实体
         * @param ttl 延迟时间，单位毫秒
         */
        public DelayMessage(String message, long ttl) {
            setMessage(message);
            this.ttl = System.currentTimeMillis() + ttl;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            // 计算该任务距离过期还剩多少时间
            long remaining = ttl - System.currentTimeMillis();
            return unit.convert(remaining, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            // 比较、排序：对任务的延时大小进行排序，将延时时间最小的任务放到队列头部
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    /**
     * 消息消费者
     */
    public class DelayQueueConsumer implements Runnable {

        private final  Logger LOGGER = LoggerFactory.getLogger(DelayQueueConsumer.class);
        private final DelayQueue<DelayMessage> delayQueue;

        /**
         * 构造函数
         * @param delayQueue 延迟队列
         */
        public DelayQueueConsumer(DelayQueue<DelayMessage> delayQueue) {
            this.delayQueue = delayQueue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    //只有消息的ttl到期了，消息才可以被取出
                    // 从延迟队列的头部获取已经过期的消息
                    // 如果暂时没有过期消息或者队列为空，则take()方法会被阻塞，直到有过期的消息为止
                    DelayMessage delayMessage = delayQueue.take();
                    LOGGER.info("Consumer received message: {}", delayMessage.getMessage());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
