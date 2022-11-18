package com.macro.mall.tiny;

import java.util.ArrayList;

import cn.hutool.core.convert.Convert;
import com.google.common.collect.Lists;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallTinyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallTinyApplication.class, args);
    }

    @Test
    public void test1(){
        ArrayList<@Nullable Object> objects = Lists.newArrayList();
        Object s = "hello world";
        Convert.convertByClassName("java.lang.String", s);
    }

}
