package com.macro.mall.tiny.jdk.工具;

import java.util.Scanner;

/**
 * @ClassName ScannerTest
 * @Author WB-918966
 * @Date 2022/11/4 10:55
 * @Version 1.0
 *
 **/
public class ScannerTest {
    /**
     * java.util.Scanner 类是一个简单的文本扫描器可以分析基本类型和字符串使用正则表达式。以下是关于扫描器的要点：
     *
     * 一个扫描器使用分隔符模式分解它的输入，默认情况下与空白匹配。
     *
     * 扫描操作可能阻塞等待输入。
     *
     * 扫描器是不是安全的，无需外部同步多线程使用。
     *
     * 类声明
     * 以下是java.util.Scanner类的声明：
     *
     * public final class Scanner
     *    extends Object
     *       implements Iterator<String>
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	Scanner(File source)
     * 此构造产生从指定文件扫描值的新扫描器。
     * 2	Scanner(File source, String charsetName)
     * 此构造产生从指定文件扫描值的新扫描器。
     * 3	Scanner(InputStream source)
     * 此构造产生从指定的输入流扫描值的新扫描器。
     * 4	Scanner(InputStream source, String charsetName)
     * 此构造产生从指定的输入流扫描值的新扫描器。
     * 5	Scanner(Readable source)
     * 此构造产生从指定源扫描值的新扫描器。
     * 6	Scanner(ReadableByteChannel source)
     * 此构造产生从指定通道扫描值的新扫描器。
     * 7	Scanner(ReadableByteChannel source, String charsetName)
     * 此构造产生从指定通道扫描值的新扫描器。
     * 8	Scanner(String source)
     * 此构造产生从指定字符串扫描值的新扫描器。类方法
     * S.N.	方法 & 描述
     * 1	void close()
     * 此方法关闭此扫描器。
     * 2	Pattern delimiter()
     * 此方法返回当前扫描器使用相匹配的分隔符的模式。
     * 3	String findInLine(Pattern pattern)
     * 此方法试图找到指定的模式在忽略分隔符的下一次出现。
     * 4	String findInLine(String pattern)
     * 此方法试图找到从指定字符串构造的模式在未来发生，忽略分隔符。
     * 5	String findWithinHorizon(Pattern pattern, int horizon)
     * 此方法试图找到指定模式的下一次出现。
     * 6	String findWithinHorizon(String pattern, int horizon)
     * 此方法试图找到从指定字符串构造的模式在未来发生，在忽略分隔符。
     * 7	boolean hasNext()
     * 如果此扫描器有另一个标记在其输入此方法返回true。
     * 8	boolean hasNext(Pattern pattern)
     * 如果下一个完整标记与指定模式匹配，该方法返回true。
     * 9	boolean hasNext(String pattern)
     * 如果下一个标记与从指定字符串构造的模式此方法返回true。
     * 10	boolean hasNextBigDecimal()
     * 如果在此扫描器输入信息中的下一个标记可以通过使用nextBigDecimal()方法被解释为一个BigDecimal，该方法返回true。
     * 11	boolean hasNextBigInteger()
     * 如果在此扫描器输入信息中的下一个标记可以使用nextBigInteger()方法被解释为一个BigInteger的默认基数，此方法返回true。
     * 12	boolean hasNextBigInteger(int radix)
     * 如果在此扫描器输入信息中的下一个标记可以使用nextBigInteger()方法被解释为一个BigInteger指定基数此方法返回true。
     * 13	boolean hasNextBoolean()
     * 如果在此扫描器输入信息中的下一个标记可以解释为使用从字符串“true|false”创造了一个不区分大小写模式的布尔值，此方法返回true。
     * 14	boolean hasNextByte()
     * 如果在此扫描器输入信息中的下一个标记可以使用nextByte()方法被解释为一个字节值的默认基数此方法返回true。
     * 15	boolean hasNextByte(int radix)
     * 如果在此扫描器输入信息中的下一个标记可以使用nextByte()方法被解释为一个字节值指定基数，此方法返回true。
     * 16	boolean hasNextDouble()
     * 如果在此扫描器输入信息中的下一个标记可以解释为使用nextDouble()方法的一个double值，此方法返回true。
     * 17	boolean hasNextFloat()
     * 此方法返回true，如果在此扫描器输入信息的下一个标记可以使用nextFloat()方法解释为浮点值。
     * 18	boolean hasNextInt()
     * 如果在此扫描器输入信息中的下一个标记可以使用nextInt()方法被解释为一个int值的默认基数，此方法返回true。
     * 19	boolean hasNextInt(int radix)
     * 如果在此扫描器输入信息中的下一个标记可以使用nextInt()方法被解释为一个int值指定基数，此方法返回true。
     * 20	boolean hasNextLine()
     * 如果有另一行在此扫描器的输入，此方法返回true。
     * 21	boolean hasNextLong()
     * 如果在此扫描器输入信息中的下一个标记可以使用nextLong()方法被解释为一个long值的默认基数，此方法返回true。
     * 22	boolean hasNextLong(int radix)
     * 如果在此扫描器输入信息中的下一个标记可以使用nextLong()方法被解释为一个long值指定基数，此方法返回true。
     * 23	boolean hasNextShort()
     * 如果在此扫描器输入信息中的下一个标记可以使用nextShort()方法被解释为一个short值的默认基数，此方法返回true。
     * 24	boolean hasNextShort(int radix)
     * 如果在此扫描器输入信息中的下一个标记可以使用nextShort()方法被解释为一个short值指定基数，此方法返回true。
     * 25	IOException ioException()
     * 此方法返回的最后一个IOException异常抛出此扫描器的基本可读。
     * 26	Locale locale()
     * 此方法返回此扫描器的语言环境。
     * 27	MatchResult match()
     * 此方法返回此扫描器所执行的最后扫描操作的匹配结果。
     * 28	String next()
     * 此方法查找并返回来自此扫描器的下一个完整标记。
     * 29	String next(Pattern pattern)
     * 此方法返回下一个标记，如果它与指定模式匹配。
     * 30	String next(String pattern)
     * 此方法返回下一个标记，如果它匹配从指定字符串构造的模式。
     * 31	BigDecimal nextBigDecimal()
     * 此方法扫描输入的下一个标记为一个BigDecimal。
     * 32	BigInteger nextBigInteger()
     * 此方法扫描输入的下一个标记为一个BigInteger。
     * 33	BigInteger nextBigInteger(int radix)
     * 此方法扫描输入的下一个标记为一个BigInteger。
     * 34	boolean nextBoolean()
     * 此方法扫描输入的下一个标记成一个布尔值并返回该值。
     * 35	byte nextByte()
     * 此方法扫描输入的下一个标记为一个字节。
     * 36	byte nextByte(int radix)
     * 此方法扫描输入的下一个标记为一个字节。
     * 37	double nextDouble()
     * 此方法扫描输入的下一个标记为double。
     * 38	float nextFloat()
     * 此方法扫描输入的下一个标记为float。
     * 39	int nextInt()
     * 此方法扫描输入的下一个标记为int。
     * 40	int nextInt(int radix)
     * 此方法扫描输入的下一个标记为int。
     * 41	String nextLine()
     * 此方法前进此扫描器执行当前行，并返回跳过的输入信息。
     * 42	long nextLong()
     * 此方法扫描输入的下一个标记为一个long。
     * 43	long nextLong(int radix)
     * 此方法扫描输入的下一个标记为一个long。
     * 44	short nextShort()
     * 此方法扫描输入的下一个标记为一个long。
     * 45	short nextShort(int radix)
     * 此方法扫描输入的下一个标记为short。
     * 46	int radix()
     * 此方法返回此扫描器的默认基数。
     * 47	void remove()
     * 不受此实现迭代器所支持的删除操作。
     * 48	Scanner reset()
     * 此方法重置该扫描仪。
     * 49	Scanner skip(Pattern pattern)
     * 此方法跳过输入相匹配的指定模式，在忽略分隔符。
     * 50	Scanner skip(String pattern)
     * 此方法跳过输入匹配从指定字符串构造的模式。
     * 51	String toString()
     * 此方法返回当前扫描器的字符串表示形式。
     * 52	Scanner useDelimiter(Pattern pattern)
     * 此方法设置此扫描器的分隔模式，以指定的模式。
     * 53	Scanner useDelimiter(String pattern)
     * 此方法设置此扫描器的分隔模式，以从指定字符串构造的模式。
     * 54	Scanner useLocale(Locale locale)
     * 此方法设置此扫描器的语言环境，以指定的语言环境。
     * 55	Scanner useRadix(int radix)
     * 此方法设置此扫描器的默认基数为指定基数。
     */

    public static void main(String[] args) {
        //内部使用while true进行阻塞，大部分监听程序都是使用死循环完成进程阻塞的
        Scanner scanner = new Scanner(System.in);
    }
}
