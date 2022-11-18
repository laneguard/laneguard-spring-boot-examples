package com.macro.mall.tiny.jdk.容器;

/**
 * @ClassName LinkedListTest
 * @Author WB-918966
 * @Date 2022/11/4 10:35
 * @Version 1.0
 * LinkedList 实现了Queue接口，能当作队列使用。
 * LinkedList 实现了Deque 接口，即能将LinkedList当作双端队列使用。
 **/
public class LinkedListTest {
    /**
     * java.util.LinkedList 类操作执行，我们可以预期这是一个双向链表。操作的索引列表会遍历从一开始或结束时，取其靠近指定索引的列表。
     *
     * 类声明
     * 以下是java.util.LinkedList类的声明：
     *
     * public class LinkedList<E>
     *    extends AbstractSequentialList<E>
     *       implements List<E>, Deque<E>, Cloneable, Serializable
     * 参数
     * 以下是java.util.LinkedList类的参数：
     *
     * E -- 这是在这个集合所持元素的类型。
     *
     * 字段域
     * 从java.util.AbstractLis类t的字段继承。
     *
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	LinkedList()
     * 这种构造构造一个空的列表。
     * 2	LinkedList(Collection<\? extends E> c)
     * 这个构造一个包含指定集合中的元素的列表，它们被集合的迭代器返回的顺序。类方法
     * S.N.	方法 & 描述
     * 1	boolean add(E e)
     * 这种方法将指定元素追加到此列表的末尾。
     * 2	void add(int index, E element)
     * 此方法将在此列表中指定位置的指定元素。
     * 3	boolean addAll(Collection<\? extends E> c)
     * 此方法会将所有指定集合中的元素添加到此列表的结尾，因为它们是由指定collection的迭代器返回的顺序。
     * 4	boolean addAll(int index, Collection<\? extends E> c)
     * 此方法将所有指定集合中的元素插入此列表，开始在指定的位置。
     * 5	void addFirst(E e)
     * 此方法返回插入指定的元素，在这个列表的开头..
     * 6	void addLast(E e)
     * 此方法返回指定元素追加到此列表的末尾。
     * 7	void clear()
     * 此方法删除所有来自此列表中的元素。
     * 8	Object clone()
     * 此方法返回返回此LinkedList的浅表副本。
     * 9	boolean contains(Object o)
     * 如果此列表包含指定的元素，此方法返回true。
     * 10	Iterator<E> descendingIterator()
     * 此方法返回一个迭代器在此双端队列以逆向顺序的元素。
     * 11	E element()
     * 此方法检索，但是不移除此列表的头（第一个元素）。
     * 12	E get(int index)
     * 此方法返回的元素在此列表中的指定位置。
     * 13	E getFirst()
     * 此方法返回此列表中的第一个元素。
     * 14	E getLast()
     * 此方法返回此列表中的最后一个元素。
     * 15	int indexOf(Object o)
     * 这个方法返回指定元素的第一个匹配项的索引在此列表中，或者-1，如果此列表中不包含该元素。
     * 16	int lastIndexOf(Object o)
     * 这个方法返回指定元素的最后一个匹配项的索引在此列表中，或者-1，如果此列表中不包含该元素。
     * 17	ListIterator<E> listIterator(int index)
     * 此方法返回一个列表迭代器在此列表中的元素（按适当顺序），从列表中的指定位置。
     * 18	boolean offer(E e)
     * 此方法将指定的元素到此列表的末尾（最后一个元素）。
     * 19	boolean offerFirst(E e)
     * 此方法将指定元素在此列表的前面。
     * 20	boolean offerLast(E e)
     * 此方法将指定的元素，在这个列表的末尾。
     * 21	E peek()
     * 此方法检索，但是不移除此列表的头（第一个元素）。
     * 22	E peekFirst()
     * 此方法检索，但是不移除此列表的第一个元素，或者如果此列表为空，则返回null。
     * 23	E peekLast()
     * 此方法检索，但是不移除此列表的最后一个元素，或者如果此列表为空，则返回null。
     * 24	E poll()
     * 此方法检索并移除此列表的头（第一个元素）。
     * 26	E pollFirst()
     * 此方法检索并移除此列表的第一个元素，或者如果此列表为空，则返回null。
     * 27	E pollLast()
     * 此方法检索并移除此列表的最后一个元素，或者如果此列表为空，则返回null。
     * 28	E pop()
     * 这个方法从该列表所表示的堆栈弹出一个元素。
     * 29	void push(E e)
     * 这种方法将元素推入此列表所表示的堆栈。
     * 30	E remove()
     * 此方法检索并移除此列表的头（第一个元素）。
     * 31	E remove(int index)
     * 此方法删除的元素在此列表中指定位置.
     * 32	boolean remove(Object o)
     * 此方法从该列表中首次出现的指定元素，如果它存在。
     * 33	E removeFirst()
     * 此方法删除并返回此列表的第一个元素。
     * 34	boolean removeFirstOccurrence(Object o)
     * 此方法删除指定元素第一次出现在该列表中（遍历从头部到尾部列表时）。
     * 35	E removeLast()
     * 此方法删除并返回此列表的最后一个元素。
     * 36	boolean removeLastOccurrence(Object o)
     * 此方法删除指定元素最后一次出现在该列表中（遍历从头部到尾部列表时）。
     * 37	E set(int index, E element)
     * 这种方法取代在与指定的元素在此列表中指定位置的元素。
     * 38	int size()
     * 此方法返回此列表中的元素数。
     * 39	Object[] toArray()
     * 这个方法返回一个包含所有在此列表中正确的序列中元素的数组（从第一个到最后一个元素）。
     * 40	<T> T[] toArray(T[] a)
     * 这个方法返回一个包含所有在此列表中正确的序列中的元素（从第一个到最后一个元素）一个数组，返回数组的运行时类型是指定数组的。
     */
}
