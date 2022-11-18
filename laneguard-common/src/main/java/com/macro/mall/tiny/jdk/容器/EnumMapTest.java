package com.macro.mall.tiny.jdk.容器;

/**
 * @ClassName EnumMapTest
 * @Author WB-918966
 * @Date 2022/11/3 17:18
 * @Version 1.0
 * EnumMap 是一个用于存储 key 为枚举类型的 map，底层使用数组实现（K，V 双数组）。
 * EnumMap 的 key 必须是一个枚举类型，而 value 没有限制。
 **/
public class EnumMapTest {
    /**
     * java.util.EnumMap 类是一种专门Map实现与枚举键的使用。以下是有关EnumMap要点：
     *
     * 所有在枚举映射的键都必须来自所指定，或明或暗地，创建映射的时候一个枚举类型。
     *
     * 枚举映射保持在其键的自然顺序。
     *
     * EnumMap是不同步的。如果多个线程同时访问一个枚举映射并发和线程中的至少一个修改的映射，它应该保持外部同步。
     *
     * 类声明
     * 以下是java.util.EnumMap类的声明：
     *
     * public class EnumMap<K extends Enum<K>,V>
     *    extends AbstractMap<K,V>
     *       implements Serializable, Cloneable
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	EnumMap(Class<K> keyType)
     * 此构造函数创建具有指定键类型的空枚举映射。
     * 2	EnumMap(EnumMap<K,? extends V> m)
     * 此构造函数创建具有相同的键类型与指定枚举映射的枚举映射，最初包含相同的映射关系(如果有的话)。
     * 3	EnumMap(Map<K,? extends V> m)
     * 此构造函数从指定的映射表进行初始化创建一个枚举映射。类方法
     * S.N.	方法 & 描述
     * 1	void clear()
     * 此方法从此映射删除所有映射。
     * 2	EnumMap<K,V> clone()
     * 此方法返回此枚举映射的浅表副本。
     * 3	boolean containsKey(Object key)
     * 如果此映射包含指定键的映射此方法返回true。
     * 4	boolean containsValue(Object value)
     * 如果此映射一个或多个键映射到指定值，该方法返回true。
     * 5	Set<Map.Entry<K,V>> entrySet()
     * 此方法返回此映射中包含的映射关系的Set视图。
     * 6	boolean equals(Object o)
     * 此方法将指定对象与此映射比较是否相等。
     * 7	V get(Object key)
     * 这个方法返回指定键所映射的值，或者null，如果此映射不包含该键。
     * 8	Set<K> keySet()
     * 此方法返回此映射中包含的键的Set视图。
     * 9	V put(K key, V value)
     * 这种方法与关联此映射中的指定键指定的值。
     * 10	void putAll(Map<? extends K,? extends V> m)
     * 这种方法将所有从指定映射此映射中的映射。
     * 11	V remove(Object key)
     * 此方法从该映射删除映射为这个键，如果存在的话。
     * 12	int size()
     * 此方法返回键- 值映射关系在映射的大小。
     * 13	Collection<V> values()
     * 此方法返回此映射中包含的值的Collection视图。
     */
}
