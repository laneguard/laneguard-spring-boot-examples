package com.macro.mall.tiny.jdk.容器;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * @ClassName TreeMap
 * @Author WB-918966
 * @Date 2022/11/7 11:00
 * @Version 1.0
 * 类 TreeMap<K,V>
 * java.lang.Object
 *   继承者 java.util.AbstractMap<K,V>
 *       继承者 java.util.TreeMap<K,V>
 * 类型参数：
 * K - 此映射维护的键的类型
 * V - 映射值的类型
 * 所有已实现的接口：
 * Serializable, Cloneable, Map<K,V>, NavigableMap<K,V>, SortedMap<K,V>
 *     TreeMap能便捷的实现对其内部元素的各种排序，但其一般性能比前两种map差。
 **/
public class TreeMapTest {
    /**
     * 构造方法摘要
     * TreeMap()
     *           使用键的自然顺序构造一个新的、空的树映射。
     * TreeMap(Comparator<\? super K> comparator)
     *           构造一个新的、空的树映射，该映射根据给定比较器进行排序。
     * TreeMap(Map<\? extends K,? extends V> m)
     *           构造一个与给定映射具有相同映射关系的新的树映射，该映射根据其键的自然顺序 进行排序。
     * TreeMap(SortedMap<K,? extends V> m)
     *           构造一个与指定有序映射具有相同映射关系和相同排序顺序的新的树映射。
     *
     * 方法摘要
     *  Map.Entry<K,V>	ceilingEntry(K key)
     *           返回一个键-值映射关系，它与大于等于给定键的最小键关联；如果不存在这样的键，则返回 null。
     *  K	ceilingKey(K key)
     *           返回大于等于给定键的最小键；如果不存在这样的键，则返回 null。
     *  void	clear()
     *           从此映射中移除所有映射关系。
     *  Object	clone()
     *           返回此 TreeMap 实例的浅表副本。
     *  Comparator<\? super K>	comparator()
     *           返回对此映射中的键进行排序的比较器；如果此映射使用键的自然顺序，则返回 null。
     *  boolean	containsKey(Object key)
     *           如果此映射包含指定键的映射关系，则返回 true。
     *  boolean	containsValue(Object value)
     *           如果此映射为指定值映射一个或多个键，则返回 true。
     *  NavigableSet<K>	descendingKeySet()
     *           返回此映射中所包含键的逆序 NavigableSet 视图。
     *  NavigableMap<K,V>	descendingMap()
     *           返回此映射中所包含映射关系的逆序视图。
     *  Set<Map.Entry<K,V>>	entrySet()
     *           返回此映射中包含的映射关系的 Set 视图。
     *  Map.Entry<K,V>	firstEntry()
     *           返回一个与此映射中的最小键关联的键-值映射关系；如果映射为空，则返回 null。
     *  K	firstKey()
     *           返回此映射中当前第一个（最低）键。
     *  Map.Entry<K,V>	floorEntry(K key)
     *           返回一个键-值映射关系，它与小于等于给定键的最大键关联；如果不存在这样的键，则返回 null。
     *  K	floorKey(K key)
     *           返回小于等于给定键的最大键；如果不存在这样的键，则返回 null。
     *  V	get(Object key)
     *           返回指定键所映射的值，如果对于该键而言，此映射不包含任何映射关系，则返回 null。
     *  SortedMap<K,V>	headMap(K toKey)
     *           返回此映射的部分视图，其键值严格小于 toKey。
     *  NavigableMap<K,V>	headMap(K toKey, boolean inclusive)
     *           返回此映射的部分视图，其键小于（或等于，如果 inclusive 为 true）toKey。
     *  Map.Entry<K,V>	higherEntry(K key)
     *           返回一个键-值映射关系，它与严格大于给定键的最小键关联；如果不存在这样的键，则返回 null。
     *  K	higherKey(K key)
     *           返回严格大于给定键的最小键；如果不存在这样的键，则返回 null。
     *  Set<K>	keySet()
     *           返回此映射包含的键的 Set 视图。
     *  Map.Entry<K,V>	lastEntry()
     *           返回与此映射中的最大键关联的键-值映射关系；如果映射为空，则返回 null。
     *  K	lastKey()
     *           返回映射中当前最后一个（最高）键。
     *  Map.Entry<K,V>	lowerEntry(K key)
     *           返回一个键-值映射关系，它与严格小于给定键的最大键关联；如果不存在这样的键，则返回 null。
     *  K	lowerKey(K key)
     *           返回严格小于给定键的最大键；如果不存在这样的键，则返回 null。
     *  NavigableSet<K>	navigableKeySet()
     *           返回此映射中所包含键的 NavigableSet 视图。
     *  Map.Entry<K,V>	pollFirstEntry()
     *           移除并返回与此映射中的最小键关联的键-值映射关系；如果映射为空，则返回 null。
     *  Map.Entry<K,V>	pollLastEntry()
     *           移除并返回与此映射中的最大键关联的键-值映射关系；如果映射为空，则返回 null。
     *  V	put(K key, V value)
     *           将指定值与此映射中的指定键进行关联。
     *  void	putAll(Map<\? extends K,? extends V> map)
     *           将指定映射中的所有映射关系复制到此映射中。
     *  V	remove(Object key)
     *           如果此 TreeMap 中存在该键的映射关系，则将其删除。
     *  int	size()
     *           返回此映射中的键-值映射关系数。
     *  NavigableMap<K,V>	subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)
     *           返回此映射的部分视图，其键的范围从 fromKey 到 toKey。
     *  SortedMap<K,V>	subMap(K fromKey, K toKey)
     *           返回此映射的部分视图，其键值的范围从 fromKey（包括）到 toKey（不包括）。
     *  SortedMap<K,V>	tailMap(K fromKey)
     *           返回此映射的部分视图，其键大于等于 fromKey。
     *  NavigableMap<K,V>	tailMap(K fromKey, boolean inclusive)
     *           返回此映射的部分视图，其键大于（或等于，如果 inclusive 为 true）fromKey。
     *  Collection<V>	values()
     *           返回此映射包含的值的 Collection 视图。
     */

