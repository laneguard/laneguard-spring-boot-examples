package com.macro.mall.tiny.util.commons.beanUtils;

import org.junit.Test;

/**
 * @ClassName PropertyUtilsTest
 * @Author WB-918966
 * @Date 2022/10/25 10:19
 * @Version 1.0
 * PropertyUtils通过反射对对象的属性做各种操作。
 **/
public class PropertyUtilsTest {
    /**
     * clearDescriptors()	void
     * 清空所有属性描述信息
     *
     * resetBeanIntrospectors()	void
     * 重置BeanIntrospector
     *
     * addBeanIntrospector(final BeanIntrospector introspector)	void
     * 添加一个BeanIntrospector
     *
     * removeBeanIntrospector(final BeanIntrospector introspector)	boolean
     * 移除BeanIntrospector
     *
     * copyProperties(final Object dest, final Object orig)	void
     * 复制属性
     *
     * describe(final Object bean)	Map<String, Object>
     * 属性描述，key属性名，value属性值
     *
     * getIndexedProperty(final Object bean, final String name)	Object
     * 指定索引属性值，适用于属性是list或者array的情况
     *
     * getIndexedProperty(final Object bean,final String name, final int index)	Object
     * 指定索引属性值，适用于属性是list或者array的情况
     *
     * getMappedProperty(final Object bean, final String name)	Object
     * 获得Map属性，适用于属性是Map的情况
     *
     * getMappedProperty(final Object bean,final String name, final String key)	Object
     * 获得Map属性中指定键对应的值，适用于属性是Map的情况
     *
     * getNestedProperty(final Object bean, final String name)	Object
     * 获得嵌套属性，属性是对象的情况
     *
     * getProperty(final Object bean, final String name)	Object
     * 获得属性
     *
     * getPropertyDescriptor(final Object bean,final String name)	PropertyDescriptor
     * 获取属性描述
     *
     * getPropertyDescriptors(final Class<?> beanClass)	PropertyDescriptor[]
     * 获得属性描述
     *
     * getPropertyDescriptors(final Object bean)	PropertyDescriptor[]
     * 获得属性描述
     *
     * getPropertyEditorClass(final Object bean, final String name)	Class<?>
     *     获得已为此属性注册的任何显式 PropertyEditor Class
     *
     * getPropertyType(final Object bean, final String name)	Class<?>
     *     获得属性类型
     *
     * getReadMethod(final PropertyDescriptor descriptor)	Method
     * 返回一个可访问的属性的getter方法
     *
     * getSimpleProperty(final Object bean, final String name)	Object
     * 返回属性值
     *
     * getWriteMethod(final PropertyDescriptor descriptor)	Method
     * 返回一个可访问的属性的setter方法
     *
     * isReadable(final Object bean, final String name)	boolean
     * 判断是否为可读属性
     *
     * isWriteable(final Object bean, final String name)	boolean
     * 判断是否为可写属性
     *
     * setIndexedProperty(final Object bean, final String name,final Object value)	void
     *设置指定索引属性值，适用于属性是list或者array的情况
     *
     * setIndexedProperty(final Object bean, final String name, final int index, final Object value)	void
     *设置指定索引属性值，适用于属性是list或者array的情况
     *
     * setMappedProperty(final Object bean, final String name,final Object value)	void
     * 设置Map属性的值
     *
     * setMappedProperty(final Object bean, final String name, final String key, final Object value)	void
     * 设置Map属性的值
     *
     * setNestedProperty(final Object bean, final String name, final Object value)	void
     * 设置嵌套属性的值
     *
     * setProperty(final Object bean, final String name, final Object value)	void
     * 设置属性值
     *
     * setSimpleProperty(final Object bean, final String name, final Object value)	void
     * 设置属性值
     */
    @Test
    public void test(){

    }

}
