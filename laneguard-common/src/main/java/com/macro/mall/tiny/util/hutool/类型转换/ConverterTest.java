package com.macro.mall.tiny.util.hutool.类型转换;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import org.junit.Test;

import java.util.List;

public class ConverterTest {
    @Test
    public void test1(){
        Object[] a = { "a", "你", "好", "", 1 };
        List<String> list = Convert.convert(new TypeReference<List<String>>() {}, a);

    }
}
