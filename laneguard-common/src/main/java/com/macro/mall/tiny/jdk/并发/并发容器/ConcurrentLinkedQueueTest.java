package com.macro.mall.tiny.jdk.并发.并发容器;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @ClassName ConcurrentLinkedQueueTest
 * @Author WB-918966
 * @Date 2022/11/9 14:37
 * @Version 1.0
 * 类 ConcurrentLinkedQueue<E>
 * java.lang.Object
 *   继承者 java.util.AbstractCollection<E>
 *       继承者 java.util.AbstractQueue<E>
 *           继承者 java.util.concurrent.ConcurrentLinkedQueue<E>
 * 类型参数：
 * E - 在此 collection 中保持的元素类型
 * 所有已实现的接口：
 * Serializable, Iterable<E>, Collection<E>, Queue<E>
 * public class ConcurrentLinkedQueue<E>
 * extends AbstractQueue<E>
 * implements Queue<E>, Serializable
 * 一个基于链接节点的无界线程安全队列。此队列按照 FIFO（先进先出）原则对元素进行排序。
 * 队列的头部 是队列中时间最长的元素。队列的尾部是队列中时间最短的元素。
 * 新的元素插入到队列的尾部，队列获取操作从队列头部获得元素。
 * 当多个线程共享访问一个公共 collection 时，ConcurrentLinkedQueue 是一个恰当的选择。
 * 此队列不允许使用 null 元素。
 **/
public class ConcurrentLinkedQueueTest {
    /**
     * 构造方法摘要
     * ConcurrentLinkedQueue()
     *           创建一个最初为空的 ConcurrentLinkedQueue。
     * ConcurrentLinkedQueue(Collection<? extends E> c)
     *           创建一个最初包含给定 collection 元素的 ConcurrentLinkedQueue，按照此 collection 迭代器的遍历顺序来添加元素。
     *
     * 方法摘要
     *  boolean	add(E e)
     *           将指定元素插入此队列的尾部。
     *  boolean	contains(Object o)
     *           如果此队列包含指定元素，则返回 true。
     *  boolean	isEmpty()
     *           如果此队列不包含任何元素，则返回 true。
     *  Iterator<E>	iterator()
     *           返回在此队列元素上以恰当顺序进行迭代的迭代器。
     *  boolean	offer(E e)
     *           将指定元素插入此队列的尾部。
     *  E	peek()
     *           获取但不移除此队列的头；如果此队列为空，则返回 null。
     *  E	poll()
     *           获取并移除此队列的头，如果此队列为空，则返回 null。
     *  boolean	remove(Object o)
     *           从队列中移除指定元素的单个实例（如果存在）。
     *  int	size()
     *           返回此队列中的元素数量。
     *  Object[]	toArray()
     *           返回以恰当顺序包含此队列所有元素的数组。
     * <T> T[]
     * toArray(T[] a)
     *           返回以恰当顺序包含此队列所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。
     */
    public static void main(String[] args) {
        //线程安全队列
        ConcurrentLinkedQueue clq = new ConcurrentLinkedQueue();
        Object o = new Object();
        //将指定元素插入此队列的尾部
        clq.add(o);
    }
}
