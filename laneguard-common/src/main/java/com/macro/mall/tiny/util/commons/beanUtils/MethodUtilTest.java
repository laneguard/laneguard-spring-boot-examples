package com.macro.mall.tiny.util.commons.beanUtils;

import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @ClassName MethodUtilTest
 * @Author WB-918966
 * @Date 2022/10/25 10:09
 * @Version 1.0
 *    MethodUtils通过反射对对象的方法做各种各样的操作。
 **/
public class MethodUtilTest {

    /**
     * setCacheMethods(final boolean cacheMethods)	void
     * 设置是否缓存方法(缓存可以提高性能)
     *
     * clearCache()	int
     * 清空方法缓存
     *
     * invokeMethod(final Object object,final String methodName,final Object arg)	Object
     * 执行方法
     *
     * invokeMethod(final Object object,final String methodName,Object[] args)	Object
     * 执行方法
     *
     * invokeMethod(final Object object,final String methodName,Object[] args,Class<?>[] parameterTypes)	Object
     * 执行方法
     *
     * invokeExactMethod(final Object object,final String methodName,final Object arg)	Object
     * 执行方法
     *
     * invokeExactMethod(final Object object,final String methodName,Object[] args)	Object
     * 执行方法
     *
     * invokeExactMethod(final Object object,final String methodName,Object[] args,Class<?>[] parameterTypes)
     * Object
     * 执行方法
     *
     * invokeExactStaticMethod(final Object object,final String methodName,final Object arg)	Object
     * 执行静态方法
     *
     * invokeExactStaticMethod(final Object object,final String methodName,Object[] args)	Object
     * 执行静态方法
     *
     * invokeExactStaticMethod(final Object object,final String methodName,Object[] args,Class<?>[] parameterTypes)
     * Object	执行静态方法
     *
     * invokeStaticMethod(final Object object,final String methodName,final Object arg)	Object
     * 执行静态方法
     *
     * invokeStaticMethod(final Object object,final String methodName,Object[] args)	Object
     * 执行静态方法
     *
     * invokeStaticMethod(final Object object,final String methodName,Object[] args,Class<?>[] parameterTypes)
     * Object
     * 执行静态方法
     *
     * getAccessibleMethod(final Class<?> clazz,final String methodName,final Class<?> parameterType)	Method
     * 返回一个可访问的方法
     *
     * getAccessibleMethod(final Class<?> clazz,final String methodName,final Class<?>[] parameterTypes)	Method
     * 返回一个可访问的方法
     *
     * getAccessibleMethod(final Method method)	Method
     * 返回一个可访问的方法
     *
     * getAccessibleMethod(Class<?> clazz, Method method)	Method
     * 返回一个可访问的方法
     *
     * getMatchingAccessibleMethod(final Class<?> clazz,final String methodName,final Class<?>[] parameterTypes)
     * Method	查找与方法名及参数匹配的可访问方法
     *
     * isAssignmentCompatible(final Class<?> parameterType, final Class<?> parameterization)	boolean
     * 确定是否可以使用一个类型作为方法调用参数
     *
     * getPrimitiveWrapper(final Class<?> primitiveType)	Class<?>
     * 获得基本数据类型的包装类型
     *
     * getPrimitiveType(final Class<?> wrapperType)	Class<?>
     * 获得包装类的基本数据类型
     *
     * toNonPrimitiveClass(final Class<?> clazz)	Class<?>
     * 如果是简单数据类型则返回对应的包装类，否则返回本身
     */
    @SneakyThrows
    @Test
    public void test(){
    }
}
