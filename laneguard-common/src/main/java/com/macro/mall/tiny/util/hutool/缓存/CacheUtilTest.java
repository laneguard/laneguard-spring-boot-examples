package com.macro.mall.tiny.util.hutool.缓存;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.LFUCache;
import org.junit.Test;

/**
 * @ClassName CacheUtilTest
 * @Author WB-918966
 * @Date 2022/10/21 16:22
 * @Version 1.0
 **/
public class CacheUtilTest {
    //CacheUtil是缓存创建的快捷工具类。用于快速创建不同的缓存对象。
    @Test
    public void test(){
        //新建FIFOCache
        Cache<String,String> fifoCache = CacheUtil.newFIFOCache(3);
        LFUCache<String, String> objects = CacheUtil.newLFUCache(3);
        //...
    }
}
