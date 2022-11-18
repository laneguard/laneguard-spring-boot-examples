package com.macro.mall.tiny.designPattern.代理;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void test(){
        //实例化一个 Person 对象 wolfer
        Person wolfer = new Person();
        //由于动态代理的第 3 个参数 InvocationHandler 是仅有一个方法的接口，
        //因此可以简化为 Lambda 表达式的编写方式
        PersonInterface wolferProxy = (PersonInterface) Proxy.newProxyInstance(
                //被代理实例的类加载器
                wolfer.getClass().getClassLoader(),
                //被代理类的接口
                wolfer.getClass().getInterfaces(),
                //* proxy:代表动态代理对象
                //* method：代表正在执行的方法
                //* args：代表调用目标方法时传入的实参
                (proxy, method, proxyArgs) -> {
                    try {
                        if ("Morning".equals(method.getName())) {
                            System.out.println("上午：睡到自然醒，然后起床...");
                            return method.invoke(wolfer, proxyArgs);
                        } else if ("Afternoon".equals(method.getName())) {
                            Object obj = method.invoke(wolfer, proxyArgs);
                            System.out.println("下午：去吃个大餐，补充能量...");
                            return obj;
                        } else if ("Evening".equals(method.getName())) {
                            System.out.println("傍晚：灯红酒绿，纸醉金迷...");
                            return null;
                        } else {
                            return method.invoke(wolfer, proxyArgs);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        return null;
                    }
                }
        );
    }
}
