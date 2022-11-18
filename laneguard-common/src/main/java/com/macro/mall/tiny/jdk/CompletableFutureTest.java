package com.macro.mall.tiny.jdk;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import lombok.SneakyThrows;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName CompletableFuture
 * @Author WB-918966
 * @Date 2022/10/20 18:31
 * @Version 1.0
 **/
public class CompletableFutureTest {

    //可以自定义线程池
    @Autowired
    private ExecutorService executor = Executors.newCachedThreadPool();
    //单任务处理
    @Test
    public void test1(){
        //runAsync的使用
        CompletableFuture<Void> runFuture = CompletableFuture.runAsync(() -> System.out.println("run,关注公众号:捡田螺的小男孩"), executor);
        //supplyAsync的使用
        CompletableFuture<String> supplyFuture = CompletableFuture.supplyAsync(() -> {
            System.out.print("supply,关注公众号:捡田螺的小男孩");
            return "捡田螺的小男孩"; }, executor);
        //runAsync的future没有返回值，输出null
        System.out.println(runFuture.join());
        //supplyAsync的future，有返回值
        System.out.println(supplyFuture.join());
        executor.shutdown(); // 线程池需要关闭
    }

    @SneakyThrows
    @Test
    public void test2(){
        //先执行个CompletableFuture方法任务
        //接着执行第二个任务
        CompletableFuture<String> orgFuture = CompletableFuture.supplyAsync(
            ()->{
                System.out.println("先执行个CompletableFuture方法任务");
                return "捡田螺的小男孩";
            }
        );
        //执行第二个任务，第二个任务没有返回值，也不需要第一个任务传参数
        //与第一个任务共用一个线程
        CompletableFuture thenRunFuture = orgFuture.thenRun(() -> {
            System.out.println("接着执行第二个任务");
        });
        //自己使用另外一个线程
        CompletableFuture thenRunFuture2 = orgFuture.thenRunAsync(() -> {
            System.out.println("接着执行第二个任务");
        });

        System.out.println(thenRunFuture.get(10, TimeUnit.SECONDS));
    }

    @SneakyThrows
    @Test
    public void test3(){
        //接受第一个任务的参数，执行第二个任务，第二个任务没有返回值
        CompletableFuture<String> orgFuture = CompletableFuture.supplyAsync(
            ()->{
                System.out.println("原始CompletableFuture方法任务");
                return "捡田螺的小男孩";
            }
        );

        CompletableFuture thenAcceptFuture = orgFuture.thenAccept((a) -> {
            if ("捡田螺的小男孩".equals(a)) {
                System.out.println("关注了");
            }
            System.out.println("先考虑考虑");
        });

        System.out.println(thenAcceptFuture.get());
    }

    @SneakyThrows
    @Test
    public void test4(){
        //第一个任务运行完后，返回值会作为参数传进第二个任务，第二个任务是有返回值的
        CompletableFuture<String> orgFuture = CompletableFuture.supplyAsync(
            ()->{
                System.out.println("原始CompletableFuture方法任务");
                return "捡田螺的小男孩";
            }
        );

        CompletableFuture<String> thenApplyFuture = orgFuture.thenApply((a) -> {
            if ("捡田螺的小男孩".equals(a)) {
                return "关注了";
            }
            return "先考虑考虑";
        });

        System.out.println(thenApplyFuture.get());
    }

    @SneakyThrows
    @Test
    public void test5(){
        //第一个任务如果有异常，会被exceptionally捕获，然后传入到回调方法中
        CompletableFuture<String> orgFuture = CompletableFuture.supplyAsync(
            ()->{
                System.out.println("当前线程名称：" + Thread.currentThread().getName());
                throw new RuntimeException();
            }
        );

        CompletableFuture<String> exceptionFuture = orgFuture.exceptionally((e) -> {
            e.printStackTrace();
            return "你的程序异常啦";
        });

        System.out.println(exceptionFuture.get());
    }

