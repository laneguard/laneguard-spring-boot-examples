package com.macro.mall.tiny.jdk.容器;

/**
 * @ClassName ArrayListTest
 * @Author WB-918966
 * @Date 2022/11/2 10:01
 * @Version 1.0
 * 它实现了所有可选的列表操作，并且还允许所有元素，包括空值null。
 *
 * 它提供了一些方法来操作内部用来存储列表的数组的大小。
 *
 * 相较于LinkedList实现的常数因子较低。
 * public class ArrayList<E>
 *    extends AbstractList<E>
 *       implements List<E>, RandomAccess, Cloneable, Serializable
 **/
public class ArrayListTest {
    /**
     * 1	ArrayList()
     * 此构造函数用于创建一个空的列表，包含10个元素的初始容量。
     * 2	ArrayList(Collection<\? extends E> c)
     * 此构造函数用于创建一个包含指定集合的元素的列表。
     * 3	ArrayList(int initialCapacity)
     * 此构造函数用于创建一个空列表的初始容量。
     */

    /**
     * 1	boolean add(E e)
     * 此方法将指定元素追加到此列表的末尾。
     * 2	void add(int index, E element)
     * 此方法将在此列表中指定位置的指定元素。
     * 3	boolean addAll(Collection<\? extends E> c)
     * 此方法会将所有指定集合中的元素添加到此列表的结尾，因为它们是由指定collection的迭代器返回的顺序
     * 4	boolean addAll(int index, Collection<\? extends E> c)
     * 此方法将所有指定集合中的元素插入此列表，在指定的位置开始。
     * 5	void clear()
     * 此方法删除所有来自此列表中的元素。
     * 6	Object clone()
     * 这个方法返回当前ArrayList实例的浅表副本。
     * 7	boolean contains(Object o)
     * 如果此列表包含指定的元素，此方法返回true。
     * 8	void ensureCapacity(int minCapacity)
     * 增加此ArrayList的容量。
     * 9	E get(int index)
     * 此方法返回的元素在此列表中的指定位置。
     * 10	int indexOf(Object o)
     * 此方法返回指定元素的第一个匹配项的索引在此列表中，或者如果此列表中不包含该元素返回-1。
     * 11	boolean isEmpty()
     * 如果此列表不包含元素，此方法返回true。
     * 12	int lastIndexOf(Object o)
     * 此方法返回指定元素的最后一个匹配项的索引在此列表中，或者-1，如果此列表中不包含该元素。
     * 13	E remove(int index)
     * 此方法删除的元素在此列表中的指定位置。
     * 14	boolean remove(Object o)
     * 此方法从该列表中首次出现的指定元素，如果它存在。
     * 15	protected void removeRange(int fromIndex, int toIndex)
     * 此方法从该列表中删除所有的索引fromIndex（包括）与toIndex（不包括）之间的元素。
     * 16	E set(int index, E element)
     * 此方法取代在与指定元素在此列表中指定位置的元素。
     * 17	int size()
     * 此方法返回此列表中的元素数。
     * 18	Object[] toArray()
     * 此方法返回一个包含所有在此列表中正确的序列中元素的数组（从第一个到最后一个元素）。
     * 19	<T> T[] toArray(T[] a)
     * 此方法返回一个包含所有在此列表中正确的序列中的元素（从第一个到最后一个元素）数组;返回数组的运行时类型是指定数组。
     * 20	void trimToSize()
     * 此方法修整此ArrayList实例的是列表的当前大小的容量。
     */
}