    public static void main(String[] args) {
        // 测试常用的API
        testTreeMapOridinaryAPIs();

        // 测试TreeMap的导航函数
        //testNavigableMapAPIs();

        // 测试TreeMap的子Map函数
        //testSubMapAPIs();
    }

    /**
     * 测试常用的API
     */
    private static void testTreeMapOridinaryAPIs() {
        // 初始化随机种子
        Random r = new Random();
        // 新建TreeMap
        TreeMap tmap = new TreeMap();
        // 添加操作
        tmap.put("one", r.nextInt(10));
        tmap.put("two", r.nextInt(10));
        tmap.put("three", r.nextInt(10));

        System.out.printf("\n ---- testTreeMapOridinaryAPIs ----\n");
        // 打印出TreeMap
        System.out.printf("%s\n",tmap );

        // 通过Iterator遍历key-value
        Iterator iter = tmap.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            System.out.printf("next : %s - %s\n", entry.getKey(), entry.getValue());
        }

        // TreeMap的键值对个数
        System.out.printf("size: %s\n", tmap.size());

        // containsKey(Object key) :是否包含键key
        System.out.printf("contains key two : %s\n",tmap.containsKey("two"));
        System.out.printf("contains key five : %s\n",tmap.containsKey("five"));

        // containsValue(Object value) :是否包含值value
        System.out.printf("contains value 0 : %s\n",tmap.containsValue(new Integer(0)));

        // remove(Object key) ： 删除键key对应的键值对
        tmap.remove("three");

        System.out.printf("tmap:%s\n",tmap );

        // clear() ： 清空TreeMap
        tmap.clear();

