package com.macro.mall.tiny.jdk.工具;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import org.junit.Test;

/**
 * @ClassName CollectionsTest
 * @Author WB-918966
 * @Date 2022/11/2 10:25
 * @Version 1.0
 * 类 Collections
 * java.lang.Object
 *   继承者 java.util.Collections
 * public class Collections
 * extends Object
 * 此类完全由在 collection 上进行操作或返回 collection 的静态方法组成。它包含在 collection 上操作的多态算法，即“包装器”，包装器返回由指定 collection 支持的新
 * collection，以及少数其他内容。
 *
 * 如果为此类的方法所提供的 collection 或类对象为 null，则这些方法都将抛出 NullPointerException。
 **/
public class CollectionsTest {
    /**
     * 字段摘要
     * static List	EMPTY_LIST
     *           空的列表（不可变的）。
     * static Map	EMPTY_MAP
     *           空的映射（不可变的）。
     * static Set	EMPTY_SET
     *           空的 set（不可变的）。
     *
     * 方法摘要
     * static
     * <T> boolean
     * addAll(Collection<\? super T> c, T... elements)
     *           将所有指定元素添加到指定 collection 中。
     *
     * static
     * <T> Queue<T>
     * asLifoQueue(Deque<T> deque)
     *           以后进先出 (Lifo) Queue 的形式返回某个 Deque 的视图。
     * static
     * <T> int
     * binarySearch(List<\? extends Comparable<\? super T>> list, T key)
     *           使用二分搜索法搜索指定列表，以获得指定对象。
     * static
     * <T> int
     * binarySearch(List<\? extends T> list, T key, Comparator<\? super T> c)
     *           使用二分搜索法搜索指定列表，以获得指定对象。
     * static
     * <E> Collection<E>
     * checkedCollection(Collection<E> c, Class<E> type)
     *           返回指定 collection 的一个动态类型安全视图。
     * static
     * <E> List<E>
     * checkedList(List<E> list, Class<E> type)
     *           返回指定列表的一个动态类型安全视图。
     * static
     * <K,V> Map<K,V>
     * checkedMap(Map<K,V> m, Class<K> keyType, Class<V> valueType)
     *           返回指定映射的一个动态类型安全视图。
     * static
     * <E> Set<E>
     * checkedSet(Set<E> s, Class<E> type)
     *           返回指定 set 的一个动态类型安全视图。
     * static
     * <K,V> SortedMap<K,V>
     * checkedSortedMap(SortedMap<K,V> m, Class<K> keyType, Class<V> valueType)
     *           返回指定有序映射的一个动态类型安全视图。
     * static
     * <E> SortedSet<E>
     * checkedSortedSet(SortedSet<E> s, Class<E> type)
     *           返回指定有序 set 的一个动态类型安全视图。
     * static
     * <T> void
     * copy(List<\? super T> dest, List<\? extends T> src)
     *           将所有元素从一个列表复制到另一个列表。
     * static boolean	disjoint(Collection<\?> c1, Collection<\?> c2)
     *           如果两个指定 collection 中没有相同的元素，则返回 true。
     * static
     * <T> List<T>
     * emptyList()
     *           返回空的列表（不可变的）。
     * static
     * <K,V> Map<K,V>
     * emptyMap()
     *           返回空的映射（不可变的）。
     * static
     * <T> Set<T>
     * emptySet()
     *           返回空的 set（不可变的）。
     * static
     * <T> Enumeration<T>
     * enumeration(Collection<T> c)
     *           返回一个指定 collection 上的枚举。
     * static
     * <T> void
     * fill(List<\? super T> list, T obj)
     *           使用指定元素替换指定列表中的所有元素。
     * static int	frequency(Collection<\?> c, Object o)
     *           返回指定 collection 中等于指定对象的元素数。
     * static int	indexOfSubList(List<\?> source, List<\?> target)
     *           返回指定源列表中第一次出现指定目标列表的起始位置；如果没有出现这样的列表，则返回 -1。
     * static int	lastIndexOfSubList(List<\?> source, List<\?> target)
     *           返回指定源列表中最后一次出现指定目标列表的起始位置；如果没有出现这样的列表，则返回 -1。
     * static
     * <T> ArrayList<T>
     * list(Enumeration<T> e)
     *           返回一个数组列表，它按返回顺序包含指定枚举返回的元素。
     * static
     * <T extends Object & Comparable<\? super T>>
     * T
     * max(Collection<\? extends T> coll)
     *           根据元素的自然顺序，返回给定 collection 的最大元素。
     * static
     * <T> T
     * max(Collection<\? extends T> coll, Comparator<\? super T> comp)
     *           根据指定比较器产生的顺序，返回给定 collection 的最大元素。
     * static
     * <T extends Object & Comparable<\? super T>>
     * T
     * min(Collection<\? extends T> coll)
     *           根据元素的自然顺序 返回给定 collection 的最小元素。
     * static
     * <T> T
     * min(Collection<\? extends T> coll, Comparator<\? super T> comp)
     *           根据指定比较器产生的顺序，返回给定 collection 的最小元素。
     * static
     * <T> List<T>
     * nCopies(int n, T o)
     *           返回由指定对象的 n 个副本组成的不可变列表。
     * static
     * <E> Set<E>
     * newSetFromMap(Map<E,Boolean> map)
     *           返回指定映射支持的 set。
     * static
     * <T> boolean
     * replaceAll(List<T> list, T oldVal, T newVal)
     *           使用另一个值替换列表中出现的所有某一指定值。
     * static void	reverse(List<\?> list)
     *           反转指定列表中元素的顺序。
     * static
     * <T> Comparator<T>
     * reverseOrder()
     *           返回一个比较器，它强行逆转实现了 Comparable 接口的对象 collection 的自然顺序。
     * static
     * <T> Comparator<T>
     * reverseOrder(Comparator<T> cmp)
     *           返回一个比较器，它强行逆转指定比较器的顺序。
     * static void	rotate(List<\?> list, int distance)
     *           根据指定的距离轮换指定列表中的元素。
     * static void	shuffle(List<\?> list)
     *           使用默认随机源对指定列表进行置换。
     * static void	shuffle(List<\?> list, Random rnd)
     *           使用指定的随机源对指定列表进行置换。
     * static
     * <T> Set<T>
     * singleton(T o)
     *           返回一个只包含指定对象的不可变 set。
     * static
     * <T> List<T>
     * singletonList(T o)
     *           返回一个只包含指定对象的不可变列表。
     * static
     * <K,V> Map<K,V>
     * singletonMap(K key, V value)
     *           返回一个不可变的映射，它只将指定键映射到指定值。
     * static
     * <T extends Comparable<\? super T>>
     * void
     * sort(List<T> list)
     *           根据元素的自然顺序 对指定列表按升序进行排序。
     * static
     * <T> void
     * sort(List<T> list, Comparator<\? super T> c)
     *           根据指定比较器产生的顺序对指定列表进行排序。
     * static void	swap(List<\?> list, int i, int j)
     *           在指定列表的指定位置处交换元素。
     * static
     * <T> Collection<T>
     * synchronizedCollection(Collection<T> c)
     *           返回指定 collection 支持的同步（线程安全的）collection。
     * static
     * <T> List<T>
     * synchronizedList(List<T> list)
     *           返回指定列表支持的同步（线程安全的）列表。
     * static
     * <K,V> Map<K,V>
     * synchronizedMap(Map<K,V> m)
     *           返回由指定映射支持的同步（线程安全的）映射。
     * static
     * <T> Set<T>
     * synchronizedSet(Set<T> s)
     *           返回指定 set 支持的同步（线程安全的）set。
     * static
     * <K,V> SortedMap<K,V>
     * synchronizedSortedMap(SortedMap<K,V> m)
     *           返回指定有序映射支持的同步（线程安全的）有序映射。
     * static
     * <T> SortedSet<T>
     * synchronizedSortedSet(SortedSet<T> s)
     *           返回指定有序 set 支持的同步（线程安全的）有序 set。
     * static
     * <T> Collection<T>
     * unmodifiableCollection(Collection<\? extends T> c)
     *           返回指定 collection 的不可修改视图。
     * static
     * <T> List<T>
     * unmodifiableList(List<\? extends T> list)
     *           返回指定列表的不可修改视图。
     * static
     * <K,V> Map<K,V>
     * unmodifiableMap(Map<\? extends K,? extends V> m)
     *           返回指定映射的不可修改视图。
     * static
     * <T> Set<T>
     * unmodifiableSet(Set<\? extends T> s)
     *           返回指定 set 的不可修改视图。
     * static
     * <K,V> SortedMap<K,V>
     * unmodifiableSortedMap(SortedMap<K,? extends V> m)
     *           返回指定有序映射的不可修改视图。
     * static
     * <T> SortedSet<T>
     * unmodifiableSortedSet(SortedSet<T> s)
     *           返回指定有序 set 的不可修改视图。
     */

