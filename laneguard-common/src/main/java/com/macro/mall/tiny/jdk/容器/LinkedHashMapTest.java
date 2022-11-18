package com.macro.mall.tiny.jdk.容器;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @ClassName LinkedHashMapTest
 * @Author WB-918966
 * @Date 2022/11/4 10:22
 * @Version 1.0
 * LinkedHashMap是HashMap的子类，但是内部还有一个双向链表维护键值对的顺序，每个键值对既位于哈希表中，也位于双向链表中。
 * LinkedHashMap支持两种顺序插入顺序 、 访问顺序
 **/
public class LinkedHashMapTest {
    /**
     * java.util.LinkedHashMap 类是哈希表和链接列表实现Map接口，具有可预知的迭代顺序。以下是关于LinkedHashMap的要点：
     *
     * 这个类提供了所有可选的映射操作，并且允许null元素。
     *
     * 在一个HashMap的迭代很可能会更加昂贵。
     *
     * 类声明
     * 以下是java.util.LinkedHashMap类的声明：
     *
     * public class LinkedHashMap<K,V>
     * extends HashMap<K,V>
     * implements Map<K,V>
     * 参数
     * 以下是java.util.LinkedHashMap类中的参数：
     *
     * K -- 这是映射要维护的键的类型。
     *
     * V -- 这是映射值的类型。
     *
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	LinkedHashMap()
     * 这种构造具有默认初始容量(16)和加载因子(0.75)的空插入顺序LinkedHashMap实例。
     * 2	LinkedHashMap(int initialCapacity)
     * 该构造带指定初始容量和默认加载因子(0.75)的空插入顺序LinkedHashMap实例。
     * 3	LinkedHashMap(int initialCapacity, float loadFactor)
     * 该构造带指定初始容量和加载因子的空插入顺序LinkedHashMap实例。
     * 4	LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
     * 该构造带指定初始容量，加载因子和排序模式的空LinkedHashMap实例。
     * 5	LinkedHashMap(Map<\? extends K,? extends V> m)
     * 这与构建相同的映射关系与指定映射的插入顺序LinkedHashMap实例。类方法
     * S.N.	方法 & 描述
     * 1	void clear()
     * 此方法删除所有来自此映射中的映射。
     * 2	boolean containsValue(Object value)
     * 如果此映射的一个或多个键映射到指定值，该方法返回true。
     * 3	V get(Object key)
     * 这个方法返回指定键所映射的值，或者null，如果此映射不包含该键。
     * 4	protected boolean removeEldestEntry(Map.Entry<K,V> eldest)
     * 这个方法如果此映射移除其最旧的条目返回true。
     */

    public static void main(String[] args) {
        //从构造方法中可以看出，默认都采用插入顺序来维持取出键值对的次序。所有构造方法都是通过调用父类的构造方法来创建对象的。
        //
        //举个例子：键是按照:“c”, “d”,"a"的顺序插入的，修改d不会修改顺序
        {
            Map<String, Integer> seqMap = new LinkedHashMap<>();
            seqMap.put("c", 100);
            seqMap.put("d", 200);
            seqMap.put("a", 500);
            for (Entry<String, Integer> entry : seqMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println("---------------");
            seqMap.put("d", 300);
            for (Entry<String, Integer> entry : seqMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }


        //按访问顺序,被访问的元素会被放到map尾部
        {
            Map<String, Integer> seqMap = new LinkedHashMap<>(16, 0.75f, true);
            seqMap.put("c", 100);
            seqMap.put("d", 200);
            seqMap.put("a", 500);
            for (Entry<String, Integer> entry : seqMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println("---------------");
            seqMap.put("d", 300);
            for (Entry<String, Integer> entry : seqMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }


    }
}
