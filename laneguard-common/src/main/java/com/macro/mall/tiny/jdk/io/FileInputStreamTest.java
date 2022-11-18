package com.macro.mall.tiny.jdk.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @ClassName FileInputStreamTest
 * @Author WB-918966
 * @Date 2022/11/3 16:58
 * @Version 1.0
 * FileInputStream 是文件输入流，它继承于InputStream。
 * 通常，我们使用FileInputStream从某个文件中获得输入字节。
 *
 * FileOutputStream 是文件输出流，它继承于OutputStream。
 * 通常，我们使用FileOutputStream 将数据写入 File 或 FileDescriptor 的输出流。
 **/
public class FileInputStreamTest {

    /**
     * Java.io.FileInputStream 类从文件系统中的一个文件中获取输入字节。那些文件依赖于主机环境。以下是关于文件输入流的要点：
     *
     * 这个类是指对原始字节诸如图像数据读出流。
     *
     * 对于字符读取流，使用FileReader。
     *
     *
     *
     * 类的声明
     * 以下是java.io.FileInputStream类的声明：
     *
     * public class FileInputStream
     *    extends InputStream
     *
     *
     * 类构造方法
     * S.N.	构造函数 & 描述
     * 1	FileInputStream(File file)
     * 这通过打开一个到实际文件，命名在文件系统中的File对象文件的文件的连接创建一个FileInputStream。
     * 2	FileInputStream(FileDescriptor fdObj)
     * 这通过使用文件描述符fdObj，它代表在文件系统中某个实际文件的现有连接创建一个FileInputStream。
     * 3	FileInputStream(String name)
     * 这将创建一个FileInputStream通过打开一个到实际文件的连接，通过路径名名在文件系统命名的文件。类方法
     *
     *
     * S.N.	方法 & 描述
     * 1	int available()
     * 此方法从输入流中通过一个方法的下一次调用阻塞该输入流返回可以读取（或跳过）的剩余字节数的估计值。
     * 2	void close()
     * 此方法关闭此文件输入流并释放与该流关联的所有系统资源。
     * 3	protected void finalize()
     * 此方法可确保此文件输入流的close方法被调用当它没有更多的参考引用。
     * 4	FileChannel getChannel()
     * 此方法返回与此文件输入流关联的唯一文件通道对象。
     * 5	FileDescriptor getFD()
     * 此方法返回FileDescriptor对象，表示连接到正在使用此文件输入流文件系统的实际文件。
     * 6	int read()
     * 此方法读取当前输入流中一个字节的数据。
     * 7	int read(byte[] b)
     * 此方法从这个输入流中数据读取可达b.length个字节到字节数组。
     * 8	int read(byte[] b, int off, int len)
     * 此方法读取最多len个从这个输入流中数据的字节到字节数组。
     * 9	long skip(long n)
     * 此方法跳过并丢弃n个字节从输入流中的数据。
     */


    private static final String FileName = "file.txt";

    public static void main(String[] args) {
        testWrite();
        testRead();
    }

    /**
     * FileOutputStream 演示函数
     *
     * 运行结果：
     * 在源码所在目录生成文件"file.txt"，文件内容是“abcdefghijklmnopqrstuvwxyz0123456789”
     *
     * 加入，我们将 FileOutputStream fileOut2 = new FileOutputStream(file, true);
     *       修改为 FileOutputStream fileOut2 = new FileOutputStream(file, false);
     * 然后再执行程序，“file.txt”的内容变成"0123456789"。
     * 原因是：
     * (01) FileOutputStream fileOut2 = new FileOutputStream(file, true);
     *      它是以“追加模式”将内容写入文件的。即写入的内容，追加到原始的内容之后。
     * (02) FileOutputStream fileOut2 = new FileOutputStream(file, false);
     *      它是以“新建模式”将内容写入文件的。即删除文件原始的内容之后，再重新写入。
     */
    private static void testWrite() {
        try {
            // 创建文件“file.txt”对应File对象
            File file = new File(FileName);
            // 创建文件“file.txt”对应的FileOutputStream对象，默认是关闭“追加模式”
            FileOutputStream fileOut1 = new FileOutputStream(file);
            // 创建FileOutputStream对应的PrintStream，方便操作。PrintStream的写入接口更便利
            PrintStream out1 = new PrintStream(fileOut1);
            // 向“文件中”写入26个字母
            out1.print("abcdefghijklmnopqrstuvwxyz");
            out1.close();

            // 创建文件“file.txt”对应的FileOutputStream对象，打开“追加模式”
            FileOutputStream fileOut2 = new FileOutputStream(file, true);
            // 创建FileOutputStream对应的PrintStream，方便操作。PrintStream的写入接口更便利
            PrintStream out2 = new PrintStream(fileOut2);
            // 向“文件中”写入"0123456789"+换行符
            out2.println("0123456789");
            out2.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * FileInputStream 演示程序
     */
    private static void testRead() {
        try {
            // 方法1：新建FileInputStream对象
            // 新建文件“file.txt”对应File对象
            File file = new File(FileName);
            FileInputStream in1 = new FileInputStream(file);

            // 方法2：新建FileInputStream对象
            FileInputStream in2 = new FileInputStream(FileName);

            // 方法3：新建FileInputStream对象
            // 获取文件“file.txt”对应的“文件描述符”
            FileDescriptor fdin = in2.getFD();
            // 根据“文件描述符”创建“FileInputStream”对象
            FileInputStream in3 = new FileInputStream(fdin);

            // 测试read()，从中读取一个字节
            char c1 = (char)in1.read();
            System.out.println("c1="+c1);

            // 测试skip(long byteCount)，跳过4个字节
            in1.skip(25);

            // 测试read(byte[] buffer, int byteOffset, int byteCount)
            byte[] buf = new byte[10];
            in1.read(buf, 0, buf.length);
            System.out.println("buf="+(new String(buf)));


            // 创建“FileInputStream”对象对应的BufferedInputStream
            BufferedInputStream bufIn = new BufferedInputStream(in3);
            // 读取一个字节
            char c2 = (char)bufIn.read();
            System.out.println("c2="+c2);

            in1.close();
            in2.close();
            in3.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
