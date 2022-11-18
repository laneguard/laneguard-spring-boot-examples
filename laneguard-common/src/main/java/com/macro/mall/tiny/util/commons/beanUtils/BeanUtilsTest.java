package com.macro.mall.tiny.util.commons.beanUtils;

import lombok.SneakyThrows;
import org.junit.Test;

/**
 * 提供了对Java反射和内省的API的包装，依赖内省，
 * 其主要目的是利用反射机制对JavaBean的属性进行处理。
 * 我们知道一个JavaBean通常包含了大量的属性，很多情况下，对JavaBean的处理导致了大量的get/set
 * 代码堆积，增加了代码长度和阅读代码的难度，现在有了BeanUtils
 *    BeanUtils通过反射提供了Bean对象的一些便捷操作方法。
 */
public class BeanUtilsTest {
    /**
     * cloneBean(final Object bean)	Object
     * 克隆对象
     *
     * copyProperties(final Object dest, final Object orig)	void
     * 复制属性
     *
     * copyProperty(final Object bean, final String name, final Object value)	void
     * 复制属性，相当于设置属性
     *
     * describe(final Object bean)	Map<String, String>
     * 描述
     *
     * getArrayProperty(final Object bean, final String name)	String[]
     * 返回指定属性的值，作为字符串数组返回
     *
     * getIndexedProperty(final Object bean, final String name)	String
     * 获取指定索引位置对象作为字符串返回
     *
     * getIndexedProperty(final Object bean,final String name, final int index)	String
     * 获取指定索引位置对象作为字符串返回
     *
     * getMappedProperty(final Object bean, final String name)	String
     * 获得Map属性值作为字符串返回
     *
     * getMappedProperty(final Object bean, final String name, final String key)	String
     * 获得Map属性中指定键的值作为字符串返回
     *
     * getNestedProperty(final Object bean, final String name)	String
     * 获得嵌套属性作为字符串返回
     *
     * getProperty(final Object bean, final String name)	String
     * 获得属性值作为字符串返回
     *
     * getSimpleProperty(final Object bean, final String name)	String
     * 获得属性值作为字符串返回
     *
     * populate(final Object bean, final Map<String, ? extends Object> properties)	void
     * 将Map转换成对象
     *
     * setProperty(final Object bean, final String name, final Object value)	void
     * 设置属性值
     *
     * initCause(final Throwable throwable, final Throwable cause)	boolean
     * 对异常来进行包装的
     *
     * createCache()	Map<K, V>
     * 创建缓存
     *
     * getCacheFast(final Map<?, ?> map)	boolean
     *
     * setCacheFast(final Map<?, ?> map, final boolean fast)	void
     */
    @SneakyThrows
    @Test
    public void test() {
    }
}
