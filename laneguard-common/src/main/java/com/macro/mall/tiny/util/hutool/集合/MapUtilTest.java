package com.macro.mall.tiny.util.hutool.集合;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.hutool.core.lang.TypeReference;
import cn.hutool.core.map.BiMap;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.map.TableMap;
import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * @ClassName MapUtilTest
 * @Author WB-918966
 * @Date 2022/10/24 15:02
 * @Version 1.0
 **/
public class MapUtilTest {
    Map<String, String> build;

    {
        Map<String, String> map = MapUtil.builder(new HashMap<String, String>())
            .put("key1", "value1")
            .put("key3", "value3")
            .put("key2", "value2").build();
        build = map;
    }

    @Test
    public void test(){
        //快速创建一个map
        Map<Object, Object> colorMap = MapUtil.of(new String[][] {
            {"RED", "#FF0000"},
            {"GREEN", "#00FF00"},
            {"BLUE", "#0000FF"}
        });

        //多个map中，相同的key对应的值进行合并，类似于分组
        MapUtil.toListMap(Lists.newArrayList());

        //key value之间用分隔符连接
        Map<String, String> build = MapUtil.builder(new HashMap<String, String>())
            .put("key1", "value1")
            .put("key3", "value3")
            .put("key2", "value2").build();
        String join1 = MapUtil.sortJoin(build, StrUtil.EMPTY, StrUtil.EMPTY, false);

        //key value互换
        MapUtil.reverse(build);

        //key重命名
        //MapUtil.renameKey();
    }

    @Test
    public void test1(){
        //创建一个新的map
        MapUtil.newHashMap();
        MapUtil.newTreeMap(null);
        MapUtil.newConcurrentHashMap();
        MapUtil.newIdentityMap(1);
    }

    @Test
    public void test3(){
        //双向查找map
        BiMap<String, Integer> biMap = new BiMap<>(new HashMap<>());
        biMap.put("aaa", 111);
        biMap.put("bbb", 222);

        // 111
        biMap.get("aaa");
        // 222
        biMap.get("bbb");

        // aaa
        biMap.getKey(111);
        // bbb
        biMap.getKey(222);
    }

    @Test
    public void test4(){
        //键值对可重复的map
        TableMap<String, Integer> tableMap = new TableMap<String, Integer>(1);
        tableMap.put("aaa", 111);
        tableMap.put("bbb", 222);

        // 111
        tableMap.get("aaa");
        // 222
        tableMap.get("bbb");

        // aaa
        tableMap.getKey(111);
        // bbb
        tableMap.getKey(222);

        // [111]
        tableMap.getValues("aaa");

        //[aaa]
        tableMap.getKeys(111);
    }

    @Test
    public void test2(){
        //获取Map指定key的值，并转换为指定类型，转换失败后返回null，不抛异常
        MapUtil.getQuietly(build,"key",String.class,"default");
        //泛型通知
        MapUtil.getQuietly(build, "key", new TypeReference<List<String>>() {},Lists.newArrayList());
    }
}
