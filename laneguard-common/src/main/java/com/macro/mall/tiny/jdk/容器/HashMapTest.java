package com.macro.mall.tiny.jdk.容器;

/**
 * @ClassName HashMapTest
 * @Author WB-918966
 * @Date 2022/11/3 17:26
 * @Version 1.0
 **/
public class HashMapTest {
    /**
     * java.util.HashMap 类是基于哈希表的Map接口的实现。以下是关于HashMap的要点：
     *
     * 这个类不保证为向映射的迭代顺序;特别是，它不保证该顺序将继续随时间恒定。
     *
     * 这个类允许null值和null键。
     *
     * 类声明
     * 以下是java.util.HashMap类的声明：
     *
     * public class HashMap<K,V>
     *    extends AbstractMap<K,V>
     *        implements Map<K,V>, Cloneable, Serializable
     * 参数
     * 以下是java.util.HashMap类中的参数：
     *
     * K -- 这是映射保持的键的类型。
     *
     * V -- 这是映射值的类型。
     *
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	HashMap()
     * 此构造一个空的HashMap具有默认初始容量（16）和默认加载因子（0.75）。
     * 2	HashMap(Collection<? extends E> c)
     * 此构造一个空的HashMap具有指定的初始容量和默认加载因子（0.75）。
     * 3	HashMap(int initialCapacity, float loadFactor)
     * 此构造一个空的HashMap具有指定的初始容量和加载因子。
     * 4	HashMap(Map<? extends K,? extends V> m)
     * 这种构造一个新的HashMap中使用相同的映射关系与指定映射。类方法
     * S.N.	方法 & 描述
     * 1	void clear()
     * 此方法删除所有来自此映射中的映射。
     * 2	Object clone()
     * 此方法返回此HashMap实例的浅表副本，键和值本身不被复制。
     * 3	boolean containsKey(Object key)
     * 如果此映射包含指定键的映射此方法返回true。
     * 4	boolean containsValue(Object value)
     * 如果此映射一个或多个键映射到指定值，该方法返回true。
     * 5	Set<Map.Entry<K,V>> entrySet()
     * 此方法返回此映射中包含的映射关系的Set视图。
     * 6	V get(Object key)
     * 这个方法返回指定键所映射的值，或者null，如果此映射不包含该键。
     * 7	boolean isEmpty()
     * 如果此映射不包含键 - 值映射，此方法返回true。
     * 8	Set<K> keySet()
     * 此方法返回此映射中包含的键的Set视图。
     * 9	V put(K key, V value)
     * 这种方法与关联此映射中的指定键指定的值。
     * 10	void putAll(Map<\? extends K,? extends V> m)
     * 这个方法会将所有从指定映射此映射中的映射。
     * 11	V remove(Object key)
     * 此方法删除映射对于指定的键从该映射，如果存在的话。
     * 12	int size()
     * 此方法返回键 - 值映射关系在这个映射的数量。
     * 13	Collection<V> values()
     * 此方法返回此映射中包含的值的Collection视图。
     */
}
