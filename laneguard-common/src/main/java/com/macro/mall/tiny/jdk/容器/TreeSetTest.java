package com.macro.mall.tiny.jdk.容器;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName TreeSetTest
 * @Author WB-918966
 * @Date 2022/11/7 11:06
 * @Version 1.0
 * 类 TreeSet<E>
 * java.lang.Object
 *   继承者 java.util.AbstractCollection<E>
 *       继承者 java.util.AbstractSet<E>
 *           继承者 java.util.TreeSet<E>
 * 类型参数：
 * E - 此 set 维护的元素的类型
 * 所有已实现的接口：
 * Serializable, Cloneable, Iterable<E>, Collection<E>, NavigableSet<E>, Set<E>, SortedSet<E>
 *此实现不是同步的。如果多个线程同时访问一个 TreeSet，而其中至少一个线程修改了该 set，那么它必须 外部同步。
 * 这一般是通过对自然封装该 set 的对象执行同步操作来完成的。
 * 如果不存在这样的对象，则应该使用 Collections.synchronizedSortedSet 方法来“包装”该 set。
 **/
public class TreeSetTest {
    /**
     * 构造方法摘要
     * TreeSet()
     *           构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
     * TreeSet(Collection<? extends E> c)
     *           构造一个包含指定 collection 元素的新 TreeSet，它按照其元素的自然顺序进行排序。
     * TreeSet(Comparator<? super E> comparator)
     *           构造一个新的空 TreeSet，它根据指定比较器进行排序。
     * TreeSet(SortedSet<E> s)
     *           构造一个与指定有序 set 具有相同映射关系和相同排序的新 TreeSet。
     *
     * 方法摘要
     *  boolean	add(E e)
     *           将指定的元素添加到此 set（如果该元素尚未存在于 set 中）。
     *  boolean	addAll(Collection<? extends E> c)
     *           将指定 collection 中的所有元素添加到此 set 中。
     *  E	ceiling(E e)
     *           返回此 set 中大于等于给定元素的最小元素；如果不存在这样的元素，则返回 null。
     *  void	clear()
     *           移除此 set 中的所有元素。
     *  Object	clone()
     *           返回 TreeSet 实例的浅表副本。
     *  Comparator<? super E>	comparator()
     *           返回对此 set 中的元素进行排序的比较器；如果此 set 使用其元素的自然顺序，则返回 null。
     *  boolean	contains(Object o)
     *           如果此 set 包含指定的元素，则返回 true。
     *  Iterator<E>	descendingIterator()
     *           返回在此 set 元素上按降序进行迭代的迭代器。
     *  NavigableSet<E>	descendingSet()
     *           返回此 set 中所包含元素的逆序视图。
     *  E	first()
     *           返回此 set 中当前第一个（最低）元素。
     *  E	floor(E e)
     *           返回此 set 中小于等于给定元素的最大元素；如果不存在这样的元素，则返回 null。
     *  SortedSet<E>	headSet(E toElement)
     *           返回此 set 的部分视图，其元素严格小于 toElement。
     *  NavigableSet<E>	headSet(E toElement, boolean inclusive)
     *           返回此 set 的部分视图，其元素小于（或等于，如果 inclusive 为 true）toElement。
     *  E	higher(E e)
     *           返回此 set 中严格大于给定元素的最小元素；如果不存在这样的元素，则返回 null。
     *  boolean	isEmpty()
     *           如果此 set 不包含任何元素，则返回 true。
     *  Iterator<E>	iterator()
     *           返回在此 set 中的元素上按升序进行迭代的迭代器。
     *  E	last()
     *           返回此 set 中当前最后一个（最高）元素。
     *  E	lower(E e)
     *           返回此 set 中严格小于给定元素的最大元素；如果不存在这样的元素，则返回 null。
     *  E	pollFirst()
     *           获取并移除第一个（最低）元素；如果此 set 为空，则返回 null。
     *  E	pollLast()
     *           获取并移除最后一个（最高）元素；如果此 set 为空，则返回 null。
     *  boolean	remove(Object o)
     *           将指定的元素从 set 中移除（如果该元素存在于此 set 中）。
     *  int	size()
     *           返回 set 中的元素数（set 的容量）。
     *  NavigableSet<E>	subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
     *           返回此 set 的部分视图，其元素范围从 fromElement 到 toElement。
     *  SortedSet<E>	subSet(E fromElement, E toElement)
     *           返回此 set 的部分视图，其元素从 fromElement（包括）到 toElement（不包括）。
     *  SortedSet<E>	tailSet(E fromElement)
     *           返回此 set 的部分视图，其元素大于等于 fromElement。
     *  NavigableSet<E>	tailSet(E fromElement, boolean inclusive)
     *           返回此 set 的部分视图，其元素大于（或等于，如果 inclusive 为 true）fromElement。
     */

