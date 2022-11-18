package com.macro.mall.tiny.util.hutool.集合;

import java.util.ArrayList;
import java.util.Comparator;

import cn.hutool.core.collection.BoundedPriorityQueue;
import org.junit.Test;

/**
 * @ClassName BoundedPriorityQueueTest
 * @Author WB-918966
 * @Date 2022/10/24 14:59
 * @Version 1.0
 * 有界优先队列
 **/
public class BoundedPriorityQueueTest {
    @Test
    public void test(){
        //初始化队列，设置队列的容量为5（只能容纳5个元素），元素类型为integer使用默认比较器，在队列内部将按照从小到大排序
        BoundedPriorityQueue<Integer> queue = new BoundedPriorityQueue<Integer>(5);

        //初始化队列，使用自定义的比较器
        queue = new BoundedPriorityQueue<>(5, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        //定义了6个元素，当元素加入到队列中，会按照从小到大排序，当加入第6个元素的时候，队列末尾（最大的元素）将会被抛弃
        int[] array = new int[]{5,7,9,2,3,8};
        for (int i : array) {
            queue.offer(i);
        }

        //队列可以转换为List哦~~
        ArrayList<Integer> list = queue.toList();

        System.out.println(queue);
    }
}
