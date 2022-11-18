package com.macro.mall.tiny.jdk.工具;

/**
 * @ClassName FormatterTest
 * @Author WB-918966
 * @Date 2022/11/2 10:43
 * @Version 1.0
 * String.format 本质上是使用了本方法来对字符串进行格式化
 * java.util.Formatter 类提供了布局合理性和对齐方式，常见格式为数字，字符串和日期/时间数据，以及语言环境的输出的支持。以下是关于格式化要点：
 *
 * 格式化并不一定是安全的多线程访问。线程安全是可选的，在这个类方法由用户自已定义。
 *
 * public final class Formatter
 *    extends Object
 *       implements Closeable, Flushable
 **/
public class FormatterTest {
    /**
     *1	Formatter()
     * 这个构造函数构造一个新的格式化。
     * 2	Formatter(Appendable a)
     * 这个构造函数构造一个新的格式化与指定的目标。
     * 3	Formatter(Appendable a, Locale l)
     * 这个构造函数构造一个新的格式化与指定的目标和语言环境。
     * 4	Formatter(File file)
     * 这个构造函数构造一个新的格式化与指定的文件。
     * 5	Formatter(File file, String csn)
     * 这个构造函数构造一个新的格式化与指定文件和字符集。
     * 6	Formatter(File file, String csn, Locale l)
     * 这个构造函数构造一个新的格式化与指定的文件，字符集和语言环境。
     * 7	Formatter(Locale l)
     * 这个构造函数构造一个新的格式化与指定的语言环境。
     * 8	Formatter(OutputStream os)
     * 这个构造函数构造一个新的格式化与指定的输出流。
     * 9	Formatter(OutputStream os, String csn)
     * 这个构造函数构造一个新的格式化与指定的输出流和字符集。
     * 10	Formatter(OutputStream os, String csn, Locale l)
     * 这个构造函数构造一个新的格式化与指定的输出流，字符集和语言环境。
     * 11	Formatter(PrintStream ps)
     * 这个构造函数构造一个新的格式化与指定的打印流。
     * 12	Formatter(String fileName)
     * 这个构造函数构造一个新的格式化与指定的文件名。
     * 13	Formatter(String fileName, String csn)
     * 这个构造函数构造一个新的格式化与指定的文件名和字符集。
     * 14	Formatter(String fileName, String csn, Locale l)
     * 这个构造函数构造一个新的格式化与指定的文件名，字符集和语言环境
     */

    /**
     * 1	void close()
     * 此方法关闭此格式化程序。
     * 2	void flush()
     * 这个方法刷新此格式化程序。
     * 3	Formatter format(Locale l, String format, Object... args)
     * 此方法写入一个格式化字符串使用指定的语言环境，格式字符串和参数，此对象的目标。
     * 4	Formatter format(String format, Object... args)
     * 此方法写入一个格式化字符串使用指定格式字符串和参数此对象的目标。
     * 5	IOException ioException()
     * 此方法返回的最后一个IOException异常被抛出此格式化程序的附加。
     * 6	Locale locale()
     * 这个方法返回locale这个格式化的结构设置。
     * 7	Appendable out()
     * 此方法返回的目的地的输出。
     * 8	String toString()
     * 此方法返回调用toString()方法在目的地的输出结果。
     */

    /**
     * 类型转换字符
     * d	整数型（十进制）	formatter.format("%d", 1000);	    1000
     * o	整数型（八进制）	formatter.format("%o", 1000);	    1750
     * x	整数型（十六进制）	formatter.format("%x", 1000);	    3e8
     * f	浮点型（十进制）	formatter.format("%f", 1000.0);	    1000.000000
     * e	浮点型（科学计数）	formatter.format("%e", 1000.0);	    1.000000e+03
     * b	布尔型	        formatter.format("%b", true);	    true
     * c	字符型	        formatter.format("%c", ‘A’);	    A
     * s	字符串型	        formatter.format("%s", “String”);	String
     * %	字符“%”	        formatter.format("%d%%", 100);	    100%
     *
     * 时间转换
     * tC	上世纪	        formatter.format("%tC", calendar);	20
     * tY	年（4位）	    formatter.format("%tY", calendar);	2017
     * ty	年（2位）	    formatter.format("%ty", calendar);	17
     * tm	月	            formatter.format("%tm", calendar);	11
     * tB	月份	            formatter.format("%tB", calendar);	November
     * tb	月份缩写	        formatter.format("%tb", calendar);	Nov
     * td	日（2位）	    formatter.format("%td", calendar);	20
     * te	日	            formatter.format("%te", calendar);	20
     * tA	星期	            formatter.format("%tA", calendar);	Monday
     * ta	星期（缩写）	    formatter.format("%ta", calendar);	Mon
     * tH	小时（24小时制）	formatter.format("%tH", calendar);	18
     * tk	小时（24小时制）	formatter.format("%tk", calendar);	18
     * tI	小时（12小时制）	formatter.format("%tI", calendar);	06
     * tl	小时（12小时制）	formatter.format("%tl", calendar);	6
     * tM	分钟	            formatter.format("%tM", calendar);	10
     * tS	秒	            formatter.format("%tS", calendar);	22
     * tL	毫秒	            formatter.format("%tL", calendar);	490
     * tN	微秒	            formatter.format("%tN", calendar);	                570000000
     * tp	上午/下午	    formatter.format("%tp", calendar);	                pm
     * tz	时区	            formatter.format("%tz", calendar);	                +0800
     * tZ	时区（缩写）	    formatter.format("%tZ", calendar);	                CST
     * ts	自1970-01-01 00:00的秒数	    formatter.format("%ts", calendar);	    1511172687
     * tQ	自1970-01-01 00:00的毫秒数	formatter.format("%tQ", calendar);	1511172687297
     * tF	YYYY-MM-DD	    formatter.format("%tF", calendar);	                2017-11-20
     * tD	MM/DD/YY	    formatter.format("%tD", calendar);	                11/20/17
     * tR	HH:MM（24小时制）	formatter.format("%tR", calendar);	                18:11
     * tT	HH:MM:SS（24小时制）	        formatter.format("%tT", calendar);	    18:11:27
     * tr	HH:MM:SS 上午/下午	        formatter.format("%tr", calendar);	    06:11:27 pm
     * tc	星期 月 日 HH:MM:SS YYYY	    formatter.format("%tc", calendar);	    Mon Nov 20 18:11:27 CST 2017
     */
}
