package com.macro.mall.tiny.util.hutool.多线程;

import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ConcurrencyTester;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.RandomUtil;
import org.junit.Test;

/**
 * @ClassName ConcurrencyTesterTest
 * @Author WB-918966
 * @Date 2022/10/22 22:12
 * @Version 1.0
 **/
public class ConcurrencyTesterTest {
    @Test
    public void test(){
        //并发测试
        ConcurrencyTester tester = ThreadUtil.concurrencyTest(100, () -> {
            // 测试的逻辑内容
            long delay = RandomUtil.randomLong(100, 1000);
            ThreadUtil.sleep(delay);
            Console.log("{} test finished, delay: {}", Thread.currentThread().getName(), delay);
        });

        // 获取总的执行时间，单位毫秒
        Console.log(tester.getInterval());
    }
}
