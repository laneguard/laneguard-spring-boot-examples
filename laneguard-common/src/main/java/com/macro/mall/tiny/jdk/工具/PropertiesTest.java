package com.macro.mall.tiny.jdk.工具;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * @ClassName PropertiesTest
 * @Author WB-918966
 * @Date 2022/11/4 10:50
 * @Version 1.0
 **/
public class PropertiesTest {
    /**
     * java.util.Properties类是代表一个持久的一套详细属性，属性可以被保存到一个流或从流中加载的类。以下是关于属性的要点：
     *
     * 属性列表中每个键及其对应值是一个字符串。
     *
     * 一个属性列表可包含另一个属性列表作为它的“默认”，第二个属性可在列表中搜索，如果没有在原有的属性列表中找到的属性键。
     *
     * 这个类是线程安全的;多个线程可以共享一个Properties对象，而不需要外部同步。
     *
     * 类的声明
     * 以下是java.util.Properties类的声明：
     *
     * public class Properties
     *     extends Hashtable<Object,Object>
     * 字段域
     * 下面是一个java.util.Properties类中的字段：
     *
     * protected Properties defaults -- 这是包含在属性列表中未找到任何键的默认值的属性列表。
     *
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	Properties()
     * 这种构造创建一个空的属性列表，没有默认值。
     * 2	Properties(Properties defaults)
     * 这种构造创建一个空的属性列表中具有指定默认值。类方法
     * S.N.	方法 & 描述
     * 1	String getProperty(String key)
     * 该方法将搜索具有此属性列表中指定键的属性。
     * 2	String getProperty(String key, String defaultValue)
     * 该方法将搜索具有此属性列表中指定键的属性。
     * 3	void list(PrintStream out)
     * 这种方法打印属性列表输出到指定的输出流。
     * 4	void list(PrintWriter out)
     * 这种方法打印属性列表输出到指定的输出流。
     * 5	void load(InputStream inStream)
     * 此方法读取属性列表(键和元素对)从输入字节流。
     * 6	void load(Reader reader)
     * 这个方法从一个简单的面向行的格式输入字符流中读取属性列表(键和元素对)。
     * 7	void loadFromXML(InputStream in)
     * 此方法加载所有指定的输入流中到此属性表中的XML文档所表示的所有属性。
     * 8	Enumeration<\?> propertyNames()
     * 此方法返回属性列表中所有键，包括默认属性列表中不同的键的枚举，如果尚未发现从主属性列表中名称相同的键。
     * 9	void save(OutputStream out, String comments)
     * 此方法读取a
     * 10	Object setProperty(String key, String value)
     * 此方法调用Hashtable的put()方法。
     * 11	void store(OutputStream out, String comments)
     * 该方法写入此属性列表(键和元素对)在此属性表中适于装成一个属性表中使用load(InputStream)方法的格式输出流。
     * 10	void store(Writer writer, String comments)
     * 该方法写入此属性列表(键和元素对)在此属性表中适合使用load(Reader)方法的格式输出字符流。
     * 11	void storeToXML(OutputStream os, String comment)
     * 这个方法会发出代表所有包含在此表中的属性的XML文档。
     * 12	void storeToXML(OutputStream os, String comment, String encoding)
     * 这个方法会发出代表所有包含在此表中的属性的XML文档，使用指定的编码。
     * 13	Set<String> stringPropertyNames()
     * 此方法返回一组键在此属性列表，其中的键及其对应值是字符串，包括默认属性列表中不同的键，如果尚未发现从主属性列表中同名的键。
     */

    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            Properties prop2 = new Properties();
            //             String path =Test.class.getClassLoader().getResource("example/china/test2.properties").getPath();
            //获得URL路径
            URL url= PropertiesTest.class.getClassLoader().getResource("example/china/test2.properties");
            //打印路径
            System.out.println("url.getFile()="+url.getFile());
            //将路径中的中文转码
            String path= URLDecoder.decode(url.getFile(), "utf-8");
            System.out.println("path="+path);
            //通过路径获得字节输入流
            InputStream input=new FileInputStream(path);
            //直接获得字节输入流
            InputStream in = PropertiesTest.class.getClassLoader().getResourceAsStream("example/china/test2.properties");

            prop.load(in);
            prop2.load(input);
            System.out.println("prop="+prop);
            System.out.println("prop2="+prop2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
