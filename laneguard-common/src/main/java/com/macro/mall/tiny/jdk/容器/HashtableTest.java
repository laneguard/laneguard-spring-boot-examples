package com.macro.mall.tiny.jdk.容器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @ClassName HashtableTest
 * @Author WB-918966
 * @Date 2022/11/3 17:30
 * @Version 1.0
 * HashMap几乎可以等价于Hashtable，
 * 除了HashMap是非synchronized的，并可以接受null(HashMap可以接受为null的键值(key)和值(value)，而Hashtable则不行)。
 * 最大的区别在于是否线程安全
 **/
public class HashtableTest {
    /**
     * java.util.Hashtable 此类实现一个哈希表，该键映射到相应的值。以下是关于Hashtable的要点：
     *
     * 在此任何非空的对象可以被用作键或值。
     *
     * 如果很多条目将被制作成一个Hashtable，具有足够大的容量创建它可允许条目被插入的效率比让作为生长所需的表它执行自动再散列。
     *
     * 类声明
     * 以下是java.util.Hashtable类的声明：
     *
     * public class Hashtable<K,V>
     *    extends Dictionary<K,V>
     *       implements Map<K,V>, Cloneable, Serializable
     * 类的构造函数
     * S.N.	构造函数 & 描述
     * 1	Hashtable()
     * 这种构造一个新的空哈希表用默认的初始容量(11)和加载因子(0.75)。
     * 2	Hashtable(int initialCapacity)
     * 这种构造一个新的空哈希表使用指定的初始容量和默认加载因子(0.75)。
     * 3	Hashtable(int initialCapacity, float loadFactor)
     * 这种构造一个新的空哈希表与指定的初始容量和指定的加载因子。
     * 4	Hashtable(Map<? extends K,? extends V> t)
     * 这种构造一个新的哈希表具有相同的映射给定的Map。类方法
     * S.N.	方法与说明
     * 1	void clear()
     * 此方法清除这个哈希表，以便它不包含任何键。
     * 2	Object clone()
     * 此方法创建此哈希表的浅表副本。
     * 3	boolean contains(Object value)
     * 此方法测试，如果一些键映射到该散列表中指定的值。
     * 4	boolean containsKey(Object key)
     * 如果指定的对象是该散列表中的一个关键此方法测试。
     * 5	boolean containsValue(Object value)
     * 如果此哈希表的一个或多个键映射到这个值此方法返回true。
     * 6	Enumeration<V> elements()
     * 此方法在该散列表中返回值的枚举。
     * 7	Set<Map.Entry<K,V>> entrySet()
     * 此方法返回此映射中包含的映射关系的Set视图。
     * 8	boolean equals(Object o)
     * 此方法将指定对象与此映射的相等性比较，按照Map接口的定义。
     * 9	V get(Object key)
     * 此方法返回指定键所映射的值，或者null，如果此映射不包含该键。
     * 10	int hashCode()
     * 此方法返回按在Map接口的定义此Map的哈希码值。
     * 11	boolean isEmpty()
     * 这如果此哈希表没有映射到按键值的方法测试。
     * 12	Enumeration<K> keys()
     * 此方法返回此哈希表中的键的枚举。
     * 13	Set<K> keySet()
     * 此方法返回此映射中包含的键的Set视图。
     * 14	V put(K key, V value)
     * 这种方法映射到指定键在此哈希表中指定的值。
     * 15	void putAll(Map<\? extends K,? extends V> t)
     * 这个方法会将所有从指定映射到这个哈希表的映射。
     * 16	protected void rehash()
     * 这种方法增加的容量和内部对其进行重组这个哈希表，以适应和更有效地访问其条目。
     * 17	V remove(Object key)
     * 这个方法从哈希表中删除键(及其相应的值)。
     * 18	int size()
     * 此方法返回此哈希表中的键的数量。
     * 19	String toString()
     * 这种方法在一组条目的形式返回此Hashtable对象的字符串表示形式，括在括号由ASCII字符“,”(逗号加空格)分隔。
     * 20	Collection<V> values()
     * 此方法返回此映射中包含的值的Collection视图。
     */

    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"aa");
        hashtable.put(4,"dd");
        hashtable.put(2,"bb");
        hashtable.put(3,"cc");

        System.out.println(hashtable);

        //throw exception
        hashtable.put(null,"xx");
        hashtable.put(5,null);

        System.out.println(hashtable.get(1));//aa

        System.out.println(hashtable.remove(1));//aa

        System.out.println(hashtable.remove(2,"bb"));//true

        //迭代
        Iterator<Integer> iterator = hashtable.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key+"="+hashtable.get(key));
        }

        //工具类排序
        Hashtable<Integer,String> hashtable2 = new Hashtable<>();
        hashtable2.put(1,"aa");
        hashtable2.put(4,"dd");
        hashtable2.put(2,"bb");
        hashtable2.put(3,"cc");
        List<Entry<Integer,String>> list = new ArrayList<>(hashtable2.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        //树结构排序
        TreeMap<Integer,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        treeMap.putAll(hashtable);
        System.out.println(treeMap);

    }

}
