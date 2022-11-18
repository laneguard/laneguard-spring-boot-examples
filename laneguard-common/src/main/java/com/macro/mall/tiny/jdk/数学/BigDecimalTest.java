package com.macro.mall.tiny.jdk.数学;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName BigDecimalTest
 * @Author WB-918966
 * @Date 2022/11/11 10:16
 * @Version 1.0
 * 软件包 java.math 的描述
 * 提供用于执行任意精度整数算法 (BigInteger) 和任意精度小数算法 (BigDecimal) 的类。BigInteger 除提供任意精度之外，它类似于 Java 的基本整数类型，因此在 BigInteger
 * 上执行的操作不产生溢出，也不会丢失精度。除标准算法操作外，BigInteger 还提供模 (modular) 算法、GCD 计算、基本 (primality) 测试、素数生成、位处理以及一些其他操作。 BigDecimal
 * 提供适用于货币计算和类似计算的任意精度的有符号十进制数字。BigDecimal 允许用户对舍入行为进行完全控制，并允许用户选择所有八个舍入模式。
 *
 * 不可变的、任意精度的有符号十进制数。
 * 类 BigDecimal
 * java.lang.Object
 *   继承者 java.lang.Number
 *       继承者 java.math.BigDecimal
 * 所有已实现的接口：
 * Serializable, Comparable<BigDecimal>
 * public class BigDecimal
 * extends Number
 * implements Comparable<BigDecimal>
 * 不可变的、任意精度的有符号十进制数。BigDecimal 由任意精度的整数非标度值 和 32 位的整数标度 (scale) 组成。如果为零或正数，则标度是小数点后的位数。如果为负数，则将该数的非标度值乘以 10 的负 scale
 * 次幂。因此，BigDecimal 表示的数值是 (unscaledValue × 10-scale)。
 **/
