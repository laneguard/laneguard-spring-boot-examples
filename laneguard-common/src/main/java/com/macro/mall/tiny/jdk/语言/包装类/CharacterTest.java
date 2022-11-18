package com.macro.mall.tiny.jdk.语言.包装类;

/**
 * @ClassName CharacterTest
 * @Author WB-918966
 * @Date 2022/11/16 16:47
 * @Version 1.0
 * 类 Character
 * java.lang.Object
 *   继承者 java.lang.Character
 * 所有已实现的接口：
 * Serializable, Comparable<Character>
 * public final class Character
 * extends Object
 * implements Serializable, Comparable<Character>
 * Character 类在对象中包装一个基本类型 char 的值。Character 类型的对象包含类型为 char 的单个字段。
 *
 * 此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然。
 *
 * Character.Subset	此类的实例表示 Unicode 字符集的特定子集。
 * Character.UnicodeBlock	表示 Unicode 规范中字符块的一系列字符子集。
 **/
public class CharacterTest {
    /**
     * 构造方法摘要
     * Character(char value)
     *           构造一个新分配的 Character 对象，用以表示指定的 char 值。
     *
     * 方法摘要
     * static int	charCount(int codePoint)
     *           确定表示指定字符（Unicode 代码点）所需的 char 值的数量。
     *  char	charValue()
     *           返回此 Character 对象的值。
     * static int	codePointAt(char[] a, int index)
     *           返回 char 数组的给定索引上的代码点。
     * static int	codePointAt(char[] a, int index, int limit)
     *           返回 char 数组的给定索引上的代码点，该数组中只有那些具有小于 limit 的 index 值的数组元素可以使用。
     * static int	codePointAt(CharSequence seq, int index)
     *           返回 CharSequence 的给定索引上的代码点。
     * static int	codePointBefore(char[] a, int index)
     *           返回 char 数组的给定索引前面的代码点。
     * static int	codePointBefore(char[] a, int index, int start)
     *           返回 char 数组的给定索引前面的代码点，该数组中只有那些具有大于等于 start 的 index 值的数组元素可以使用。
     * static int	codePointBefore(CharSequence seq, int index)
     *           返回 CharSequence 的给定索引前面的代码点。
     * static int	codePointCount(char[] a, int offset, int count)
     *           返回 char 数组参数的子数组中 Unicode 代码点的数量。
     * static int	codePointCount(CharSequence seq, int beginIndex, int endIndex)
     *           返回指定字符序列的文本范围内的 Unicode 代码点数量。
     *  int	compareTo(Character anotherCharacter)
     *           根据数字比较两个 Character 对象。
     * static int	digit(char ch, int radix)
     *           返回使用指定基数的字符 ch 的数值。
     * static int	digit(int codePoint, int radix)
     *           返回使用指定基数的指定字符（Unicode 代码点）的数值。
     *  boolean	equals(Object obj)
     *           将此对象与指定对象比较。
     * static char	forDigit(int digit, int radix)
     *           确定使用指定基数的特定数字的字符表示形式。
     * static byte	getDirectionality(char ch)
     *           返回给定字符的 Unicode 方向属性。
     * static byte	getDirectionality(int codePoint)
     *           返回给定字符（Unicode 代码点）的 Unicode 方向属性。
     * static int	getNumericValue(char ch)
     *           返回指定的 Unicode 字符表示的 int 值。
     * static int	getNumericValue(int codePoint)
     *           返回指定字符（Unicode 代码点）表示的 int 值。
     * static int	getType(char ch)
     *           返回一个指示字符的常规类别的值。
     * static int	getType(int codePoint)
     *           返回一个指示字符的常规类别的值。
     *  int	hashCode()
     *           返回此 Character 的哈希码。
     * static boolean	isDefined(char ch)
     *           确定字符是否被定义为 Unicode 中的字符。
     * static boolean	isDefined(int codePoint)
     *           确定字符（Unicode 代码点）是否被定义为 Unicode 中的字符。
     * static boolean	isDigit(char ch)
     *           确定指定字符是否为数字。
     * static boolean	isDigit(int codePoint)
     *           确定指定字符（Unicode 代码点）是否为数字。
     * static boolean	isHighSurrogate(char ch)
     *           确定给出的 char 值是否为一个高代理项代码单元（也称为前导代理项代码单元）。
     * static boolean	isIdentifierIgnorable(char ch)
     *           确定是否应该认为指定字符是 Java 标识符或 Unicode 标识符中可忽略的一个字符。
     * static boolean	isIdentifierIgnorable(int codePoint)
     *           确定是否应该认为指定字符（Unicode 代码点）是 Java 标识符或 Unicode 标识符中可忽略的一个字符。
     * static boolean	isISOControl(char ch)
     *           确定指定字符是否为 ISO 控制字符。
     * static boolean	isISOControl(int codePoint)
     *           确定引用的字符（Unicode 代码点）是否为 ISO 控制字符。
     * static boolean	isJavaIdentifierPart(char ch)
     *           确定指定字符是否可以是 Java 标识符中首字符以外的部分。
     * static boolean	isJavaIdentifierPart(int codePoint)
     *           确定字符（Unicode 代码点）是否可以是 Java 标识符中首字符以外的部分。
     * static boolean	isJavaIdentifierStart(char ch)
     *           确定是否允许将指定字符作为 Java 标识符中的首字符。
     * static boolean	isJavaIdentifierStart(int codePoint)
     *           确定是否允许将字符（Unicode 代码点）作为 Java 标识符中的首字符。
     * static boolean	isJavaLetter(char ch)
     *           已过时。 由 isJavaIdentifierStart(char) 取代。
     * static boolean	isJavaLetterOrDigit(char ch)
     *           已过时。 由 isJavaIdentifierPart(char) 取代。
     * static boolean	isLetter(char ch)
     *           确定指定字符是否为字母。
     * static boolean	isLetter(int codePoint)
     *           确定指定字符（Unicode 代码点）是否为字母。
     * static boolean	isLetterOrDigit(char ch)
     *           确定指定字符是否为字母或数字。
     * static boolean	isLetterOrDigit(int codePoint)
     *           确定指定字符（Unicode 代码点）是否为字母或数字。
     * static boolean	isLowerCase(char ch)
     *           确定指定字符是否为小写字母。
     * static boolean	isLowerCase(int codePoint)
     *           确定指定字符（Unicode 代码点）是否为小写字母。
     * static boolean	isLowSurrogate(char ch)
     *           确定给定 char 值是否一个低代理项代码单元（也称为尾部代理项代码单元）。
     * static boolean	isMirrored(char ch)
     *           确定指定字符依据 Unicode 规范是否对称。
     * static boolean	isMirrored(int codePoint)
     *           确定指定字符（Unicode 代码点）依据 Unicode 规范是否对称。
     * static boolean	isSpace(char ch)
     *           已过时。 由 isWhitespace(char) 取代。
     * static boolean	isSpaceChar(char ch)
     *           确定指定字符是否为 Unicode 空白字符。
     * static boolean	isSpaceChar(int codePoint)
     *           确定指定字符（Unicode 代码点）是否为 Unicode 空白字符。
     * static boolean	isSupplementaryCodePoint(int codePoint)
     *           确定指定字符（Unicode 代码点）是否在增补字符范围内。
     * static boolean	isSurrogatePair(char high, char low)
     *           确定指定的 char 值对是否为有效的代理项对。
     * static boolean	isTitleCase(char ch)
     *           确定指定字符是否为首字母大写字符。
     * static boolean	isTitleCase(int codePoint)
     *           确定指定字符（Unicode 代码点）是否为首字母大写字符。
     * static boolean	isUnicodeIdentifierPart(char ch)
     *           确定指定字符是否可以是 Unicode 标识符中首字符以外的部分。
     * static boolean	isUnicodeIdentifierPart(int codePoint)
     *           确定指定字符（Unicode 代码点）是否可以是 Unicode 标识符中首字符以外的部分。
     * static boolean	isUnicodeIdentifierStart(char ch)
     *           确定是否允许将指定字符作为 Unicode 标识符中的首字符。
     * static boolean	isUnicodeIdentifierStart(int codePoint)
     *           确定是否允许将指定字符（Unicode 代码点）作为 Unicode 标识符中的首字符。
     * static boolean	isUpperCase(char ch)
     *           确定指定字符是否为大写字母。
     * static boolean	isUpperCase(int codePoint)
     *           确定指定字符（Unicode 代码点）是否为大写字母。
     * static boolean	isValidCodePoint(int codePoint)
     *           确定指定的代码点是否为从 0x0000 到 0x10FFFF 范围之内的有效 Unicode 代码点值。
     * static boolean	isWhitespace(char ch)
     *           确定指定字符依据 Java 标准是否为空白字符。
     * static boolean	isWhitespace(int codePoint)
     *           确定指定字符（Unicode 代码点）依据 Java 标准是否为空白字符。
     * static int	offsetByCodePoints(char[] a, int start, int count, int index, int codePointOffset)
     *           返回给定 char 子数组中的索引，它是从给定 index 到 codePointOffset 代码点的偏移量。
     * static int	offsetByCodePoints(CharSequence seq, int index, int codePointOffset)
     *           返回给定字符序列中的索引，它是从给定 index 到 codePointOffset 代码点的偏移量。
     * static char	reverseBytes(char ch)
     *           返回通过反转指定 char 值中的字节顺序而获得的值。
     * static char[]	toChars(int codePoint)
     *           将指定的字符（Unicode 代码点）转换成其存储在 char 数组中的 UTF-16 表示形式。
     * static int	toChars(int codePoint, char[] dst, int dstIndex)
     *           将指定字符（Unicode 代码点）转换为其 UTF-16 表示形式。
     * static int	toCodePoint(char high, char low)
     *           将指定的代理项对转换为其增补代码点值。
     * static char	toLowerCase(char ch)
     *           使用取自 UnicodeData 文件的大小写映射信息将字符参数转换为小写。
     * static int	toLowerCase(int codePoint)
     *           使用取自 UnicodeData 文件的大小写映射信息将字符（Unicode 代码点）参数转换为小写。
     *  String	toString()
     *           返回表示此 Character 值的 String 对象。
     * static String	toString(char c)
     *           返回一个表示指定 char 值的 String 对象。
     * static char	toTitleCase(char ch)
     *           使用取自 UnicodeData 文件的大小写映射信息将字符参数转换为首字母大写。
     * static int	toTitleCase(int codePoint)
     *           使用取自 UnicodeData 文件的大小写映射信息将字符（Unicode 代码点）参数转换为首字母大写。
     * static char	toUpperCase(char ch)
     *           使用取自 UnicodeData 文件的大小写映射信息将字符参数转换为大写。
     * static int	toUpperCase(int codePoint)
     *           使用取自 UnicodeData 文件的大小写映射信息将字符（Unicode 代码点）参数转换为大写。
     * static Character	valueOf(char c)
     *           返回一个表示指定 char 值的 Character 实例。
     */
    public static void main(String[] args) {
        Character a = 'a';
    }

}