        // isEmpty() : TreeMap是否为空
        System.out.printf("%s\n", (tmap.isEmpty()?"tmap is empty":"tmap is not empty") );
    }


    /**
     * 测试TreeMap的子Map函数
     */
    public static void testSubMapAPIs() {
        // 新建TreeMap
        TreeMap tmap = new TreeMap();
        // 添加“键值对”
        tmap.put("a", 101);
        tmap.put("b", 102);
        tmap.put("c", 103);
        tmap.put("d", 104);
        tmap.put("e", 105);

        System.out.printf("\n ---- testSubMapAPIs ----\n");
        // 打印出TreeMap
        System.out.printf("tmap:\n\t%s\n", tmap);

        // 测试 headMap(K toKey)
        System.out.printf("tmap.headMap(\"c\"):\n\t%s\n", tmap.headMap("c"));
        // 测试 headMap(K toKey, boolean inclusive)
        System.out.printf("tmap.headMap(\"c\", true):\n\t%s\n", tmap.headMap("c", true));
        System.out.printf("tmap.headMap(\"c\", false):\n\t%s\n", tmap.headMap("c", false));

        // 测试 tailMap(K fromKey)
        System.out.printf("tmap.tailMap(\"c\"):\n\t%s\n", tmap.tailMap("c"));
        // 测试 tailMap(K fromKey, boolean inclusive)
        System.out.printf("tmap.tailMap(\"c\", true):\n\t%s\n", tmap.tailMap("c", true));
        System.out.printf("tmap.tailMap(\"c\", false):\n\t%s\n", tmap.tailMap("c", false));

        // 测试 subMap(K fromKey, K toKey)
        System.out.printf("tmap.subMap(\"a\", \"c\"):\n\t%s\n", tmap.subMap("a", "c"));
        // 测试
        System.out.printf("tmap.subMap(\"a\", true, \"c\", true):\n\t%s\n",
            tmap.subMap("a", true, "c", true));
        System.out.printf("tmap.subMap(\"a\", true, \"c\", false):\n\t%s\n",
            tmap.subMap("a", true, "c", false));
        System.out.printf("tmap.subMap(\"a\", false, \"c\", true):\n\t%s\n",
            tmap.subMap("a", false, "c", true));
        System.out.printf("tmap.subMap(\"a\", false, \"c\", false):\n\t%s\n",
            tmap.subMap("a", false, "c", false));

        // 测试 navigableKeySet()
        System.out.printf("tmap.navigableKeySet():\n\t%s\n", tmap.navigableKeySet());
        // 测试 descendingKeySet()
        System.out.printf("tmap.descendingKeySet():\n\t%s\n", tmap.descendingKeySet());
    }

    /**
     * 测试TreeMap的导航函数
     */
    public static void testNavigableMapAPIs() {
        // 新建TreeMap
        NavigableMap nav = new TreeMap();
        // 添加“键值对”
        nav.put("aaa", 111);
        nav.put("bbb", 222);
        nav.put("eee", 333);
        nav.put("ccc", 555);
        nav.put("ddd", 444);

        System.out.printf("\n ---- testNavigableMapAPIs ----\n");
        // 打印出TreeMap
        System.out.printf("Whole list:%s%n", nav);

        // 获取第一个key、第一个Entry
        System.out.printf("First key: %s\tFirst entry: %s%n",nav.firstKey(), nav.firstEntry());

        // 获取最后一个key、最后一个Entry
        System.out.printf("Last key: %s\tLast entry: %s%n",nav.lastKey(), nav.lastEntry());

        // 获取“小于/等于bbb”的最大键值对
        System.out.printf("Key floor before bbb: %s%n",nav.floorKey("bbb"));

        // 获取“小于bbb”的最大键值对
        System.out.printf("Key lower before bbb: %s%n", nav.lowerKey("bbb"));

        // 获取“大于/等于bbb”的最小键值对
        System.out.printf("Key ceiling after ccc: %s%n",nav.ceilingKey("ccc"));

        // 获取“大于bbb”的最小键值对
        System.out.printf("Key higher after ccc: %s%n\n",nav.higherKey("ccc"));
    }
}
