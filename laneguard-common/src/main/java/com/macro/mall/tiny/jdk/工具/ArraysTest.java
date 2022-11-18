package com.macro.mall.tiny.jdk.工具;

/**
 * @ClassName ArraysTest
 * @Author WB-918966
 * @Date 2022/11/2 10:05
 * @Version 1.0
 * java.util.Arrays类包含一个静态的工厂，允许数组被视为列表。以下是关于数组的要点：
 *
 * 这个类包含了各种方法来操作数组(比如排序和搜索)。
 *
 * 在这个类中的方法抛出NullPointerException如果指定数组引用为null。
 * public class Arrays
 *     extends Object
 **/
public class ArraysTest {

    /**
     * 数组转固定列表，数组二分查找，数组复制，数组严格相等，数组填充，数组排序数组转字符串
     *
     * 1	static <T> List<T> asList(T a)
     * 此方法返回一个受指定数组支持的固定大小的列表。
     *
     * 2	static int binarySearch(byte[] a, byte key)
     * 二分查找指定值返回索引
     *
     * 20	static boolean[] copyOf(boolean[] original, int newLength)
     * 此方法复制指定的数组，截取或填充false （如有必要），以使副本具有指定的长度。
     *
     * 30	static boolean[] copyOfRange(boolean[] original, int from, int to)
     * 此方法复制指定的数组到一个新的数组的指定范围。
     *
     * 40	static boolean deepEquals(Object[] a1, Object[] a2)
     * 如果两个指定数组相等此方法返回true。
     *
     * 41	static int deepHashCode(Object[] a)
     * 此方法返回基于指定数组的“深层内容”返回哈希码。
     *
     * 42	static String deepToString(Object[] a)
     * 此方法返回指定数组的“深层内容”的字符串表示形式。
     *
     * 43	static boolean equals(boolean[] a, boolean[] a2)
     * 如果布尔值的两个指定数组相互相等此方法返回true。
     *
     * 52	static void fill(boolean[] a, boolean val)
     * 此方法分配指定指定布尔值数组的每个元素。
     *
     * 70	static int hashCode(boolean[] a)
     * 此方法返回基于指定数组的内容的哈希码。
     *
     * 79	static void sort(byte[] a)
     * 此方法指定的字节数组排序按数字升序顺序。
     *
     * 97	static String toString(boolean[] a)
     * 此方法返回指定的boolean数组内容的字符串表示形式。
     */
}