    @SneakyThrows
    @Test
    public void test6(){
        //whenComplete方法表示，某个任务执行完成后，执行的回调方法，无返回值
        //whenComplete方法返回的CompletableFuture的result是上个任务的结果
        CompletableFuture<String> orgFuture = CompletableFuture.supplyAsync(
            ()->{
                System.out.println("当前线程名称：" + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "捡田螺的小男孩";
            }
        );

        CompletableFuture<String> rstFuture = orgFuture.whenComplete((a, throwable) -> {
            System.out.println("当前线程名称：" + Thread.currentThread().getName());
            System.out.println("上个任务执行完啦，还把" + a + "传过来");
            if ("捡田螺的小男孩".equals(a)) {
                System.out.println("666");
            }
            System.out.println("233333");
        });

        System.out.println(rstFuture.get());
        //handle方法表示，某个任务执行完成后，执行回调方法，并且是有返回值的;
        // 并且handle方法返回的CompletableFuture的result是回调方法执行的结果。
        CompletableFuture<String> rstFuture2 = orgFuture.handle((a, throwable) -> {

            System.out.println("上个任务执行完啦，还把" + a + "传过来");
            if ("捡田螺的小男孩".equals(a)) {
                System.out.println("666");
                return "关注了";
            }
            System.out.println("233333");
            return null;
        });

        System.out.println(rstFuture.get());
    }

    //多任务组合处理
    @SneakyThrows
    @Test
    public void test7(){
        //两个任务按照and关系组合
        //第一和第二任务都执行完，将结果传入第三个任务
        //thenCombine / thenAcceptBoth / runAfterBoth都表示：
        // 将两个CompletableFuture组合起来，只有这两个都正常执行完了，才会执行某个任务。
        ExecutorService executor = Executors.newFixedThreadPool(10);

        CompletableFuture<String> first = CompletableFuture.completedFuture("个异步任务");

        CompletableFuture<String> future = CompletableFuture
            //第二个异步任务
            .supplyAsync(() -> "第二个异步任务", executor)
            // (w, s) -> System.out.println(s) 是第三个任务
            .thenCombineAsync(first, (s, w) -> {
                System.out.println(w);
                System.out.println(s);
                return "两个异步任务的组合";
            }, executor);
        System.out.println(future.join());
        executor.shutdown();
        //所有任务完成才能执行下一步
        CompletableFuture<Void> a = CompletableFuture.runAsync(()->{
            System.out.println("我执行完了");
        });
        CompletableFuture<Void> b = CompletableFuture.runAsync(() -> {
            System.out.println("我也执行完了");
        });
        CompletableFuture<Void> allOfFuture = CompletableFuture.allOf(a, b).whenComplete((m,k)->{
            System.out.println("finish");
        });
    }

    @SneakyThrows
    @Test
    public void test8(){
        //任务按照or进行组合
        CompletableFuture<String> first = CompletableFuture.supplyAsync(()->{
            try{

                Thread.sleep(2000L);
                System.out.println("执行完个异步任务");}
            catch (Exception e){
                return "个任务异常";
            }
            return "个异步任务";
        });
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CompletableFuture<Void> future = CompletableFuture
            //第二个异步任务
            .supplyAsync(() -> {
                    System.out.println("执行完第二个任务");
                    return "第二个任务";}
                , executor)
            //第三个任务
            .acceptEitherAsync(first, System.out::println, executor);

        executor.shutdown();

        //任意一个任务完成了可以执行下一步
        CompletableFuture<Void> a = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我执行完了");
        });
        CompletableFuture<Void> b = CompletableFuture.runAsync(() -> {
            System.out.println("我也执行完了");
        });
        CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(a, b).whenComplete((m,k)->{
            System.out.println("finish");
            //            return "捡田螺的小男孩";
        });
        anyOfFuture.join();
    }


}
