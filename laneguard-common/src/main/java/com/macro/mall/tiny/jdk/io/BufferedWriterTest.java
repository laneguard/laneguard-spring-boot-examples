package com.macro.mall.tiny.jdk.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName BufferedWriterTest
 * @Author WB-918966
 * @Date 2022/11/2 18:27
 * @Version 1.0
 *
 * Java.io.BufferedWriter 类将文本写入字符输出流，缓冲各个字符，从而提供单个字符，数组和字符串的高效写入。以下是有关的BufferedWriter要点：
 *
 * 缓冲区的大小可以被指定或默认的大小也可使用。
 *
 * Writer 发送其输出到底层字符或字节流。
 *
 * public class BufferedWriter
 *    extends Writer
 **/
public class BufferedWriterTest {

    /**
     * 字段
     * protected Object lock -- 这是用于同步针对此流操作的对象。
     */

    /**
     * 1	BufferedWriter(Writer out)
     * 这将创建一个使用默认大小输出缓冲区的缓冲字符输出流。
     * 2	BufferedWriter(Writer out, int sz)
     * 这将创建一个使用给定大小的输出缓冲区的新缓冲字符输出流。
     */

    /**
     * 1	void close()
     * 此方法关闭该流，但要先刷新它。
     * 2	void flush()
     * 这个方法刷新流。
     * 3	void newLine()
     * 此方法写入一个行分隔符。
     * 4	void write(char[] cbuf, int off, int len)
     * 此方法写入字符数组的一部分。
     * 5	void write(int c)
     * 此方法写入的单个字符。
     * 6	void write(String s, int off, int len)
     * 此方法写入一个字符串的一部分。
     */

    private static final int LEN = 5;
    // 对应英文字母“abcdefghijklmnopqrstuvwxyz”
    //private static final char[] ArrayLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final char[] ArrayLetters = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        testBufferedWriter() ;
    }

    /**
     * BufferedWriter的API测试函数
     */
    private static void testBufferedWriter() {

        // 创建“文件输出流”对应的BufferedWriter
        // 它对应缓冲区的大小是16，即缓冲区的数据>=16时，会自动将缓冲区的内容写入到输出流。
        try {
            File file = new File("bufferwriter.txt");
            BufferedWriter out =
                new BufferedWriter(
                    new FileWriter(file));

            // 将ArrayLetters数组的前10个字符写入到输出流中
            out.write(ArrayLetters, 0, 10);
            // 将“换行符\n”写入到输出流中
            out.write('\n');
            //或者
            out.newLine();

            out.flush();
            //readUserInput() ;

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
