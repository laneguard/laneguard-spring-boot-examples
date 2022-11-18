package com.macro.mall.tiny.jdk.工具;

import java.util.ServiceLoader;

/**
 * @ClassName ServiceLoaderTest
 * @Author WB-918966
 * @Date 2022/11/4 11:02
 * @Version 1.0
 * jdk的服务发现机制，类似于springboot的starter，总是约定定义实现类的配置文件位置，然后用一个工具类读取配置实例化服务类
 * 我们可以简单的认为：ServiceLoader也像ClassLoader一样，能装载类文件，但是使用时有区别，具体区别如下：
 * （1） ServiceLoader装载的是一系列有某种共同特征的实现类，而ClassLoader是个万能加载器；
 * （2）ServiceLoader装载时需要特殊的配置，使用时也与ClassLoader有所区别；
 * （3）ServiceLoader还实现了Iterator接口
 **/
public class ServiceLoaderTest {
    /**
     * java.util.ServiceLoader 类是一个简单的服务提供者加载设施。以下是关于ServiceLoader要点：
     *
     * 服务装载机总是在调用者的安全上下文中执行。受信任的系统代码通常应该调用这个类的方法，而他们返回，优越的安全上下文中的迭代器的方法。
     *
     * 这个类实例多个并发线程使用是不安全的。
     *
     * 类声明
     * 以下是java.util.ServiceLoader类的声明：
     *
     * public final class ServiceLoader<S>
     *    extends Object
     *       implements Iterable<S>
     * 参数
     * 以下是java.util.ServiceLoader类参数：
     *
     * S -- 这是服务于这个加载器加载的类型。
     *
     * 类方法
     * S.N.	方法 & 描述
     * 1	Iterator<S> iterator()
     * 此方法加载这个加载器的服务提供者。
     * 2	public static <S> ServiceLoader<S> load(Class<S> service)
     * 此方法创建一个新的服务加载器给定服务类型，使用当前线程的上下文类加载器。
     * 3	public static <S> ServiceLoader<S> load(Class<S> service, ClassLoader loader)
     * 此方法创建一个新的服务加载器给定服务类型和类加载器。
     * 4	public static <S> ServiceLoader<S> loadInstalled(Class<S> service)
     * 此方法创建一个新的服务加载器给定服务类型，使用扩展类加载器。
     * 5	void reload()
     * 此方法清除该加载器的服务者缓存，所有的提供者将被重新加载。
     * 6	String toString()
     * 此方法返回描述此服务的字符串。
     */
    //基础服务：IService
    interface IService {
        String sayHello();
        String getScheme();
    }

    //服务实现
    class HDFSService implements IService {
        @Override
        public String sayHello() {
            return "Hello HDFSService";
        }
        @Override
        public String getScheme() {
            return "hdfs";
        }
    }

    //服务实现2
    class LocalService  implements IService {
        @Override
        public String sayHello() {
            return "Hello LocalService";
        }
        @Override
        public String getScheme() {
            return "local";
        }
    }

    //配置：META-INF/services/com.service.IService
    //com.impl.HDFSService
    //com.impl.LocalService

    //ServiceLoader可以根据IService把定义的两个实现类找出来，返回一个ServiceLoader的实现，
    // 而ServiceLoader实现了Iterable接口，所以可以通过ServiceLoader来遍历所有在配置文件中定义的类的实例。

    public static void main(String[] args) {
        //ServiceLoader去META-INF/services/下找特定的实现类返回实例
        ServiceLoader<IService> serviceLoader  = ServiceLoader.load(IService.class);
        for(IService service : serviceLoader) {
            System.out.println(service.getScheme()+"="+service.sayHello());
        }
    }
}