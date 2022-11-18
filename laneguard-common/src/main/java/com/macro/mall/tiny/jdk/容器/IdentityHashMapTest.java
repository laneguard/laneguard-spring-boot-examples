package com.macro.mall.tiny.jdk.容器;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @ClassName IdentityHashMapTest
 * @Author WB-918966
 * @Date 2022/11/4 10:15
 * @Version 1.0
 * IdentityHashMap的用法和HashMap的用法差不多，他们之间最大的区别就是IdentityHashMap判断两个key是否相等，是通过严格相等即（key1==key2）来判读的，而HashMap是通过equals
 * ()方法和hashCode（）这两个方法来判断key是否相等的
 * 它对构建特定的框架很有帮助，包括。
 * 为一组易变的对象维护代理对象
 * 基于一个对象的引用建立一个快速缓存
 * 保持一个有引用的对象的内存图
 *
 * IdentityHashMap重写了equals和hashcode方法，不过需要注意的是hashCode方法并不是借助Object的hashCode来实现的，而是通过System.identityHashCode方法来实现的。
 **/
public class IdentityHashMapTest {

    /**
     * java.util.IdentityHashMap 类实现了Map接口的哈希表，比较键(和值)时使用引用相等性代替对象相等的下面是IdentityHashMap有关的要点：
     *
     * 这个类提供了所有可选的映射操作，并且允许null值和null键。
     *
     * 这个类不保证为向地图的顺序;特别是，它不保证该顺序将继续随时间恒定。
     *
     * 在IdentityHashMap中，两个键k1和k2被认为是当且仅当(K1== K2)相等，而在Map实现(如HashMap的)两个键k1和k2被认为是相等当且仅当(K1== NULL？K2== NULL：k1
     * .equals(K2))。
     *
     * 类声明
     * 以下是java.util.IdentityHashMap类的声明：
     *
     * public class IdentityHashMap<K,V>
     *    extends AbstractMap<K,V>
     *        implements Map<K,V>, Serializable, Cloneable
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	IdentityHashMap()
     * 此构造一个新的空标识哈希映射具有默认期望最大尺寸(21)。
     * 2	IdentityHashMap(int expectedMaxSize)
     * 此构造一个新的空地图与指定期望的最大尺寸。
     * 3	IdentityHashMap(Map<? extends K,? extends V> m)
     * 这个构造包含指定映射中键 - 值映射关系的新标识哈希映射。类方法
     * S.N.	方法 & 描述
     * 1	void clear()
     * 此方法删除所有来自此映射中的映射。
     * 2	Object clone()
     * 此方法返回此标识哈希映射的浅表副本：键和值本身不被复制。
     * 3	boolean containsKey(Object key)
     * 此方法测试指定的对象引用是否为此标识哈希映射中的键。
     * 4	boolean containsValue(Object value)
     * 此方法测试指定的对象引用是否为值在此标识哈希映射。
     * 5	Set<Map.Entry<K,V>> entrySet()
     * 此方法返回此映射中包含的映射关系的Set视图。
     * 6	boolean equals(Object o)
     * 此方法将指定对象与此映射的相等性比较。
     * 7	V get(Object key)
     * 这个方法返回指定键所映射的值，或者null，如果此映射不包含该键。
     * 8	int hashCode()
     * 此方法返回返回这个映射的哈希码值。
     * 9	boolean isEmpty()
     * 如果此标识哈希映射不包含键 - 值映射关系，此方法返回true。
     * 10	Set<K>keySet()
     * 此方法返回此映射中包含的键的基于标识的set视图。
     * 11	V put(K key, V value)
     * 此方法将指定的值与此标识哈希映射中的指定键。
     * 12	void putAll(Map<? extends K,? extends V> m)
     * 这个方法会将所有从指定映射此映射中的映射。
     * 13	V remove(Object key)
     * 此方法删除映射为这个键从该映射如果存在的话。
     * 14	int size()
     * 此方法返回键 - 值映射关系在此标识哈希映射的数量。
     * 15	Collection<V> values()
     * 此方法返回返回此映射中包含的值的Collection视图。
     */

    public static void main(String[] args) {
        //hashmap根据equal和hashcode对元素进行比对
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("a", "2");
        map.put("a", "3");
        System.out.println(map.size()); //1

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(new String("a"), "1");
        hashMap.put(new String("a"), "2");
        hashMap.put(new String("a"), "3");
        System.out.println(hashMap.size()); //1

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(new Integer(200), "1");
        hashMap2.put(new Integer(200), "2");
        hashMap2.put(new Integer(200), "3");
        System.out.println(hashMap2.size()); //1

        Map<Object, String> hashMap3 = new HashMap<>();
        hashMap3.put(new Object(), "1");
        hashMap3.put(new Object(), "2");
        hashMap3.put(new Object(), "3");
        System.out.println(hashMap3.size()); //3

        //IdentityHashMap使用===================================，严格比较地址
        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String("a"), "1");
        identityHashMap.put(new String("a"), "2");
        identityHashMap.put(new String("a"), "3");
        System.out.println(identityHashMap.size()); //3

        Map<Object, String> identityHashMap2 = new IdentityHashMap<>();
        identityHashMap2.put(new Object(), "1");
        identityHashMap2.put(new Object(), "2");
        identityHashMap2.put(new Object(), "3");
        System.out.println(identityHashMap2.size()); //3
    }
}
