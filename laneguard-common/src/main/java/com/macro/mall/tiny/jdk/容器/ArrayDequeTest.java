package com.macro.mall.tiny.jdk.容器;

/**
 * @ClassName ArrayDequeTest
 * @Author WB-918966
 * @Date 2022/11/2 09:56
 * @Version 1.0
 * 类 ArrayDeque<E>
 * java.lang.Object
 *   继承者 java.util.AbstractCollection<E>
 *       继承者 java.util.ArrayDeque<E>
 *
 * 所有已实现的接口：
 * Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, Queue<E>
 * public class ArrayDeque<E>
 * extends AbstractCollection<E>
 * implements Deque<E>, Cloneable, Serializable
 *
 * Deque 接口的大小可变数组的实现。数组双端队列没有容量限制；它们可根据需要增加以支持使用。它们不是线程安全的；在没有外部同步时，它们不支持多个线程的并发访问。
 * 禁止 null 元素。此类很可能在用作堆栈时快于
 * Stack，在用作队列时快于 LinkedList。
 *
 * 大多数 ArrayDeque 操作以摊销的固定时间运行。异常包括 remove、removeFirstOccurrence、removeLastOccurrence、contains、iterator.remove()
 * 以及批量操作，它们均以线性时间运行。
 *
 * 此类的 iterator 方法返回的迭代器是快速失败 的：如果在创建迭代器后的任意时间通过除迭代器本身的 remove 方法之外的任何其他方式修改了双端队列，则迭代器通常将抛出
 * ConcurrentModificationException。因此，面对并发修改，迭代器很快就会完全失败，而不是冒着在将来不确定的时刻任意发生不确定行为的风险。
 *
 * 注意，迭代器的快速失败行为不能得到保证，一般来说，存在不同步的并发修改时，不可能作出任何坚决的保证。快速失败迭代器尽最大努力抛出
 * ConcurrentModificationException。因此，编写依赖于此异常的程序是错误的，正确做法是：迭代器的快速失败行为应该仅用于检测 bug。
 *
 * 此类及其迭代器实现 Collection 和 Iterator 接口的所有可选 方法。
 *
 * 此类是 Java Collections Framework 的成员。
 **/
public class ArrayDequeTest {
    /**
     * 构造方法摘要
     * ArrayDeque()
     *           构造一个初始容量能够容纳 16 个元素的空数组双端队列。
     * ArrayDeque(Collection<? extends E> c)
     *           构造一个包含指定 collection 的元素的双端队列，这些元素按 collection 的迭代器返回的顺序排列。
     * ArrayDeque(int numElements)
     *           构造一个初始容量能够容纳指定数量的元素的空数组双端队列。
     *
     * 方法摘要
     *  boolean	add(E e)
     *           将指定元素插入此双端队列的末尾。
     *  void	addFirst(E e)
     *           将指定元素插入此双端队列的开头。
     *  void	addLast(E e)
     *           将指定元素插入此双端队列的末尾。
     *  void	clear()
     *           从此双端队列中移除所有元素。
     *  ArrayDeque<E>	clone()
     *           返回此双端队列的副本。
     *  boolean	contains(Object o)
     *           如果此双端队列包含指定元素，则返回 true。
     *  Iterator<E>	descendingIterator()
     *           返回以逆向顺序在此双端队列的元素上进行迭代的迭代器。
     *  E	element()
     *           获取，但不移除此双端队列所表示的队列的头。
     *  E	getFirst()
     *           获取，但不移除此双端队列的第一个元素。
     *  E	getLast()
     *           获取，但不移除此双端队列的最后一个元素。
     *  boolean	isEmpty()
     *           如果此双端队列未包含任何元素，则返回 true。
     *  Iterator<E>	iterator()
     *           返回在此双端队列的元素上进行迭代的迭代器。
     *  boolean	offer(E e)
     *           将指定元素插入此双端队列的末尾。
     *  boolean	offerFirst(E e)
     *           将指定元素插入此双端队列的开头。
     *  boolean	offerLast(E e)
     *           将指定元素插入此双端队列的末尾。
     *  E	peek()
     *           获取，但不移除此双端队列所表示的队列的头；如果此双端队列为空，则返回 null。
     *  E	peekFirst()
     *           获取，但不移除此双端队列的第一个元素；如果此双端队列为空，则返回 null。
     *  E	peekLast()
     *           获取，但不移除此双端队列的最后一个元素；如果此双端队列为空，则返回 null。
     *  E	poll()
     *           获取并移除此双端队列所表示的队列的头（换句话说，此双端队列的第一个元素）；如果此双端队列为空，则返回 null。
     *  E	pollFirst()
     *           获取并移除此双端队列的第一个元素；如果此双端队列为空，则返回 null。
     *  E	pollLast()
     *           获取并移除此双端队列的最后一个元素；如果此双端队列为空，则返回 null。
     *  E	pop()
     *           从此双端队列所表示的堆栈中弹出一个元素。
     *  void	push(E e)
     *           将元素推入此双端队列所表示的堆栈。
     *  E	remove()
     *           获取并移除此双端队列所表示的队列的头。
     *  boolean	remove(Object o)
     *           从此双端队列中移除指定元素的单个实例。
     *  E	removeFirst()
     *           获取并移除此双端队列第一个元素。
     *  boolean	removeFirstOccurrence(Object o)
     *           移除此双端队列中第一次出现的指定元素（当从头部到尾部遍历双端队列时）。
     *  E	removeLast()
     *           获取并移除此双端队列的最后一个元素。
     *  boolean	removeLastOccurrence(Object o)
     *           移除此双端队列中最后一次出现的指定元素（当从头部到尾部遍历双端队列时）。
     *  int	size()
     *           返回此双端队列中的元素数。
     *  Object[]	toArray()
     *           返回一个以恰当顺序包含此双端队列所有元素的数组（从第一个元素到最后一个元素）。
     * <T> T[]
     * toArray(T[] a)
     *           返回一个以恰当顺序包含此双端队列所有元素的数组（从第一个元素到最后一个元素）；返回数组的运行时类型是指定数组的运行时类型。
     */

    /**
     * ArrayDeque是Deque接口的一个实现，使用了可变数组，所以没有容量上的限制。
     * 同时，ArrayDeque是线程不安全的，在没有外部同步的情况下，不能再多线程环境下使用。
     * ArrayDeque是Deque的实现类，可以作为栈来使用，效率高于Stack；
     * 也可以作为队列来使用，效率高于LinkedList。
     * 需要注意的是，ArrayDeque不支持null值。
     */



}
