package com.macro.mall.tiny.jdk.容器;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName LinkedHashSetTest
 * @Author WB-918966
 * @Date 2022/11/4 10:31
 * @Version 1.0
 * 类HashSet和LinkedHashSet都是接口Set的实现，两者都不能保存重复的数据。主要区别是HashSet不保证集合中元素的顺序，即不能保证迭代的顺序与插入的顺序一致。
 *
 * 而LinkedHashSet按照元素插入的顺序进行迭代，即迭代输出的顺序与插入的顺序保持一致。
 **/
public class LinkedHashSetTest {
    /**
     * java.util.LinkedHashSet 类是一个哈希表和链接列表实现Set接口，具有可预知的迭代顺序。以下是关于LinkedHashSet的要点：
     *
     * 这个类提供了所有可选set操作，并且允许null元素。
     *
     * 类声明
     * 以下是java.util.LinkedHashSet类的声明：
     *
     * public class LinkedHashSet<E>
     *    extends HashSet<E>
     *      implements Set<E>, Cloneable, Serializable
     * 参数
     * 以下是java.util.LinkedHashSet类中的参数：
     *
     * E -- 这是此set维护元素的类型。
     *
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	LinkedHashSet()
     * 这种构造一个新的空链接哈希集合具有默认初始容量（16）和加载因子（0.75）。
     * 2	LinkedHashSet(Collection<\? extends E> c)
     * 这构造了一个新的链接哈希集合具有相同元素的指定集合。
     * 3	LinkedHashSet(int initialCapacity)
     * 这种构造一个新的空链接哈希集合具有指定初始容量和默认加载因子（0.75）。
     * 4	LinkedHashSet(int initialCapacity, float loadFactor)
     * 这种构造一个新的空链接哈希集合具有指定初始容量和加载因子。
     */

    // HashSet不保证集合的迭代顺序；也许在某些时间迭代的顺序与插入顺序一致，但是不保证该顺序恒久不变。
    private static Set<Integer> mSetInt = new HashSet<Integer>();
    private static Set<String> mSetString = new HashSet<String>();

    // LinkedHashSet按照元素插入的顺序进行迭代，LinkedHashSet不是线程安全的。
    private static Set<Integer> mLinkedSetInt = Collections.synchronizedSet(new LinkedHashSet<Integer>());
    private static Set<String> mLinkedSetString = Collections.synchronizedSet(new LinkedHashSet<String>());

    /**
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            mSetInt.add(i);
            mSetString.add(String.valueOf(i));
            mLinkedSetInt.add(i);
            mLinkedSetString.add(String.valueOf(i));
        }

        Iterator<Integer> setIntIt = mSetInt.iterator();
        System.out.println("The sequence of HashSet for Integer:");
        while(setIntIt.hasNext()) {
            System.out.print(setIntIt.next() + " ");
        }
        System.out.println();

        System.out.println("The sequence of HashSet for String:");
        Iterator<String> setStringIt = mSetString.iterator();
        while(setStringIt.hasNext()) {
            System.out.print(setStringIt.next() + " ");
        }
        System.out.println();

        System.out.println("The sequence of LinkedHashSet for Integer:");
        Iterator<Integer> linkedSetIntIt = mLinkedSetInt.iterator();
        while(linkedSetIntIt.hasNext()) {
            System.out.print(linkedSetIntIt.next() + " ");
        }
        System.out.println();

        System.out.println("The sequence of LinkedHashSet for String:");
        Iterator<String> linkedSetStringIt = mLinkedSetString.iterator();
        while(linkedSetStringIt.hasNext()) {
            System.out.print(linkedSetStringIt.next() + " ");
        }
        System.out.println();
    }

}
