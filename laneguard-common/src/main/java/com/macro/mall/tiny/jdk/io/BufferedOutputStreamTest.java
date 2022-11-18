package com.macro.mall.tiny.jdk.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @ClassName BufferedOutputStreamTest
 * @Author WB-918966
 * @Date 2022/11/2 18:14
 * @Version 1.0
 *
 * BufferedOutputStream 是缓冲输出流。它继承于FilterOutputStream。
 *
 * BufferedOutputStream 的作用是为另一个输出流提供“缓冲功能”。
 *
 * public class BufferedOutputStream
 *    extends FilterOutputStream
 **/
public class BufferedOutputStreamTest {
    /**
     * 字段
     * protected byte[] buf -- 这是在数据被存储在内部缓冲器中。
     *
     * protected int count -- 这是在缓冲器中的有效字节数。
     *
     * protected OutputStream out -- 这是相关的输出流进行过滤。
     */

    /**
     * 构造器
     * 1	BufferedOutputStream(OutputStream out)
     * 这将创建一个新的缓冲输出流将数据写入到指定的基础输出流。
     * 2	BufferedOutputStream(OutputStream out, int size)
     * 这将创建一个新的缓冲输出流的数据与指定的缓冲区大小写入指定的基础输出流。
     */

    /**
     * 1	void flush()
     * 将“缓冲数据”写入到输出流中
     * 2	void write(byte[] b, int off, int len)
     * 将字节数组写入到输出流中
     * 3	void write(int b)
     * 将“数据b(转换成字节类型)”写入到输出流中
     */

    private static final int LEN = 5;
    // 对应英文字母“abcddefghijklmnopqrsttuvwxyz”
    private static final byte[] ArrayLetters = {
        0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
        0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A
    };

    public static void main(String[] args) {
        //生成文件“out.txt”，文件的内容是“abcdefghij”
        testBufferedOutputStream() ;
    }

    /**
     * BufferedOutputStream的API测试函数
     */
    private static void testBufferedOutputStream() {

        // 创建“文件输出流”对应的BufferedOutputStream
        // 它对应缓冲区的大小是16，即缓冲区的数据>=16时，会自动将缓冲区的内容写入到输出流。
        try {
            File file = new File("out.txt");
            OutputStream out =
                new BufferedOutputStream(
                    new FileOutputStream(file), 16);

            // 将ArrayLetters数组的前10个字节写入到输出流中
            out.write(ArrayLetters, 0, 10);
            // 将“换行符\n”写入到输出流中
            out.write('\n');

            // TODO!
            //out.flush();

            readUserInput() ;

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取用户输入
     */
    private static void readUserInput() {
        System.out.println("please input a text:");
        Scanner reader=new Scanner(System.in);
        // 等待一个输入
        String str = reader.next();
        System.out.printf("the input is : %s\n", str);
    }
}
