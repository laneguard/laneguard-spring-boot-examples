package com.macro.mall.tiny.util.hutool.多线程;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.thread.ExecutorBuilder;
import org.junit.Test;

/**
 * @ClassName ExecutorBuilderTest
 * @Author WB-918966
 * @Date 2022/10/22 21:37
 * @Version 1.0
 *
 **/
public class ExecutorBuilderTest {
    @Test
    /**
     * 初始线程数为corePoolSize指定的大小
     * 没有最大线程数限制
     * 默认使用LinkedBlockingQueue，默认队列大小为1024（最大等待数1024）
     * 当运行线程大于corePoolSize放入队列，队列满后抛出异常
     */
    public void test(){
        //默认线程池，ThreadPoolExecutor实现了ExecutorService
        ThreadPoolExecutor build = ExecutorBuilder.create()
            .setCorePoolSize(50)
            .build();
        build.execute(()->{
            System.out.println(Thread.currentThread());
        });
    }

    @Test
    /**
     * 初始线程数为 1
     * 最大线程数为 1
     * 默认使用LinkedBlockingQueue，默认队列大小为1024
     * 同时只允许一个线程工作，剩余放入队列等待，等待数超过1024报错
     */
    public void test2(){
        ExecutorService executor = ExecutorBuilder.create()//
            .setCorePoolSize(1)//
            .setMaxPoolSize(1)//
            .setKeepAliveTime(0)//
            .build();
        executor.execute(()->{
            System.out.println(Thread.currentThread());
        });
    }

    @Test
    public void test3(){
        ThreadPoolExecutor testprefix = ExecutorBuilder.create()
            .setCorePoolSize(10)
            .setMaxPoolSize(100)
            .setKeepAliveTime(60, TimeUnit.SECONDS)//非核心线程池闲置保留时间
            .setWorkQueue(CollUtil.newBlockingQueue(1000, true))
            .setThreadFactory(new MyThreadFactory("testprefix", false))//使用自定义线程工程设置线程前缀
            .setHandler(new MyRejectHandler())
            .setAllowCoreThreadTimeOut(true)//线程超时是否回收线程
            .build();
    }

    class MyRejectHandler implements RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            //发生队列溢出，打印日志
            System.out.println("队列溢出，持久化任务，定时任务执行");
        }
    }
}

class MyThreadFactory implements ThreadFactory {

    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;
    private boolean nDaemon;

    public MyThreadFactory() {
        SecurityManager s = System.getSecurityManager();
        group = (s != null) ? s.getThreadGroup() :
            Thread.currentThread().getThreadGroup();
        namePrefix = "my-pool-" +
            poolNumber.getAndIncrement() +
            "-thread-";
    }

    public MyThreadFactory(String prefix, boolean needDaemon){
        SecurityManager s = System.getSecurityManager();
        group = (s != null) ? s.getThreadGroup() :
            Thread.currentThread().getThreadGroup();

        namePrefix = prefix + "-mythread-" + poolNumber.getAndIncrement();

        nDaemon = needDaemon;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(group, r,
            namePrefix + threadNumber.getAndIncrement(),
            0);
        if (nDaemon)
            t.setDaemon(nDaemon);

        if (t.getPriority() != Thread.NORM_PRIORITY)
            t.setPriority(Thread.NORM_PRIORITY);
        //多线程出现错误后异常不会暴露到主线程
        t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                //线程内部出现异常，打印日志
                System.out.println(t+" "+e.getMessage());
            }
        });

        return t;
    }
}