public class BigDecimalTest {
    /**
     * 字段摘要
     * static BigDecimal	ONE
     *           值为 1，标度为 0。
     * static int	ROUND_CEILING
     *           接近正无穷大的舍入模式。
     * static int	ROUND_DOWN
     *           接近零的舍入模式。
     * static int	ROUND_FLOOR
     *           接近负无穷大的舍入模式。
     * static int	ROUND_HALF_DOWN
     *           向“最接近的”数字舍入，如果与两个相邻数字的距离相等，则为上舍入的舍入模式。
     * static int	ROUND_HALF_EVEN
     *           向“最接近的”数字舍入，如果与两个相邻数字的距离相等，则向相邻的偶数舍入。
     * static int	ROUND_HALF_UP
     *           向“最接近的”数字舍入，如果与两个相邻数字的距离相等，则为向上舍入的舍入模式。
     * static int	ROUND_UNNECESSARY
     *           断言请求的操作具有精确的结果，因此不需要舍入。
     * static int	ROUND_UP
     *           舍入远离零的舍入模式。
     * static BigDecimal	TEN
     *           值为 10，标度为 0。
     * static BigDecimal	ZERO
     *           值为 0，标度为 0。
     *
     * 构造方法摘要
     * BigDecimal(BigInteger val)
     *           将 BigInteger 转换为 BigDecimal。
     * BigDecimal(BigInteger unscaledVal, int scale)
     *           将 BigInteger 非标度值和 int 标度转换为 BigDecimal。
     * BigDecimal(BigInteger unscaledVal, int scale, MathContext mc)
     *           将 BigInteger 非标度值和 int 标度转换为 BigDecimal（根据上下文设置进行舍入）。
     * BigDecimal(BigInteger val, MathContext mc)
     *           将 BigInteger 转换为 BigDecimal（根据上下文设置进行舍入）。
     * BigDecimal(char[] in)
     *           将 BigDecimal 的字符数组表示形式转换为 BigDecimal，接受与 BigDecimal(String) 构造方法相同的字符序列。
     * BigDecimal(char[] in, int offset, int len)
     *           将 BigDecimal 的字符数组表示形式转换为 BigDecimal，接受与 BigDecimal(String) 构造方法相同的字符序列，同时允许指定子数组。
     * BigDecimal(char[] in, int offset, int len, MathContext mc)
     *           将 BigDecimal 的字符数组表示形式转换为 BigDecimal，接受与 BigDecimal(String) 构造方法相同的字符序列，同时允许指定子数组，并根据上下文设置进行舍入。
     * BigDecimal(char[] in, MathContext mc)
     *           将 BigDecimal 的字符数组表示形式转换为 BigDecimal，接受与 BigDecimal(String) 构造方法相同的字符序列（根据上下文设置进行舍入）。
     * BigDecimal(double val)
     *           将 double 转换为 BigDecimal，后者是 double 的二进制浮点值准确的十进制表示形式。
     * BigDecimal(double val, MathContext mc)
     *           将 double 转换为 BigDecimal（根据上下文设置进行舍入）。
     * BigDecimal(int val)
     *           将 int 转换为 BigDecimal。
     * BigDecimal(int val, MathContext mc)
     *           将 int 转换为 BigDecimal（根据上下文设置进行舍入）。
     * BigDecimal(long val)
     *           将 long 转换为 BigDecimal。
     * BigDecimal(long val, MathContext mc)
     *           将 long 转换为 BigDecimal（根据上下文设置进行舍入）。
     * BigDecimal(String val)
     *           将 BigDecimal 的字符串表示形式转换为 BigDecimal。
     * BigDecimal(String val, MathContext mc)
     *           将 BigDecimal 的字符串表示形式转换为 BigDecimal，接受与 BigDecimal(String) 构造方法相同的字符串（按照上下文设置进行舍入）。
     *
     * 方法摘要
     *  BigDecimal	abs()
     *           返回 BigDecimal，其值为此 BigDecimal 的绝对值，其标度为 this.scale()。
     *  BigDecimal	abs(MathContext mc)
     *           返回其值为此 BigDecimal 绝对值的 BigDecimal（根据上下文设置进行舍入）。
     *  BigDecimal	add(BigDecimal augend)
     *           返回一个 BigDecimal，其值为 (this + augend)，其标度为 max(this.scale(), augend.scale())。
     *  BigDecimal	add(BigDecimal augend, MathContext mc)
     *           返回其值为 (this + augend) 的 BigDecimal（根据上下文设置进行舍入）。
     *  byte	byteValueExact()
     *           将此 BigDecimal 转换为 byte，以检查丢失的信息。
     *  int	compareTo(BigDecimal val)
     *           将此 BigDecimal 与指定的 BigDecimal 比较。
     *  BigDecimal	divide(BigDecimal divisor)
     *           返回一个 BigDecimal，其值为 (this / divisor)，其首选标度为 (this.scale() - divisor.scale())
     *           ；如果无法表示准确的商值（因为它有无穷的十进制扩展），则抛出 ArithmeticException。
     *  BigDecimal	divide(BigDecimal divisor, int roundingMode)
     *           返回一个 BigDecimal，其值为 (this / divisor)，其标度为 this.scale()。
     *  BigDecimal	divide(BigDecimal divisor, int scale, int roundingMode)
     *           返回一个 BigDecimal，其值为 (this / divisor)，其标度为指定标度。
     *  BigDecimal	divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
     *           返回一个 BigDecimal，其值为 (this / divisor)，其标度为指定标度。
     *  BigDecimal	divide(BigDecimal divisor, MathContext mc)
     *           返回其值为 (this / divisor) 的 BigDecimal（根据上下文设置进行舍入）。
     *  BigDecimal	divide(BigDecimal divisor, RoundingMode roundingMode)
     *           返回一个 BigDecimal，其值为 (this / divisor)，其标度为 this.scale()。
     *  BigDecimal[]	divideAndRemainder(BigDecimal divisor)
     *           返回由两个元素组成的 BigDecimal 数组，该数组包含 divideToIntegralValue 的结果，后跟对两个操作数计算所得到的 remainder。
     *  BigDecimal[]	divideAndRemainder(BigDecimal divisor, MathContext mc)
     *           返回由两个元素组成的 BigDecimal 数组，该数组包含 divideToIntegralValue 的结果，后跟根据上下文设置对两个操作数进行舍入计算所得到的 remainder 的结果。
     *  BigDecimal	divideToIntegralValue(BigDecimal divisor)
     *           返回 BigDecimal，其值为向下舍入所得商值 (this / divisor) 的整数部分。
     *  BigDecimal	divideToIntegralValue(BigDecimal divisor, MathContext mc)
     *           返回 BigDecimal，其值为 (this / divisor) 的整数部分。
     *  double	doubleValue()
     *           将此 BigDecimal 转换为 double。
     *  boolean	equals(Object x)
     *           比较此 BigDecimal 与指定的 Object 的相等性。
     *  float	floatValue()
     *           将此 BigDecimal 转换为 float。
     *  int	hashCode()
     *           返回此 BigDecimal 的哈希码。
     *  int	intValue()
     *           将此 BigDecimal 转换为 int。
     *  int	intValueExact()
     *           将此 BigDecimal 转换为 int，以检查丢失的信息。
     *  long	longValue()
     *           将此 BigDecimal 转换为 long。
     *  long	longValueExact()
     *           将此 BigDecimal 转换为 long，以检查丢失的信息。
     *  BigDecimal	max(BigDecimal val)
     *           返回此 BigDecimal 和 val 的最大值。
     *  BigDecimal	min(BigDecimal val)
     *           返回此 BigDecimal 和 val 的最小值。
     *  BigDecimal	movePointLeft(int n)
     *           返回一个 BigDecimal，它等效于将该值的小数点向左移动 n 位。
     *  BigDecimal	movePointRight(int n)
     *           返回一个 BigDecimal，它等效于将该值的小数点向右移动 n 位。
     *  BigDecimal	multiply(BigDecimal multiplicand)
     *           返回一个 BigDecimal，其值为 (this × multiplicand)，其标度为 (this.scale() + multiplicand.scale())。
     *  BigDecimal	multiply(BigDecimal multiplicand, MathContext mc)
     *           返回其值为 (this × multiplicand) 的 BigDecimal（根据上下文设置进行舍入）。
     *  BigDecimal	negate()
     *           返回 BigDecimal，其值为 (-this)，其标度为 this.scale()。
     *  BigDecimal	negate(MathContext mc)
     *           返回其值为 (-this) 的 BigDecimal（根据上下文设置进行舍入）。
     *  BigDecimal	plus()
     *           返回 BigDecimal，其值为 (+this)，其标度为 this.scale()。
     *  BigDecimal	plus(MathContext mc)
     *           返回其值为 (+this) 的 BigDecimal（根据上下文设置进行舍入）。
     *  BigDecimal	pow(int n)
     *           返回其值为 (thisn) 的 BigDecimal，准确计算该幂，使其具有无限精度。
     *  BigDecimal	pow(int n, MathContext mc)
     *           返回其值为 (thisn) 的 BigDecimal。
     *  int	precision()
     *           返回此 BigDecimal 的精度。
     *  BigDecimal	remainder(BigDecimal divisor)
     *           返回其值为 (this % divisor) 的 BigDecimal。
     *  BigDecimal	remainder(BigDecimal divisor, MathContext mc)
     *           返回其值为 (this % divisor) 的 BigDecimal（根据上下文设置进行舍入）。
     *  BigDecimal	round(MathContext mc)
     *           返回根据 MathContext 设置进行舍入后的 BigDecimal。
     *  int	scale()
     *           返回此 BigDecimal 的标度。
     *  BigDecimal	scaleByPowerOfTen(int n)
     *           返回其数值等于 (this * 10n) 的 BigDecimal。
     *  BigDecimal	setScale(int newScale)
     *           返回一个 BigDecimal，其标度为指定值，其值在数值上等于此 BigDecimal 的值。
     *  BigDecimal	setScale(int newScale, int roundingMode)
     *           返回一个 BigDecimal，其标度为指定值，其非标度值通过此 BigDecimal 的非标度值乘以或除以十的适当次幂来确定，以维护其总值。
     *  BigDecimal	setScale(int newScale, RoundingMode roundingMode)
     *           返回 BigDecimal，其标度为指定值，其非标度值通过此 BigDecimal 的非标度值乘以或除以十的适当次幂来确定，以维护其总值。
     *  short	shortValueExact()
     *           将此 BigDecimal 转换为 short，以检查丢失的信息。
     *  int	signum()
     *           返回此 BigDecimal 的正负号函数。
     *  BigDecimal	stripTrailingZeros()
     *           返回数值上等于此小数，但从该表示形式移除所有尾部零的 BigDecimal。
     *  BigDecimal	subtract(BigDecimal subtrahend)
     *           返回一个 BigDecimal，其值为 (this - subtrahend)，其标度为 max(this.scale(), subtrahend.scale())。
     *  BigDecimal	subtract(BigDecimal subtrahend, MathContext mc)
     *           返回其值为 (this - subtrahend) 的 BigDecimal（根据上下文设置进行舍入）。
     *  BigInteger	toBigInteger()
     *           将此 BigDecimal 转换为 BigInteger。
     *  BigInteger	toBigIntegerExact()
     *           将此 BigDecimal 转换为 BigInteger，以检查丢失的信息。
     *  String	toEngineeringString()
     *           返回此 BigDecimal 的字符串表示形式，需要指数时，则使用工程计数法。
     *  String	toPlainString()
     *           返回不带指数字段的此 BigDecimal 的字符串表示形式。
     *  String	toString()
     *           返回此 BigDecimal 的字符串表示形式，如果需要指数，则使用科学记数法。
     *  BigDecimal	ulp()
     *           返回此 BigDecimal 的 ulp（最后一位的单位）的大小。
     *  BigInteger	unscaledValue()
     *           返回其值为此 BigDecimal 的非标度值 的 BigInteger。
     * static BigDecimal	valueOf(double val)
     *           使用 Double.toString(double) 方法提供的 double 规范的字符串表示形式将 double 转换为 BigDecimal。
     * static BigDecimal	valueOf(long val)
     *           将 long 值转换为具有零标度的 BigDecimal。
     * static BigDecimal	valueOf(long unscaledVal, int scale)
     *           将 long 非标度值和 int 标度转换为 BigDecimal。
     */

    public static void main(String[] args) {
        //field();
        //construct();
        //method();
        //Student student = new Student("sfdsfsdf",new CommonsMultipartFile(null));
        //System.out.println(JSON.toJSONString(student, SerializerFeature.PrettyFormat));
    }

    private static void method() {

    }

    private static void construct() {

    }

    private static void field() {

    }
}

@Data
@Builder
class Student{
    String name;
    MultipartFile file;
}