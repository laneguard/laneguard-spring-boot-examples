package com.macro.mall.tiny.jdk.并发.并发容器;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName ArrayBlockingQueueTest
 * @Author WB-918966
 * @Date 2022/11/9 14:05
 * @Version 1.0
 * 类 ArrayBlockingQueue<E>
 * java.lang.Object
 *   继承者 java.util.AbstractCollection<E>
 *       继承者 java.util.AbstractQueue<E>
 *           继承者 java.util.concurrent.ArrayBlockingQueue<E>
 * 类型参数：
 * E - 在此 collection 中保持的元素类型
 * 所有已实现的接口：
 * Serializable, Iterable<E>, Collection<E>, BlockingQueue<E>, Queue<E>
 * public class ArrayBlockingQueue<E>
 * extends AbstractQueue<E>
 * implements BlockingQueue<E>, Serializable
 * 一个由数组支持的有界阻塞队列。此队列按 FIFO（先进先出）原则对元素进行排序。
 * 队列的头部 是在队列中存在时间最长的元素。
 * 队列的尾部 是在队列中存在时间最短的元素。
 * 新元素插入到队列的尾部，队列获取操作则是从队列头部开始获得元素。
 **/
public class ArrayBlockingQueueTest {
    /**
     * 构造方法摘要
     * ArrayBlockingQueue(int capacity)
     *           创建一个带有给定的（固定）容量和默认访问策略的 ArrayBlockingQueue。
     * ArrayBlockingQueue(int capacity, boolean fair)
     *           创建一个具有给定的（固定）容量和指定访问策略的 ArrayBlockingQueue。
     * ArrayBlockingQueue(int capacity, boolean fair, Collection<\? extends E> c)
     *           创建一个具有给定的（固定）容量和指定访问策略的 ArrayBlockingQueue，它最初包含给定 collection 的元素，并以 collection 迭代器的遍历顺序添加元素。
     *
     * 方法摘要
     *  boolean	add(E e)
     *           将指定的元素插入到此队列的尾部（如果立即可行且不会超过该队列的容量），在成功时返回 true，如果此队列已满，则抛出 IllegalStateException。
     *  void	clear()
     *           自动移除此队列中的所有元素。
     *  boolean	contains(Object o)
     *           如果此队列包含指定的元素，则返回 true。
     *  int	drainTo(Collection<\? super E> c)
     *           移除此队列中所有可用的元素，并将它们添加到给定 collection 中。
     *  int	drainTo(Collection<\? super E> c, int maxElements)
     *           最多从此队列中移除给定数量的可用元素，并将这些元素添加到给定 collection 中。
     *  Iterator<E>	iterator()
     *           返回在此队列中的元素上按适当顺序进行迭代的迭代器。
     *  boolean	offer(E e)
     *           将指定的元素插入到此队列的尾部（如果立即可行且不会超过该队列的容量），在成功时返回 true，如果此队列已满，则返回 false。
     *  boolean	offer(E e, long timeout, TimeUnit unit)
     *           将指定的元素插入此队列的尾部，如果该队列已满，则在到达指定的等待时间之前等待可用的空间。
     *  E	peek()
     *           获取但不移除此队列的头；如果此队列为空，则返回 null。
     *  E	poll()
     *           获取并移除此队列的头，如果此队列为空，则返回 null。
     *  E	poll(long timeout, TimeUnit unit)
     *           获取并移除此队列的头部，在指定的等待时间前等待可用的元素（如果有必要）。
     *  void	put(E e)
     *           将指定的元素插入此队列的尾部，如果该队列已满，则等待可用的空间。
     *  int	remainingCapacity()
     *           返回在无阻塞的理想情况下（不存在内存或资源约束）此队列能接受的其他元素数量。
     *  boolean	remove(Object o)
     *           从此队列中移除指定元素的单个实例（如果存在）。
     *  int	size()
     *           返回此队列中元素的数量。
     *  E	take()
     *           获取并移除此队列的头部，在元素变得可用之前一直等待（如果有必要）。
     *  Object[]	toArray()
     *           返回一个按适当顺序包含此队列中所有元素的数组。
     * <T> T[]
     * toArray(T[] a)
     *           返回一个按适当顺序包含此队列中所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。
     *  String	toString()
     *           返回此 collection 的字符串表示形式。
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);
        //队列满抛出异常
        arrayBlockingQueue.add(new Object());
        //将队列中可用元素转移到新容器中
        arrayBlockingQueue.drainTo(new ArrayList());
        //队列满返回false
        arrayBlockingQueue.offer(new Object());
        //取出队首元素，但是不删除
        Object peek = arrayBlockingQueue.peek();
        //取出队首元素并删除
        Object poll = arrayBlockingQueue.poll();
        //存入元素，没有空间则进行阻塞
        arrayBlockingQueue.put(new Object());
        //取出元素，没有则等待
        Object take = arrayBlockingQueue.take();
        //转数组
        Object[] objects = arrayBlockingQueue.toArray();
    }
}
class Email implements Serializable {
    private static final long serialVersionUID = 1L;
    //必填参数
    private String[] email;//接收方邮件
    private String subject;//主题
    private String content;//邮件内容
    //选填
    private String template;//模板
    private HashMap<String, String> kvMap;// 自定义参数



    public Email() {
        super();
    }

    public Email(String[] email, String subject, String content, String template,
        HashMap<String, String> kvMap) {
        super();
        this.email = email;
        this.subject = subject;
        this.content = content;
        this.template = template;
        this.kvMap = kvMap;
    }


    public String[] getEmail() {
        return email;
    }
    public void setEmail(String[] email) {
        this.email = email;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTemplate() {
        return template;
    }
    public void setTemplate(String template) {
        this.template = template;
    }
    public HashMap<String, String> getKvMap() {
        return kvMap;
    }
    public void setKvMap(HashMap<String, String> kvMap) {
        this.kvMap = kvMap;
    }
}

class MailQueue {
    //队列大小
    static final int QUEUE_MAX_SIZE   = 1000;

    //static BlockingQueue<Email> blockingQueue = new LinkedBlockingQueue<Email>(QUEUE_MAX_SIZE);

    static ArrayBlockingQueue<Email> blockingQueue=new ArrayBlockingQueue<Email>(100);

    /**
     * 私有的默认构造子，保证外界无法直接实例化
     */
    private MailQueue(){};
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private  static MailQueue queue = new MailQueue();
    }
    //单例队列
    public static MailQueue getMailQueue(){
        return SingletonHolder.queue;
    }
    //生产入队
    public  void  produce(Email mail) throws InterruptedException {
        blockingQueue.put(mail);
    }
    //消费出队
    public  Email consume() throws InterruptedException {
        return blockingQueue.take();
    }
    // 获取队列大小
    public int size() {
        return blockingQueue.size();
    }
}

@Component
class ConsumeMailQueue {
    private static final Logger logger = LoggerFactory.getLogger(ConsumeMailQueue.class);
    @Autowired
    IMailService mailService;

    @PostConstruct
    public void startThread() {
        ExecutorService e = Executors.newFixedThreadPool(2);// 两个大小的固定线程池
        e.submit(new PollMail(mailService));
        e.submit(new PollMail(mailService));
    }

    class PollMail implements Runnable {
        IMailService mailService;

        public PollMail(IMailService mailService) {
            this.mailService = mailService;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Email mail = MailQueue.getMailQueue().consume();
                    if (mail != null) {
                        logger.info("剩余邮件总数:{}",MailQueue.getMailQueue().size());
                        mailService.send(mail);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @PreDestroy
    public void stopThread() {
        logger.info("destroy");
    }
}

class IMailService{
    public void send(Email email){
        System.out.println("send mail"+email.hashCode());
    }
}