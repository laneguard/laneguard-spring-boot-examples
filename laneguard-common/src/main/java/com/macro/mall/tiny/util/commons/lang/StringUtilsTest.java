package com.macro.mall.tiny.util.commons.lang;

import java.util.Date;

import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

/**
 * @ClassName StringUtilsTest
 * @Author WB-918966
 * @Date 2022/10/25 11:59
 * @Version 1.0
 **/
public class StringUtilsTest {

    @Test
    public void test(){
        System.out.println(DateFormatUtils.format(new Date(), "yyyyMMdd"));
    }

    @Test
    public void test1(){
        //SystemUtils获取到常用的系统路径
        System.out.println(SystemUtils.getJavaIoTmpDir());
        System.out.println(SystemUtils.getJavaHome());
        System.out.println(SystemUtils.getUserDir());
        System.out.println(SystemUtils.getUserHome());
        System.out.println(SystemUtils.isJavaAwtHeadless());
    }

    @Test
    public void test2(){
        //随机生成数值
        System.out.println(RandomUtils.nextLong());
        System.out.println(RandomUtils.nextBoolean());
    }

    @Test
    public void test3(){
        //随机生成字符串
        System.out.println(RandomStringUtils.random(5));
        System.out.println(RandomStringUtils.randomAlphabetic(5));
        System.out.println(RandomStringUtils.randomGraph(10));
    }

}
