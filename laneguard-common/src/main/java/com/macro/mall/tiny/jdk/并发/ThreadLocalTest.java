package com.macro.mall.tiny.jdk.并发;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadLocalTest
 * @Author WB-918966
 * @Date 2022/11/17 11:45
 * @Version 1.0
 * 类 ThreadLocal<T>
 * java.lang.Object
 *   继承者 java.lang.ThreadLocal<T>
 * 直接已知子类：
 * InheritableThreadLocal
 * public class ThreadLocal<T>
 * extends Object
 * 该类提供了线程局部 (thread-local) 变量。这些变量不同于它们的普通对应物，因为访问某个变量（通过其 get 或 set 方法）的每个线程都有自己的局部变量，它独立于变量的初始化副本。ThreadLocal
 * 实例通常是类中的 private static 字段，它们希望将状态与某一个线程（例如，用户 ID 或事务 ID）相关联。
 **/
public class ThreadLocalTest {
    /**
     * 构造方法摘要
     * ThreadLocal()
     *           创建一个线程本地变量。
     *
     * 方法摘要
     *  T	get()
     *           返回此线程局部变量的当前线程副本中的值。
     * protected  T	initialValue()
     *           返回此线程局部变量的当前线程的“初始值”。
     *  void	remove()
     *           移除此线程局部变量当前线程的值。
     *  void	set(T value)
     *           将此线程局部变量的当前线程副本中的值设置为指定值。
     */
    //用泛型构造器赋初始值
    public static ThreadLocal<Long> x = new ThreadLocal<Long>(){
        @Override
        protected Long initialValue() {
            System.out.println("Initial Value run...");
            return Thread.currentThread().getId(); //拿到当前线程ID
        }
    };

    public static void main(String[] argv){
        new Thread(){
            @Override
            public void run(){
                System.out.println(x.get());
            }
        }.start();
        System.out.println(x.get());

        new Thread() {
            @Override
            public void run() {
                System.out.println(x.get());
            }
        }.start();
        x.set(6l);
        System.out.println(x.get());
    }


    /**
     * ThreadLocal提供线程局部变量；开箱即用开销小，可以代替多线程访问共享变量时需要上锁的需要。
     * 方法参数或计算结果存储,在一次请求处理时用到（即在一个线程中完成操作），避免参数传递的麻烦
     *
     * 内存泄露
     * 如果一个ThreadLocal不被使用，那么实际上set,remove,rehash方法也不会被调用，如果同时线程又不停止，那么调用链就一直存在，那么就导致了value的内存泄露。
     * 调用remove方法，就会删除对应的Entry对象，可以避免内存泄露，所以使用完ThreadLocal之后，应该调用remove方法。
     */
}


/**
 * 典型场景1：每个线程需要一个独享的对象
 * 描述：     利用ThreadLocal，给每个线程分配自己的dateFormat对象，保证了线程安全，高效利用内存
 */
class ThreadLocalNormalUsage05 {

    public static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalNormalUsage05().date(finalI);
                    System.out.println(date);
                }
            });
        }
        threadPool.shutdown();
    }

    public String date(int seconds) {
        //参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        //        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormat = ThreadSafeFormatter.dateFormatThreadLocal2.get();
        return dateFormat.format(date);
    }

    static class ThreadSafeFormatter {

        public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
            @Override
            protected SimpleDateFormat initialValue() {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }
        };

        public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal2 = ThreadLocal
            .withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
}
