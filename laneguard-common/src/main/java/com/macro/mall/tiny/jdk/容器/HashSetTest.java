package com.macro.mall.tiny.jdk.容器;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName HashSetTest
 * @Author WB-918966
 * @Date 2022/11/3 17:28
 * @Version 1.0
 * 不保证迭代顺序，去重
 **/
public class HashSetTest {
    /**
     * java.util.HashSet 类实现Set接口，由哈希表支持。以下是关于HashSet的要点：
     *
     * 这个类不做任何担保，以集合的迭代顺序;特别是，它不保证该顺序将继续随时间恒定。
     *
     * 此类允许null元素。
     *
     * 类声明
     * 以下是java.util.HashSet类的声明：
     *
     * public class HashSet<E>
     * extends AbstractSet<E>
     * implements Set<E>, Cloneable, Serializable
     * 参数
     * 以下是java.util.HashSet类的参数：
     *
     * E -- 这是此set保留元素的类型。
     *
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	HashSet()
     * 这种构造一个新的空集;其底层HashMap实例具有默认初始容量(16)和加载因子(0.75)。
     * 2	HashSet(Collection<\? extends E> c)
     * 这个构造一个包含指定集合中的元素的新集。
     * 3	HashSet(int initialCapacity)
     * 这种构造一个新的空集;其底层HashMap实例具有指定的初始容量和默认加载因子(0.75)。
     * 4	HashSet(int initialCapacity, float loadFactor)
     * 这种构造一个新的空集;其底层HashMap实例具有指定的初始容量和指定加载因子。类方法
     * S.N.	方法 & 描述
     * 1	boolean add(E e)
     * 此方法将指定的元素添加到此集合，如果它是不存在的。
     * 2	void clear()
     * 此方法删除这个集合中的所有元素。
     * 3	Object clone()
     * 此方法返回此HashSet实例的浅表副本，元素本身没有复制。
     * 4	boolean contains(Object o)
     * 如果此set包含指定的元素，此方法返回true。
     * 5	boolean isEmpty()
     * 如果此set不包含元素(空集)，此方法返回true。
     * 6	Iterator<E> iterator()
     * 此方法返回一个迭代器在此set的元素。
     * 7	boolean remove(Object o)
     * 此方法删除指定的元素，从这组(如果存在)。
     * 8	int size()
     * 此方法返回返回元素在此set数字(它的基数)。
     */
    public static void main(String[] args) {
        // HashSet常用API
        testHashSetAPIs();
    }

    private static void testHashSetAPIs() {
        // 新建HashSet
        HashSet set = new HashSet();

        // 将元素添加到Set中
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        // 打印HashSet的实际大小
        System.out.printf("size : %d\n", set.size());

        // 判断HashSet是否包含某个值
        System.out.printf("HashSet contains a :%s\n", set.contains("a"));
        System.out.printf("HashSet contains g :%s\n", set.contains("g"));

        // 删除HashSet中的“e”
        set.remove("e");

        // 将Set转换为数组
        String[] arr = (String[])set.toArray(new String[0]);
        for (String str : arr) {
            System.out.printf("for each : %s\n", str);
        }
        // 新建一个包含b、c、f的HashSet
        HashSet otherset = new HashSet();
        otherset.add("b");
        otherset.add("c");
        otherset.add("f");

        // 克隆一个removeset，内容和set一模一样
        HashSet removeset = (HashSet)set.clone();
        // 删除“removeset中，属于otherSet的元素”
        removeset.removeAll(otherset);
        // 打印removeset
        System.out.printf("removeset : %s\n", removeset);

        // 克隆一个retainset，内容和set一模一样
        HashSet retainset = (HashSet)set.clone();
        // 保留“retainset中，属于otherSet的元素”
        retainset.retainAll(otherset);
        // 打印retainset
        System.out.printf("retainset : %s\n", retainset);

        // 遍历HashSet
        for (Iterator iterator = set.iterator();
             iterator.hasNext(); ) {System.out.printf("iterator : %s\n", iterator.next());}

        // 清空HashSet
        set.clear();

        // 输出HashSet是否为空
        System.out.printf("%s\n", set.isEmpty() ? "set is empty" : "set is not empty");
    }
}
