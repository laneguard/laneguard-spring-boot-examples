package com.macro.mall.tiny.util.hutool.缓存;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.TimedCache;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.thread.ThreadUtil;
import org.junit.Test;

/**
 * @ClassName TimedCacheTest
 * @Author WB-918966
 * @Date 2022/10/21 16:35
 * @Version 1.0
 * 定时缓存，对被缓存的对象定义一个过期时间，当对象超过过期时间会被清理。
 * 此缓存没有容量限制，对象只有在过期后才会被移除。
 **/
public class TimedCacheTest {
    @Test
    public void test(){
        //创建缓存，默认4毫秒过期
        TimedCache<String, String> timedCache = CacheUtil.newTimedCache(4);
        //实例化创建
        //TimedCache<String, String> timedCache = new TimedCache<String, String>(4);

        timedCache.put("key1", "value1", 1);//1毫秒过期
        timedCache.put("key2", "value2", DateUnit.SECOND.getMillis() * 5);
        timedCache.put("key3", "value3");//默认过期(4毫秒)

        //启动定时任务，每5毫秒清理一次过期条目，注释此行首次启动仍会清理过期条目
        timedCache.schedulePrune(5);

        //等待5毫秒
        ThreadUtil.sleep(5);

        //5毫秒后由于value2设置了5毫秒过期，因此只有value2被保留下来
        String value1 = timedCache.get("key1");//null
        String value2 = timedCache.get("key2");//value2

        //5毫秒后，由于设置了默认过期，key3只被保留4毫秒，因此为null
        String value3 = timedCache.get("key3");//null

        //取消定时清理
        timedCache.cancelPruneSchedule();
        //说明 如果启动了定时器，那会定时清理缓存中的过期值，但是如果不起动，
        // 那只有在get这个值得时候才检查过期并清理。不起动定时器带来的问题是：有些值如果长时间不访问，会占用缓存的空间。
    }
}
