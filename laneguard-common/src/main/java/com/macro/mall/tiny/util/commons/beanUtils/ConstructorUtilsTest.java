package com.macro.mall.tiny.util.commons.beanUtils;

import org.junit.Test;

/**
 * @ClassName ConstructorUtilsTest
 * @Author WB-918966
 * @Date 2022/10/25 10:17
 * @Version 1.0
 *    ConstructorUtils通过反射对对象的构造方法做各种操作。
 **/
public class ConstructorUtilsTest {
    /**
     * invokeConstructor(final Class<T> klass, final Object arg)	T
     * 执行构造方法
     *
     * invokeConstructor(final Class<T> klass, Object[] args)	T
     * 执行构造方法
     *
     * invokeConstructor(final Class<T> klass,Object[] args,Class<?>[] parameterTypes)	T
     * 执行构造方法
     *
     * invokeExactConstructor(final Class<T> klass, final Object arg)	T
     * 执行构造方法
     *
     * invokeExactConstructor(final Class<T> klass, Object[] args)	T
     * 执行构造方法
     *
     * invokeExactConstructor(final Class<T> klass,Object[] args,Class<?>[] parameterTypes)	T
     * 执行构造方法
     *
     * getAccessibleConstructor(final Class<T> klass,final Class<?> parameterType)	Constructor<T>
     * 获得含有一个形参的构造方法
     *
     * getAccessibleConstructor(final Class<T> klass,final Class<?>[] parameterTypes)	Constructor<T>
     * 获得含有指定类型形参的构造方法
     *
     * getAccessibleConstructor(final Constructor<T> ctor)	Constructor<T>
     * 获得可访问构造方法
     */
    @Test
    public void test(){

    }
}
