package com.macro.mall.tiny.jdk.io;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @ClassName CharArrayWriterTest
 * @Author WB-918966
 * @Date 2022/11/3 16:27
 * @Version 1.0
 **/
public class CharArrayWriterTest {

    /**
     * Java.io.CharArrayWriter 类可以用来作为一个Writer的字符缓冲区。当数据被写入到流缓冲区会自动增长。
     *
     *
     *
     * 类声明
     * 以下是java.io.CharArrayWriter类的声明：
     *
     * public class CharArrayWriter
     *    extends Writer
     *
     *
     *
     * 字段
     * 以下是java.io.CharArrayWriter类中的字段：
     *
     * protected char[] buf -- 这是被存储在缓冲器中的数据。
     *
     * protected int count -- 这是在缓冲区字符的数目。
     *
     * protected Object lock -- 这是用于同步针对此流的操作的对象。
     *
     *
     *
     * 类的构造函数
     * S.N.	构造函数与说明
     * 1	CharArrayWriter()
     * 这将创建由字符指定数组一个CharArrayReader。
     * 2	CharArrayWriter(int initialSize)
     * 这将创建一个新的CharArrayWriter使用指定的初始大小。类方法
     *
     *
     *
     * S.N.	方法与说明
     * 1	CharArrayWriter append(char c)
     * 此方法将指定字符追加到这个writer。
     * 2	CharArrayWriter append(CharSequence csq)
     * 此方法将指定的字符序列追加到这个writer。
     * 3	CharArrayWriter append(CharSequence csq, int start, int end)
     * 此方法将指定的字符序列的子序列写入此writer。
     * 4	void close()
     * 这种方法关闭流。
     * 5	void flush()
     * 这个方法刷新流。
     * 6	void reset()
     * 此方法重设缓冲区，这样就可以再次使用它而无需丢弃已分配的缓冲区。
     * 7	int size()
     * 此方法返回缓冲区的当前大小。
     * 8	char[] toCharArray()
     * 此方法返回输入数据的副本。
     * 9	String toString()
     * 这种方法的输入数据转换为字符串。
     * 10	void write(char[] c, int off, int len)
     * 此方法写入字符到缓冲区。
     * 11	void write(int c)
     * 这种方法将一个字符写入到缓冲区。
     * 12	void write(String str, int off, int len)
     * 此方法写入的字符串的一部分到缓冲区。
     * 13	void writeTo(Writer out)
     * 此方法写入的缓冲区的内容到另一个字符流。
     */


    private static final int LEN = 5;
    // 对应英文字母“abcdefghijklmnopqrstuvwxyz”
    private static final char[] ArrayLetters = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {

        tesCharArrayWriter() ;
        //caw=ABCdefgh0123456789ijkl
        //size=22
        //buf=ABCdefgh0123456789ijkl
        //caw2=ABCdefgh0123456789ijkl
    }

    /**
     * CharArrayWriter的API测试函数
     */
    private static void tesCharArrayWriter() {
        try {
            // 创建CharArrayWriter字符流
            CharArrayWriter caw = new CharArrayWriter();

            // 写入“A”个字符
            caw.write('A');
            // 写入字符串“BC”个字符
            caw.write("BC");
            //System.out.printf("caw=%s\n", caw);
            // 将ArrayLetters数组中从“3”开始的后5个字符(defgh)写入到caw中。
            caw.write(ArrayLetters, 3, 5);
            //System.out.printf("caw=%s\n", caw);

            // (01) 写入字符0
            // (02) 然后接着写入“123456789”
            // (03) 再接着写入ArrayLetters中第8-12个字符(ijkl)
            caw.append('0').append("123456789").append(String.valueOf(ArrayLetters), 8, 12);

            System.out.printf("caw=%s\n", caw);

            // 计算长度
            int size = caw.size();
            System.out.printf("size=%s\n", size);

            // 转换成byte[]数组
            char[] buf = caw.toCharArray();
            System.out.printf("buf=%s\n", String.valueOf(buf));

            // 将caw写入到另一个输出流中
            CharArrayWriter caw2 = new CharArrayWriter();
            caw.writeTo(caw2);
            System.out.printf("caw2=%s\n", caw2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
