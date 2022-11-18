package com.macro.mall.tiny.jdk.并发;

/**
 * @ClassName AbstractExecutorServiceTest
 * @Author WB-918966
 * @Date 2022/11/7 17:59
 * @Version 1.0
 * 提供 ExecutorService 执行方法的默认实现
 * 类 AbstractExecutorService
 * java.lang.Object
 *   继承者 java.util.concurrent.AbstractExecutorService
 * 所有已实现的接口：
 * Executor, ExecutorService
 * 直接已知子类：
 * ThreadPoolExecutor
 **/
public class AbstractExecutorServiceTest {

    /**
     * 构造方法摘要
     * AbstractExecutorService()
     *
     *
     * 方法摘要
     * <T> List<Future<T>>
     * invokeAll(Collection<\? extends Callable<T>> tasks)
     *           执行给定的任务，当所有任务完成时，返回保持任务状态和结果的 Future 列表。
     * <T> List<Future<T>>
     * invokeAll(Collection<\? extends Callable<T>> tasks, long timeout, TimeUnit unit)
     *           执行给定的任务，当所有任务完成或超时期满时（无论哪个首先发生），返回保持任务状态和结果的 Future 列表。
     * <T> T
     * invokeAny(Collection<\? extends Callable<T>> tasks)
     *           执行给定的任务，如果某个任务已成功完成（也就是未抛出异常），则返回其结果。
     * <T> T
     * invokeAny(Collection<\? extends Callable<T>> tasks, long timeout, TimeUnit unit)
     *           执行给定的任务，如果在给定的超时期满前某个任务已成功完成（也就是未抛出异常），则返回其结果。
     * protected
     * <T> RunnableFuture<T>
     * newTaskFor(Callable<T> callable)
     *           为给定可调用任务返回一个 RunnableFuture。
     * protected
     * <T> RunnableFuture<T>
     * newTaskFor(Runnable runnable, T value)
     *           为给定可运行任务和默认值返回一个 RunnableFuture。
     * <T> Future<T>
     * submit(Callable<T> task)
     *           提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。
     *  Future<\?>	submit(Runnable task)
     *           提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
     * <T> Future<T>
     * submit(Runnable task, T result)
     *           提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
     */

    public static void main(String[] args) {

    }
}