    private  List<String> list1 = Lists.newArrayList("1","2","3","4","5");
    private  List<String> list2 = Lists.newArrayList("3","4","5");
    private String[] arr = {"6","7","8"};
    private Deque<String> deque = Queues.newArrayDeque(list2);

    @Test
    public void test(){
        //直接对原集合操作，加入多个元素,也可以将数组加入到集合中
        boolean b = Collections.addAll(list1, arr);
        //转换为后进先出队列视图
        Queue<String> strings = Collections.asLifoQueue(deque);
        //将所有元素从一个列表复制到另一个列表
        Collections.copy(list1,list2);
        //是否有相同元素
        boolean disjoint = Collections.disjoint(list1, list2);
        //使用指定元素替换指定列表中的所有元素
        Collections.fill(list1,"2");
        //返回等于指定元素的数量
        int frequency = Collections.frequency(list1, "2");
        //返回子列表在父列表中出现的位置
        int i1 = Collections.indexOfSubList(list1, list2);
        //查找最大值，最小值
        String max = Collections.max(list1);
        String min = Collections.min(list1);
        //返回对象复制n次后的列表
        List<Object> objects1 = Collections.nCopies(12, new Object());

        //返回不可变的空列表，集合，映射等
        List<Object> objects = Collections.emptyList();

        //二分法查找元素索引，对象
        int i = Collections.binarySearch(list1, "1");

        //返回安全视图，列表，映射，集，有序集合等
        Collection<String> strings1 = Collections.checkedCollection(list1, String.class);


    }

