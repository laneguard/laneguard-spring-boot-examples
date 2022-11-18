package com.macro.mall.tiny.jdk.系统;

import java.io.Console;

/**
 * @ClassName ConsoleTest
 * @Author WB-918966
 * @Date 2022/11/3 16:30
 * @Version 1.0
 **/
public class ConsoleTest {

    /**
     * Java.io.Console 类提供了方法来访问基于字符的控制台设备，与当前Java虚拟机相关联。
     *
     *Java要与Console进行交互，不总是能得到可用的Java Console类的。一个JVM是否有可用的Console，依赖于底层平台和JVM如何被调用。如果JVM是在交互式命令行（比如Windows的cmd
     * ）中启动的，并且输入输出没有重定向到另外的地方，那么就我们可以得到一个可用的Console实例。
     * 当你有Eclipse或NetBean中运行以上代码时Console中将会有以下文字输出：
     * Console is unavailable.
     * 表示Java程序无法获得Console实例，是因为JVM不是在命令行中被调用的，或者输入输出被重定向了。
     *
     * 类声明
     * 以下是Java.io.Console类的声明：
     *
     * public final class Console
     *   extends Object
     *     implements Flushable
     *
     *
     *
     * 类方法
     * S.N.	方法与说明
     * 1	void flush()
     * 此方法刷新控制台，并强制所有缓冲的输出立即写入。
     * 2	Console format(String fmt, Object... args)
     * 此方法写入一个格式化字符串使用指定格式字符串和参数这个控制台的输出流。
     * 3	Console printf(String format, Object... args)
     * 此方法是用来写一个格式化字符串使用指定格式字符串和参数这个控制台的输出流。
     * 4	Reader reader()
     * 此方法检索与此控制台关联的唯一Reader对象。
     * 5	String readLine()
     * 此方法从控制台读取单行文本。
     * 6	String readLine(String fmt, Object... args)
     * 此方法提供了一个格式化提示，然后从控制台读取单行文本。
     * 7	char[] readPassword()
     * 此方法从控制台读取密码或口令，禁用回显。
     * 8	char[] readPassword(String fmt, Object... args)
     * 此方法提供了一个格式化提示，然后读取密码或口令从控制台禁用回显。
     * 9	PrintWriter writer()
     * 此方法检索与此控制台关联的唯一PrintWriter对象。
     */

    /**
     * @param args
     */
    public static void main(String[] args) {
        Console console = System.console(); // 获得Console实例对象
        if (console != null) {              // 判断是否有控制台的使用权
            String user = new String(console.readLine("Enter username:"));      // 读取整行字符
            String pwd = new String(console.readPassword("Enter passowrd:"));   // 读取密码,输入时不显示
            console.printf("Username is: " + user + "\n");      // 显示用户名
            console.printf("Password is: " + pwd + "\n");   // 显示密码
        } else {
            System.out.println("Console is unavailable.");  // 提示无控制台使用权限
        }

    }
}
