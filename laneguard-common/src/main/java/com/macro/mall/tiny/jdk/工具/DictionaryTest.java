package com.macro.mall.tiny.jdk.工具;

/**
 * @ClassName DictionaryTest
 * @Author WB-918966
 * @Date 2022/11/3 17:17
 * @Version 1.0
 **/
public abstract class DictionaryTest {
    /**
     * java.util.Dictionary 类是任何类的抽象父类，如哈希表，其中键映射到相应的值。以下是关于字典的要点：
     *
     * 在这个类中的每个键，每个值都是一个对象。
     *
     * 在这个类的对象的每个键与最多只有一个值相关联。
     *
     * 类声明
     * 以下是java.util.Dictionary类的声明：
     *
     * public abstract class Dictionary<K,V>
     *    extends Object
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	Dictionary()
     * 这是一个构造函数。类方法
     * S.N.	方法 & 描述
     * 1	abstract Enumeration<V> elements()
     * 这种方法在这个字典中返回枚举值。
     * 2	abstract V get(Object key)
     * 此方法返回到该键所映射在这个字典中的值。
     * 3	abstract boolean isEmpty()
     * 如果这此字典是否有键映射到的值的方法测试。
     * 4	abstract Enumeration<K> keys()
     * 此方法返回这个字典中的键的枚举。
     * 5	abstract V put(K key, V value)
     * 这种方法映射到指定键在此字典中指定的值。
     * 6	abstract V remove(Object key)
     * 这个方法从这个字典中删除键(及其相应的值)。
     * 7	abstract int size()
     * 此方法在此字典返回条目的数量(不同的键)。
     */
}