    public static void main(String[] args) {

        //1. 操作List
        operateList();
        //2. 查找替换
        findReplace();
        //3. 同步控制
        syncControl();
        //4. 设置不可变（只读）集合
        setReadOnly();
    }

    private static void operateList(){
        ArrayList nums =  new ArrayList();
        nums.add(8);
        nums.add(-3);
        nums.add(2);
        nums.add(9);
        nums.add(-2);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.shuffle(nums);
        System.out.println(nums);
        //下面只是为了演示定制排序的用法，将int类型转成string进行比较
        Collections.sort(nums, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);
                return s1.compareTo(s2);
            }

        });
        System.out.println(nums);
    }

    private static void findReplace(){
        ArrayList num =  new ArrayList();
        num.add(3);
        num.add(-1);
        num.add(-5);
        num.add(10);
        System.out.println(num);
        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));
        Collections.replaceAll(num, -1, -7);
        System.out.println(Collections.frequency(num, 3));
        Collections.sort(num);
        System.out.println(Collections.binarySearch(num, -5));
    }

    private static void syncControl(){
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set s = Collections.synchronizedSet(new HashSet());
        Map m = Collections.synchronizedMap(new HashMap());
    }

    private static void setReadOnly(){
        List lt = Collections.emptyList();
        Set st = Collections.singleton("avs");

        Map mp = new HashMap();
        mp.put("a",100);
        mp.put("b", 200);
        mp.put("c",150);
        Map readOnlyMap = Collections.unmodifiableMap(mp);

        //下面会报错
        lt.add(100);
        st.add("sdf");
        mp.put("d", 300);
    }
}
