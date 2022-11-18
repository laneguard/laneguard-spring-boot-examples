package com.macro.mall.tiny.jdk.并发.并发容器;

/**
 * @ClassName ConcurrentHashMapTest
 * @Author WB-918966
 * @Date 2022/11/9 14:28
 * @Version 1.0
 * 类 ConcurrentHashMap<K,V>
 * java.lang.Object
 *   继承者 java.util.AbstractMap<K,V>
 *       继承者 java.util.concurrent.ConcurrentHashMap<K,V>
 * 类型参数：
 * K - 此映射维护的键的类型
 * V - 映射值的类
 * 所有已实现的接口：
 * Serializable, ConcurrentMap<K,V>, Map<K,V>
 * public class ConcurrentHashMap<K,V>
 * extends AbstractMap<K,V>
 * implements ConcurrentMap<K,V>, Serializable
 * 支持获取的完全并发和更新的所期望可调整并发的哈希表。
 * 此类遵守与 Hashtable 相同的功能规范，并且包括对应于 Hashtable 的每个方法的方法版本。
 * 不过，尽管所有操作都是线程安全的，但获取操作不 必锁定，并且不
 * 支持以某种防止所有访问的方式锁定整个表。
 * 此类可以通过程序完全与 Hashtable 进行互操作，这取决于其线程安全，而与其同步细节无关。
 *
 * ConcurrentHashMap允许一边更新、一边遍历，也就是说在Iterator对象遍历的时候，ConcurrentHashMap也可以进行remove,put操作，
 * 且遍历的数据会随着remove,put操作产出变化
 * ashtable在使用iterator遍历的时候，如果其他线程，包括本线程对Hashtable进行了put，remove等更新操作的话，就会抛出ConcurrentModificationException异常，
 * 但如果使用ConcurrentHashMap的话，就不用考虑这方面的问题了
 **/
public class ConcurrentHashMapTest {
    /**
     * 嵌套类摘要
     *
     * 从类 java.util.AbstractMap 继承的嵌套类/接口
     * AbstractMap.SimpleEntry<K,V>, AbstractMap.SimpleImmutableEntry<K,V>
     *
     * 从接口 java.util.Map 继承的嵌套类/接口
     * Map.Entry<K,V>
     *
     * 构造方法摘要
     * ConcurrentHashMap()
     *           创建一个带有默认初始容量 (16)、加载因子 (0.75) 和 concurrencyLevel (16) 的新的空映射。
     * ConcurrentHashMap(int initialCapacity)
     *           创建一个带有指定初始容量、默认加载因子 (0.75) 和 concurrencyLevel (16) 的新的空映射。
     * ConcurrentHashMap(int initialCapacity, float loadFactor)
     *           创建一个带有指定初始容量、加载因子和默认 concurrencyLevel (16) 的新的空映射。
     * ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)
     *           创建一个带有指定初始容量、加载因子和并发级别的新的空映射。
     * ConcurrentHashMap(Map<\? extends K,? extends V> m)
     *           构造一个与给定映射具有相同映射关系的新映射。
     *
     * 方法摘要
     *  void	clear()
     *           从该映射中移除所有映射关系
     *  boolean	contains(Object value)
     *           一种遗留方法，测试此表中是否有一些与指定值存在映射关系的键。
     *  boolean	containsKey(Object key)
     *           测试指定对象是否为此表中的键。
     *  boolean	containsValue(Object value)
     *           如果此映射将一个或多个键映射到指定值，则返回 true。
     *  Enumeration<V>	elements()
     *           返回此表中值的枚举。
     *  Set<Map.Entry<K,V>>	entrySet()
     *           返回此映射所包含的映射关系的 Set 视图。
     *  V	get(Object key)
     *           返回指定键所映射到的值，如果此映射不包含该键的映射关系，则返回 null。
     *  boolean	isEmpty()
     *           如果此映射不包含键-值映射关系，则返回 true。
     *  Enumeration<K>	keys()
     *           返回此表中键的枚举。
     *  Set<K>	keySet()
     *           返回此映射中包含的键的 Set 视图。
     *  V	put(K key, V value)
     *           将指定键映射到此表中的指定值。
     *  void	putAll(Map<\? extends K,? extends V> m)
     *           将指定映射中所有映射关系复制到此映射中。
     *  V	putIfAbsent(K key, V value)
     *           如果指定键已经不再与某个值相关联，则将它与给定值关联。
     *  V	remove(Object key)
     *           从此映射中移除键（及其相应的值）。
     *  boolean	remove(Object key, Object value)
     *           只有目前将键的条目映射到给定值时，才移除该键的条目。
     *  V	replace(K key, V value)
     *           只有目前将键的条目映射到某一值时，才替换该键的条目。
     *  boolean	replace(K key, V oldValue, V newValue)
     *           只有目前将键的条目映射到给定值时，才替换该键的条目。
     *  int	size()
     *           返回此映射中的键-值映射关系数。
     *  Collection<V>	values()
     *           返回此映射中包含的值的 Collection 视图。
     */


}
