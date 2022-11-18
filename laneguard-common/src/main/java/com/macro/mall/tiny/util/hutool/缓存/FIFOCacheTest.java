package com.macro.mall.tiny.util.hutool.缓存;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;
import cn.hutool.core.date.DateUnit;
import org.junit.Test;

/**
 * @ClassName FIFOCacheTest
 * @Author WB-918966
 * @Date 2022/10/21 16:24
 * @Version 1.0
 **/

/**
 * FIFO(first in first out) 先进先出策略。元素不停的加入缓存直到缓存满为止，当缓存满时，清理过期缓存对象，清理后依旧满则删除先入的缓存（链表首部对象）。
 *
 * 优点：简单快速 缺点：不灵活，不能保证最常用的对象总是被保留
 */
public class FIFOCacheTest {
    @Test
    public void test(){
        Cache<String,String> fifoCache = CacheUtil.newFIFOCache(3);

        //加入元素，每个元素可以设置其过期时长，DateUnit.SECOND.getMillis()代表每秒对应的毫秒数，在此为3秒
        fifoCache.put("key1", "value1", DateUnit.SECOND.getMillis() * 3);
        fifoCache.put("key2", "value2", DateUnit.SECOND.getMillis() * 3);
        fifoCache.put("key3", "value3", DateUnit.SECOND.getMillis() * 3);

        //由于缓存容量只有3，当加入第四个元素的时候，根据FIFO规则，最先放入的对象将被移除
        fifoCache.put("key4", "value4", DateUnit.SECOND.getMillis() * 3);

        //value1为null
        String value1 = fifoCache.get("key1");
    }
}
