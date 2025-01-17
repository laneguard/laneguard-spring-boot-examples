package com.macro.mall.tiny.util.hutool.集合;

import java.util.List;

import cn.hutool.core.collection.IterUtil;
import cn.hutool.core.collection.ListUtil;
import org.junit.Test;

/**
 * @ClassName IterUtilTest
 * @Author WB-918966
 * @Date 2022/10/24 14:54
 * @Version 1.0
 **/
public class IterUtilTest {

    private List<String> a = ListUtil.of("a","a","b","c");

    @Test
    public void test(){
        //isEmpty 是否为null或者无元素
        //isNotEmpty 是否为非null或者至少一个元素
        //hasNull 是否有null元素
        //isAllNull 是否全部为null元素
        //countMap 根据集合返回一个元素计数的Map，所谓元素计数就是假如这个集合中某个元素出现了n次，那将这个元素做为key，n做为value
        //join 使用分隔符将集合转换为字符串
        //toMap toMap Entry列表转Map，或者key和value单独列表转Map
        //asIterator Enumeration转Iterator
        //asIterable Iterator转Iterable
        //getFirst 获取列表的第一个元素
        //getElementType 获取元素类型
        System.out.println(IterUtil.countMap(a.iterator()));
    }
}