    public static void main(String[] args) {
        testTreeSetAPIs();
    }

    // 测试TreeSet的api
    public static void testTreeSetAPIs() {
        String val;

        // 新建TreeSet
        TreeSet tSet = new TreeSet();
        // 将元素添加到TreeSet中
        tSet.add("aaa");
        // Set中不允许重复元素，所以只会保存一个“aaa”
        tSet.add("aaa");
        tSet.add("bbb");
        tSet.add("eee");
        tSet.add("ddd");
        tSet.add("ccc");
        System.out.println("TreeSet:"+tSet);

        // 打印TreeSet的实际大小
        System.out.printf("size : %d\n", tSet.size());

        // 导航方法
        // floor(小于、等于)
        System.out.printf("floor bbb: %s\n", tSet.floor("bbb"));
        // lower(小于)
        System.out.printf("lower bbb: %s\n", tSet.lower("bbb"));
        // ceiling(大于、等于)
        System.out.printf("ceiling bbb: %s\n", tSet.ceiling("bbb"));
        System.out.printf("ceiling eee: %s\n", tSet.ceiling("eee"));
        // ceiling(大于)
        System.out.printf("higher bbb: %s\n", tSet.higher("bbb"));
        // subSet()
        System.out.printf("subSet(aaa, true, ccc, true): %s\n", tSet.subSet("aaa", true, "ccc", true));
        System.out.printf("subSet(aaa, true, ccc, false): %s\n", tSet.subSet("aaa", true, "ccc", false));
        System.out.printf("subSet(aaa, false, ccc, true): %s\n", tSet.subSet("aaa", false, "ccc", true));
        System.out.printf("subSet(aaa, false, ccc, false): %s\n", tSet.subSet("aaa", false, "ccc", false));
        // headSet()
        System.out.printf("headSet(ccc, true): %s\n", tSet.headSet("ccc", true));
        System.out.printf("headSet(ccc, false): %s\n", tSet.headSet("ccc", false));
        // tailSet()
        System.out.printf("tailSet(ccc, true): %s\n", tSet.tailSet("ccc", true));
        System.out.printf("tailSet(ccc, false): %s\n", tSet.tailSet("ccc", false));


        // 删除“ccc”
        tSet.remove("ccc");
        // 将Set转换为数组
        String[] arr = (String[])tSet.toArray(new String[0]);
        for (String str:arr)
            System.out.printf("for each : %s\n", str);

        // 打印TreeSet
        System.out.printf("TreeSet:%s\n", tSet);

        // 遍历TreeSet
        for(Iterator iter = tSet.iterator(); iter.hasNext(); ) {
            System.out.printf("iter : %s\n", iter.next());
        }

        // 删除并返回第一个元素
        val = (String)tSet.pollFirst();
        System.out.printf("pollFirst=%s, set=%s\n", val, tSet);

        // 删除并返回最后一个元素
        val = (String)tSet.pollLast();
        System.out.printf("pollLast=%s, set=%s\n", val, tSet);

        // 清空HashSet
        tSet.clear();

        // 输出HashSet是否为空
        System.out.printf("%s\n", tSet.isEmpty()?"set is empty":"set is not empty");
    }
}
