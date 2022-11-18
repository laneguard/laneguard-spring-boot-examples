package com.macro.mall.tiny.util.commons.beanUtils;

import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @ClassName ConvertUtilsTest
 * @Author WB-918966
 * @Date 2022/10/25 10:33
 * @Version 1.0
 **/
public class ConvertUtilsTest {
    /**
     * convert(final Object value)	String
     * 将对象转换为字符串
     *
     * convert(final String value, final Class<?> clazz)	Object
     * 将字符串转换为指定数据类型对象
     *
     * convert(final String[] values, final Class<?> clazz)	Object
     * 将数组转换为指定数据类型对象
     *
     * convert(final Object value, final Class<?> targetType)	Object
     * 将对象转换为指定数据类型对象
     *
     * deregister()	void
     * 移除所有已经注册的转换器
     *
     * deregister(final Class<?> clazz)	void
     * 移除指定类型的转换器
     *
     * lookup(final Class<?> clazz)	Converter
     * 查找指定类型的转换器
     *
     * lookup(final Class<?> sourceType, final Class<?> targetType)	Converter
     * 查找将指定类型转换为另一种类型的转换器
     *
     * register(final Converter converter, final Class<?> clazz)	void
     * 注册转换器
     *
     * primitiveToWrapper(final Class<T> type)	Class<T>
     *     基本类型转换成包装类
     *     */
    @SneakyThrows
    @Test
    public void test(){
        Class<?> aClass = Class.forName("java.lang.String");
        Object s = "hello";
        //根据class对象进行类型转换
        Object cast = aClass.cast(s);
    }
}
