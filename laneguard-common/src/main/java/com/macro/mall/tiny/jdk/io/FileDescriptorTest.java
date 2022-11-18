package com.macro.mall.tiny.jdk.io;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @ClassName FileDescriptorTest
 * @Author WB-918966
 * @Date 2022/11/3 16:54
 * @Version 1.0
 * FileDescriptor 是“文件描述符”。
 * FileDescriptor 可以被用来表示开放文件、开放套接字等。
 * 以FileDescriptor表示文件来说：当FileDescriptor表示某文件时，我们可以通俗的将FileDescriptor看成是该文件。但是，我们不能直接通过FileDescriptor
 * 对该文件进行操作；若需要通过FileDescriptor对该文件进行操作，则需要新创建FileDescriptor对应的FileOutputStream，再对文件进行操作。
 **/
public class FileDescriptorTest {
    /**
     *
     * Java.io.FileDescriptor 类实例作为一个不透明的句柄底层机器特有的结构表示一个打开的文件，打开的套接字或其他来源或字节的接收器。以下是关于FileDescriptor要点：
     *
     * 主要实际使用的文件描述符是创建一个FileInputStream或FileOutputStream来遏制它。
     *
     * 应用程序不应创建自己的文件描述符。
     *
     *
     *
     * 类的声明
     * 以下是java.io.FileDescriptor类的声明：
     *
     * public final class FileDescriptor
     *    extends Object
     *
     *
     *
     * 字段
     * 以下是java.io.FileDescriptor类中的字段：
     *
     * static FileDescriptor err -- 这是句柄的标准错误流。
     *
     * static FileDescriptor in -- 这是句柄的标准输入流。
     *
     * static FileDescriptor out -- 这是句柄到标准输出流。
     *
     *
     *
     * 类的构造函数
     * S.N.	构造函数 & 描述
     * 1	FileDescriptor()
     * 这种方法构造一个(无效)FileDescriptor对象。类方法
     *
     *
     *
     * S.N.	方法 & 描述
     * 1	void sync()
     * 此方法强制所有系统缓冲区与基础设备同步。
     * 1	boolean valid()
     * 如果此方法测试文件描述符对象是否有效？
     */


    private static final String FileName = "file.txt";
    private static final String OutText = "Hi FileDescriptor";
    public static void main(String[] args) {
        testWrite();
        testRead();

        testStandFD() ;
        //System.out.println(OutText);
        //fdout(java.io.FileDescriptor@2b820dda) is true
        //in1.read():A
        //in2.read():a
        //fdin(java.io.FileDescriptor@675b7986) is true
        //Hi FileDescriptor
    }

    /**
     * FileDescriptor.out 的测试程序
     *
     * 该程序的效果 等价于 System.out.println(OutText);
     */
    private static void testStandFD() {
        // 创建FileDescriptor.out 对应的PrintStream
        PrintStream out = new PrintStream(
            new FileOutputStream(FileDescriptor.out));
        // 在屏幕上输出“Hi FileDescriptor”
        out.println(OutText);
        out.close();
    }

    /**
     * FileDescriptor写入示例程序
     *
     * (01) 为了说明，"通过文件名创建FileOutputStream"与“通过文件描述符创建FileOutputStream”对象是等效的
     * (02) 该程序会在“该源文件”所在目录新建文件"file.txt"，并且文件内容是"Aa"。
     */
    private static void testWrite() {
        try {
            // 新建文件“file.txt”对应的FileOutputStream对象
            FileOutputStream out1 = new FileOutputStream(FileName);
            // 获取文件“file.txt”对应的“文件描述符”
            FileDescriptor fdout = out1.getFD();
            // 根据“文件描述符”创建“FileOutputStream”对象
            FileOutputStream out2 = new FileOutputStream(fdout);

            out1.write('A');    // 通过out1向“file.txt”中写入'A'
            out2.write('a');    // 通过out2向“file.txt”中写入'A'

            if (fdout!=null)
                System.out.printf("fdout(%s) is %s\n",fdout, fdout.valid());

            out1.close();
            out2.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * FileDescriptor读取示例程序
     *
     * 为了说明，"通过文件名创建FileInputStream"与“通过文件描述符创建FileInputStream”对象是等效的
     */
    private static void testRead() {
        try {
            // 新建文件“file.txt”对应的FileInputStream对象
            FileInputStream in1 = new FileInputStream(FileName);
            // 获取文件“file.txt”对应的“文件描述符”
            FileDescriptor fdin = in1.getFD();
            // 根据“文件描述符”创建“FileInputStream”对象
            FileInputStream in2 = new FileInputStream(fdin);

            System.out.println("in1.read():"+(char)in1.read());
            System.out.println("in2.read():"+(char)in2.read());

            if (fdin!=null)
                System.out.printf("fdin(%s) is %s\n", fdin, fdin.valid());

            in1.close();
            in2.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
