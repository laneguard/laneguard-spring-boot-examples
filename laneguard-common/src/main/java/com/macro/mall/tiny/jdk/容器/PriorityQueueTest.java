package com.macro.mall.tiny.jdk.容器;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName PriorityQueueTest
 * @Author WB-918966
 * @Date 2022/11/4 10:46
 * @Version 1.0
 * Queue是一个先进先出（FIFO）的队列。
 * PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，对PriorityQueue调用remove()或poll()方法，返回的总是优先级最高的元素。
 * 放入PriorityQueue的元素，必须实现Comparable接口，PriorityQueue会根据元素的排序顺序决定出队的优先级。
 *
 * 如果我们要放入的元素并没有实现Comparable接口怎么办？
 * PriorityQueue允许我们提供一个Comparator对象来判断两个元素的顺序。
 **/
public class PriorityQueueTest {
    /**
     * java.util.PriorityQueue 类是基于优先级堆的无界优先级队列。以下是有关的PriorityQueue的要点：
     *
     * 优先级队列中的元素根据其自然顺序进行排序，或者按照队列构造时提供的Comparator，这取决于使用的构造方法。
     *
     * 优先级队列不允许null元素。
     *
     * 优先级队列依靠自然顺序也不允许插入不可比较的对象。
     *
     * 类声明
     * 以下是java.util.PriorityQueue类的声明：
     *
     * public class PriorityQueue<E>
     *    extends AbstractQueue<E>
     *       implements Serializable
     * 参数
     * 以下是java.util.PriorityQueue类的参数：
     *
     * E -- 这是在这个集合所持元素的类型。
     *
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	PriorityQueue()
     * 这将创建一个具有默认初始容量(11)，根据其自然顺序对其元素PriorityQueue。
     * 2	PriorityQueue(Collection<? extends E> c)
     * 这将创建一个包含指定集合中的元素的PriorityQueue。
     * 3	PriorityQueue(int initialCapacity)
     * 这将创建与根据其自然顺序对其元素指定的初始容量创建一个PriorityQueue。
     * 4	PriorityQueue(int initialCapacity, Comparator<? super E> comparator)
     * 这将创建与根据指定的比较器对其元素指定的初始容量创建一个PriorityQueue。
     * 5	PriorityQueue(PriorityQueue<? extends E> c)
     * 这将创建一个包含指定优先级队列中的元素一个PriorityQueue。
     * 6	PriorityQueue(SortedSet<? extends E> c)
     * 这将创建一个包含指定有序set的元素一个PriorityQueue。类方法
     * S.N.	方法 & 描述
     * 1	boolean add(E e)
     * 此方法将指定元素插入此优先级队列。
     * 2	void clear()
     * 此方法删除所有来自此优先级队列中的元素。
     * 3	Comparator<? super E> comparator()
     * 此方法返回用于排序在此队列中，或者为null的元素;如果此队列根据其元素的自然顺序进行排序的比较器。
     * 4	boolean contains(Object o)
     * 如果此队列包含指定的元素，此方法返回true。
     * 5	Iterator<E> iterator()
     * 此方法返回一个迭代器在此队列中的元素。
     * 6	boolean offer(E e)
     * 此方法将指定元素插入此优先级队列。
     * 7	E peek()
     * 此方法检索，但是不移除此队列的头，如果此队列为空，则返回null。
     * 8	E poll()
     * 此方法检索并移除此队列的头，如果此队列为空，则返回null。
     * 9	boolean remove(Object o)
     * 这个方法从队列中移除指定元素的单个实例(如果存在)。
     * 10	int size()
     * 此方法返回这个集合中元素的个数。
     * 11	Object[] toArray()
     * 这个方法返回一个包含此队列所有元素的数组。
     * 12	<T> T[] toArray(T[] a)
     * 这个方法返回一个包含此队列所有元素的数组;返回数组的运行时类型是指定数组。
     */
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}

class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
            return u1.number.compareTo(u2.number);
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}