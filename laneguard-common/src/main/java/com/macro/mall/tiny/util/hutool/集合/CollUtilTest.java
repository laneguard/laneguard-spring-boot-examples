package com.macro.mall.tiny.util.hutool.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.map.MapUtil;
import org.junit.Test;

/**
 * @ClassName CollUtilTest
 * @Author WB-918966
 * @Date 2022/10/20 10:49
 * @Version 1.0
 **/
public class CollUtilTest {
    //新建三个列表，CollUtil.newArrayList方法表示新建ArrayList并填充元素
    List<Integer> list1 = CollUtil.newArrayList(1, 2, 3);
    List<Integer> list2 = CollUtil.newArrayList(4, 5, 6);
    List<Integer> list3 = CollUtil.newArrayList(7, 8, 9);


    @Test
    public void test1(){
        String[] col= new String[]{"a","b","c","d","e"};
        List<String> colList = CollUtil.newArrayList(col);
        //连接集合元素为字符串
        String str = CollUtil.join(colList, "#"); //str -> a#b#c#d#e
    }

    @Test
    //多个集合合并，然后排序，然后用分页参数取其中的元素
    public void test2(){
        //Integer比较器
        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        //参数表示把list1,list2,list3合并并按照从小到大排序后，取0~2个（包括第0个，不包括第2个），结果是[1,2]
        @SuppressWarnings("unchecked")
        List<Integer> result = CollUtil.sortPageAll(0, 2, comparator, list1, list2, list3);
        System.out.println(result);     //输出 [1,2]
    }

    @Test
    public void test3(){
        //合并多个元素
        Collection<Integer> integers = CollUtil.addAll(list1, list2);
        //集合切片，不会产生越界
        List<Integer> sub = CollUtil.sub(list1, 1, 2);
    }

    @Test
    public void test4(){
        //两个列表按顺序形成映射
        Collection<String> keys = CollUtil.newArrayList("a", "b", "c", "d");
        Collection<Integer> values = CollUtil.newArrayList(1, 2, 3, 4);

        // {a=1,b=2,c=3,d=4}
        Map<String, Integer> map = CollUtil.zip(keys, values);
    }

    @Test
    public void test5(){
        //并集
        Collection<Integer> union = CollUtil.union(list1, list2);
        //可以直接转换为list，以实际类型为准
        List<Integer> union1 = (List<Integer>)union;
        Console.log(union1);

        //交集
        Collection<Integer> intersection = CollUtil.intersection(list1, list2);
        Console.log(intersection);

        //差集
        Collection<Integer> disjunction = CollUtil.disjunction(list1, list2);
        Console.log(disjunction);

        //计算集合的单差集，即只返回【集合1】中有，但是【集合2】中没有的元素，例如：
        //	       subtract([1,2,3,4],[2,3,4,5]) -》 [1]
        Collection<Integer> subtract = CollUtil.subtract(list1, list2);
        Console.log(subtract);

        //元素的计数
        Map<Integer, Integer> integerIntegerMap = CollUtil.countMap(list1);
        Console.log(integerIntegerMap);

        //去除重复，原理是set的构造器
        ArrayList<Integer> distinct = CollUtil.distinct(list1);
        Console.log(distinct);

        //列表分片，指定分片长度
        List<List<Integer>> split = CollUtil.split(list1, 2);
        Console.log(split);

        //常用容器构造
        HashMap<Object, Object> objectObjectHashMap = MapUtil.newHashMap();
        HashSet<Object> objects = CollUtil.newHashSet();
        LinkedHashSet<Object> objects1 = CollUtil.newLinkedHashSet();
        ArrayList<Object> objects2 = CollUtil.newArrayList();
        CopyOnWriteArrayList<Object> objects3 = CollUtil.newCopyOnWriteArrayList(CollUtil.newArrayList());
        //BlockingQueue通常用于使线程产生对象，而另一线程则使用该对象。
        BlockingQueue<Object> objects4 = CollUtil.newBlockingQueue(100, true);

        //抽取bean的属性值形成新列表
        //CollUtil.extract()

        //指定bean的字段名，抽取形成新列表，底层使用反射ReflectUtil.getFieldValue(bean, fieldName);
        //getFieldValues

        //计算匹配规则的元素数量
        //count

        //填充集合元素以满足最小长度限制
        //padLeft
    }

    @Test
    public void test6() throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = CollUtil.newBlockingQueue(1, true);
        AtomicInteger count = new AtomicInteger(0);
        new Thread(()->{
            List<Integer> list = CollUtil.list(false, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            for (Integer integer : list) {
                try {
                    Console.log(Thread.currentThread().getName()+"putting element "+list.get(count.get())+"...");
                    blockingQueue.put(list.get(count.getAndAdd(1)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    Console.log(Thread.currentThread().getName()+"taking element ...");
                    Integer take = blockingQueue.take();
                    Console.log(Thread.currentThread().getName()+"taked element "+take+"...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(20000);
    }



}
