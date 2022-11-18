package com.macro.mall.tiny.jdk.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName BufferedReaderTest
 * @Author WB-918966
 * @Date 2022/11/2 18:20
 * @Version 1.0
 *
 *BufferedReader 是缓冲字符输入流。它继承于Reader。
 * BufferedReader 的作用是为其他字符输入流添加一些缓冲功能。
 *
 * 缓冲区的大小可以被指定或默认的大小也可使用。
 *
 * Reader的每一个读取请求会导致相应的读取请求底层字符或字节流。
 *
 * public class BufferedReader
 *    extends Reader
 **/
public class BufferedReaderTest {
    /**
     * 字段
     * protected Object lock -- 这是用于同步针对此流的操作的对象。
     */

    /**
     * 构造器
     * 1	BufferedReader(Reader in)
     * 这将创建一个使用默认大小输入缓冲区的缓冲字符输入流。
     * 2	BufferedReader(Reader in, int sz)
     * 这将创建一个使用指定大小输入缓冲区的缓冲字符输入流。
     */

    /**
     * 1	void close()
     * 此方法关闭该流并释放与之关联的所有系统资源。
     * 2	void mark(int readAheadLimit)
     * 标记当前BufferedReader的下一个要读取位置。
     * 3	boolean markSupported()
     * 这个方法告诉此流是否支持mark()操作，这确实如此。
     * 4	int read()
     * 从BufferedReader中读取一个字符，该字符以int的方式返回
     * 5	int read(char[] cbuf, int off, int len)
     * 对read1()的封装，添加了“同步处理”和“阻塞式读取”等功能
     * 6	String readLine()
     * 读取一行数据。不忽略换行符
     * 7	boolean ready()
     * “下一个字符”是否可读
     * 8	void reset()
     * 将其还原到mark()中所保存的位置。
     * 9	long skip(long n)
     * 此方法跳过n个字符。
     */

    private static final int LEN = 5;

    public static void main(String[] args) {
        testBufferedReader() ;
    }

    /**
     * BufferedReader的API测试函数
     */
    private static void testBufferedReader() {

        // 创建BufferedReader字符流，内容是ArrayLetters数组
        try {
            File file = new File("bufferedreader.txt");
            BufferedReader in =
                new BufferedReader(
                    new FileReader(file));

            // 从字符流中读取5个字符。“abcde”
            for (int i = 0; i < LEN; i++) {
                // 若能继续读取下一个字符，则读取下一个字符
                if (in.ready()) {
                    // 读取“字符流的下一个字符”
                    int tmp = in.read();
                    System.out.printf("%d : %c\n", i, tmp);
                }
            }

            // 若“该字符流”不支持标记功能，则直接退出
            if (!in.markSupported()) {
                System.out.println("make not supported!");
                return;
            }

            // 标记“当前索引位置”，即标记第6个位置的元素--“f”
            // 1024对应marklimit
            in.mark(1024);

            // 跳过22个字符。
            in.skip(22);

            // 读取5个字符
            char[] buf = new char[LEN];
            in.read(buf, 0, LEN);
            System.out.printf("buf=%s\n", String.valueOf(buf));
            // 读取该行剩余的数据
            System.out.printf("readLine=%s\n", in.readLine());

            // 重置“输入流的索引”为mark()所标记的位置，即重置到“f”处。
            in.reset();
            // 从“重置后的字符流”中读取5个字符到buf中。即读取“fghij”
            in.read(buf, 0, LEN);
            System.out.printf("buf=%s\n", String.valueOf(buf));

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
