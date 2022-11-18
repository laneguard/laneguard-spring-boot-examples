package com.macro.mall.tiny.util.hutool.集合;

import java.util.Arrays;
import java.util.List;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.comparator.CompareUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.PageUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

/**
 * @ClassName ListUtilTest
 * @Author WB-918966
 * @Date 2022/10/24 14:16
 * @Version 1.0
 **/
public class ListUtilTest {
    @Test
    public void test(){
        //创建新列表
        ListUtil.toCopyOnWriteArrayList(ListUtil.list(false));
        ListUtil.toLinkedList();
        ListUtil.toLinkedList();

        //找到符合规则的元素的位置
        List<String> a = ListUtil.toLinkedList("1", "2", "3", "4", "3", "2", "1");
        // [1, 5]
        int[] indexArray = ListUtil.indexOfAll(a, "2"::equals);

        //截取列表
        final List<Integer> of = ListUtil.of(1, 2, 3, 4);
        final List<Integer> sub = ListUtil.sub(of, 2, 4);
        // 对子列表操作不影响原列表
        sub.remove(0);

        //元素位置互换
        List<Integer> list = Arrays.asList(7, 2, 8, 9);
        // 将元素8和第一个位置交换
        ListUtil.swapTo(list, 8, 1);
        //通过元素本身的特征进行交换
        //ListUtil.swapElement();

        //修改分页数量为1
        //对列表进行分页返回
        PageUtil.setFirstPageNo(1);
        List<String> page = ListUtil.page(2, 3, a);

        //拼音顺序排序
        List<String> list1 = ListUtil.sortByPinyin(a);
        //索引比较器，返回一个根据给定列表进行排序的比较器,可以指定索引来进行排序
        //CompareUtil.comparingIndexed();

        //列表分区，分区后的列表是原列表的视图
        List<List<String>> partition = ListUtil.partition(a, 5);

    }

    @Test
    public void test3(){
        List<String> a = ListUtil.toLinkedList("1", "2", "3", "4", "3", "2", "1");
        PageUtil.setFirstPageNo(1);
        List<String> page = ListUtil.page(2, 3, a);
        Console.log(page);
    }

    @Test
    public void test1(){
        //对集合按照指定长度分段，每一个段为单独的集合，返回这个集合的列表：
        List<List<Object>> lists = ListUtil.split(Arrays.asList(1, 2, 3, 4), 1);
        List<List<Object>> lists2 = ListUtil.split(null, 3);
        //平均分，指定要分成几份
        // [[1, 2, 3, 4]]
        List<List<Object>> lists3 = ListUtil.splitAvg(Arrays.asList(1, 2, 3, 4), 1);
        // [[1, 2], [3], [4]]
        lists3 = ListUtil.splitAvg(Arrays.asList(1, 2, 3, 4), 3);
    }

    @Test
    public void test2(){
        //按照列表中bean的属性排序
        final List<TestBean> beanList = ListUtil.toList(
            new TestBean(2, "test2"),
            new TestBean(1, "test1"),
            new TestBean(5, "test5"),
            new TestBean(4, "test4"),
            new TestBean(3, "test3")
        );

        final List<TestBean> order = ListUtil.sortByProperty(beanList, "order");

        List<TestBean> sort = ListUtil.sort(beanList, CompareUtil.comparingIndexed(TestBean::getOrder, true,
            Arrays.asList(2, 3, 5).toArray(new Integer[0])));
        Console.log(sort);
    }

    @Data
    @AllArgsConstructor
    class TestBean{
        private int order;
        private String name;
    }
}
