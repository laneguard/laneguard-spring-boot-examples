package com.macro.mall.tiny.jdk.语言.包装类;

/**
 * @ClassName ByteTest
 * @Author WB-918966
 * @Date 2022/11/16 16:45
 * @Version 1.0
 * 类 Byte
 * java.lang.Object
 *   继承者 java.lang.Number
 *       继承者 java.lang.Byte
 * 所有已实现的接口：
 * Serializable, Comparable<Byte>
 * public final class Byte
 * extends Number
 * implements Comparable<Byte>
 * Byte 类将基本类型 byte 的值包装在一个对象中。一个 Byte 类型的对象只包含一个类型为 byte 的字段。
 *
 * 此外，该类还为 byte 和 String 的相互转换提供了几种方法，并提供了处理 byte 时非常有用的其他一些常量和方法。
 **/
public class ByteTest {
    /**
     * 字段摘要
     * static byte	MAX_VALUE
     *           一个常量，保存 byte 类型可取的最大值，即 27-1。
     * static byte	MIN_VALUE
     *           一个常量，保存 byte 类型可取的最小值，即 -27。
     * static int	SIZE
     *           用于以二进制补码形式表示 byte 值的位数。
     * static Class<Byte>	TYPE
     *           表示基本类型 byte 的 Class 实例。
     *
     * 构造方法摘要
     * Byte(byte value)
     *           构造一个新分配的 Byte 对象，以表示指定的 byte 值。
     * Byte(String s)
     *           构造一个新分配的 Byte 对象，以表示 String 参数所指示的 byte 值。
     *
     * 方法摘要
     *  byte	byteValue()
     *           作为一个 byte 返回此 Byte 的值。
     *  int	compareTo(Byte anotherByte)
     *           在数字上比较两个 Byte 对象。
     * static Byte	decode(String nm)
     *           将 String 解码为 Byte。
     *  double	doubleValue()
     *           作为一个 double 返回此 Byte 的值。
     *  boolean	equals(Object obj)
     *           将此对象与指定对象比较。
     *  float	floatValue()
     *           作为一个 float 返回此 Byte 的值。
     *  int	hashCode()
     *           返回此 Byte 的哈希码。
     *  int	intValue()
     *           作为一个 int 返回此 Byte 的值。
     *  long	longValue()
     *           作为一个 long 返回此 Byte 的值。
     * static byte	parseByte(String s)
     *           将 string 参数解析为有符号的十进制 byte。
     * static byte	parseByte(String s, int radix)
     *           将 string 参数解析为一个有符号的 byte，其基数由第二个参数指定。
     *  short	shortValue()
     *           作为一个 short 返回此 Byte 的值。
     *  String	toString()
     *           返回表示此 Byte 的值的 String 对象。
     * static String	toString(byte b)
     *           返回表示指定 byte 的一个新 String 对象。
     * static Byte	valueOf(byte b)
     *           返回表示指定 byte 值的一个 Byte 实例。
     * static Byte	valueOf(String s)
     *           返回一个保持指定 String 所给出的值的 Byte 对象。
     * static Byte	valueOf(String s, int radix)
     *           返回一个 Byte 对象，该对象保持从指定的 String 中提取的值，该值是在用第二个参数所给定的基数对指定字符串进行解析时提取的。
     */
}
