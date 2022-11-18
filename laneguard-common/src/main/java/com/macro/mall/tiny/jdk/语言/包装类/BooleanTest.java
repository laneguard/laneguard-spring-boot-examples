package com.macro.mall.tiny.jdk.语言.包装类;

/**
 * @ClassName BooleanTest
 * @Author WB-918966
 * @Date 2022/11/2 17:51
 * @Version 1.0
 * java.lang.Boolean 类封装在一个对象基本布尔型的值。 Boolean类型的对象包含一个字段，它的类型是布尔值。
 * public final class Boolean
 *    extends Object
 *       implements Serializable, Comparable<Boolean>
 **/
public class BooleanTest {
    /**
     * 字段
     * static Boolean FALSE -- 这是对应于原始的Boolean对象的值false。
     *
     * static Boolean TRUE -- 这是对应于Boolean对象的原始值true 。
     *
     * static Class<Boolean> TYPE -- 这是代表基本布尔型的Class对象。
     */

    /**
     * 构造
     * 1	Boolean(boolean value)
     * 这代表分配值参数的Boolean对象。
     * 2	Boolean(String s)
     * 这表示分配Boolean对象的值为true，如果字符串参数不为null，等于忽略大小写的字符串“true”。
     */

    /**
     * 解析字符串，获取原始布尔值，包装原始布尔值
     * 1	boolean booleanValue()
     * 此方法将返回此布尔对象为布尔原始值。
     * 2	int compareTo(Boolean b)
     * 此方法将此Boolean实例与另一个对象实例进行比较。
     * 3	boolean equals(Object obj)
     * 当且仅当参数不为null，并且是一个布尔对象，表示同样的布尔值作为此对象时，此方法返回true。
     * 4	static boolean getBoolean(String name)
     * 当且仅当存在以参数命名的系统属性和等于该字符串“true”此方法返回true。
     * 5	int hashCode()
     * 此方法将返回这个布尔对象的哈希码。
     * 6	static boolean parseBoolean(String s)
     * 此方法解析字符串参数为布尔值。
     * 7	String toString()
     * 此方法将返回表示该布尔值的String对象。
     * 8	static String toString(boolean b)
     * 此方法将返回一个表示指定布尔的String对象。
     * 9	static Boolean valueOf(boolean b)
     * 此方法将返回一个表示指定布尔值的Boolean实例。
     * 10	static Boolean valueOf(String s)
     * 此方法返回一个布尔与指定字符串表示的值。
     */
    public static void main(String[] args) {
        Boolean a = true;
    }
}
