package com.macro.mall.tiny.jdk.容器;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @ClassName WeakHashMapTest
 * @Author WB-918966
 * @Date 2022/11/7 17:45
 * @Version 1.0
 * 类 WeakHashMap<K,V>
 * java.lang.Object
 *   继承者 java.util.AbstractMap<K,V>
 *       继承者 java.util.WeakHashMap<K,V>
 * 类型参数：
 * K - 此映射所维护的键的类型
 * V - 映射值的类型
 * 所有已实现的接口：
 * Map<K,V>
 **/
public class WeakHashMapTest {
    /**
     *嵌套类摘要
     *
     * 从类 java.util.AbstractMap 继承的嵌套类/接口
     * AbstractMap.SimpleEntry<K,V>, AbstractMap.SimpleImmutableEntry<K,V>
     *
     * 构造方法摘要
     * WeakHashMap()
     *           构造具有默认初始容量 (16) 和加载因子 (0.75) 的新的空 WeakHashMap。
     * WeakHashMap(int initialCapacity)
     *           构造具有给定初始容量和默认加载因子 (0.75) 的新的空 WeakHashMap。
     * WeakHashMap(int initialCapacity, float loadFactor)
     *           用给定的初始容量和加载因子构造一个新的空 WeakHashMap。
     * WeakHashMap(Map<? extends K,? extends V> m)
     *           构造一个新 WeakHashMap，使其与指定的映射具有相同的映射关系。
     *
     * 方法摘要
     *  void	clear()
     *           从此映射中移除所有映射关系。
     *  boolean	containsKey(Object key)
     *           如果此映射对于指定的键包含映射关系，则返回 true。
     *  boolean	containsValue(Object value)
     *           如果此映射将一个或多个键映射到指定值，则返回 true。
     *  Set<Map.Entry<K,V>>	entrySet()
     *           返回此映射所包含的映射关系的 Set 视图。
     *  V	get(Object key)
     *           返回指定键所映射的值，如果对于该键来说，此映射不包含任何映射关系，则返回 null。
     *  boolean	isEmpty()
     *           如果此映射不包含键-值映射关系，则返回 true。
     *  Set<K>	keySet()
     *           返回此映射所包含的键的 Set 视图。
     *  V	put(K key, V value)
     *           关联此映射中的指定值与指定键。
     *  void	putAll(Map<? extends K,? extends V> m)
     *           将指定映射的全部映射关系复制到此映射。
     *  V	remove(Object key)
     *           从此弱哈希映射中移除键的映射关系（如果存在）。
     *  int	size()
     *           返回该映射中的键-值映射关系的数目。
     *  Collection<V>	values()
     *           返回此映射所包含的值的 Collection 视图。
     */

    public static void main(String[] args) {
        //当主动调用 GC 回收器的时候，再次查询 WeakHashMap 里面的数据的时候，内容为空。
        Map weakHashMap = new WeakHashMap();

        //向weakHashMap中添加4个元素
        for (int i = 0; i < 3; i++) {
            weakHashMap.put("key-"+i, "value-"+ i);
        }
        //输出添加的元素
        System.out.println("数组长度："+weakHashMap.size() + "，输出结果：" + weakHashMap);

        //主动触发一次GC
        System.gc();

        //再输出添加的元素
        System.out.println("数组长度："+weakHashMap.size() + "，输出结果：" + weakHashMap);
        //弱引用与软引用的区别在于：具有弱引用的对象拥有更短暂的生命周期。
        //
        //在垃圾回收器线程扫描它所管辖的内存区域的过程中，一旦发现了只具有弱引用的对象，
        // 不管当前内存空间足够与否，都会回收它的内存。不过，由于垃圾回收器是一个优先级很低的线程，
        // 因此不一定会很快发现那些只具有弱引用的对象。
    }
}
