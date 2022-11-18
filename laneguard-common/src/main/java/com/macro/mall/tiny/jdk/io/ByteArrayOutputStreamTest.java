package com.macro.mall.tiny.jdk.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName ByteArrayOutputStreamTest
 * @Author WB-918966
 * @Date 2022/11/2 18:37
 * @Version 1.0
 *
 * Java.io.ByteArrayOutputStream 类实现输出流中的数据被写入一个字节数组。作为数据写入到它的缓冲自动增长。以下是有关的ByteArrayOutputStream要点：
 *
 * 关闭一个字节数组输出流没有影响。
 *
 * 在这个类中的方法可以在流已关闭后被调用，不会产生一个IOException。
 *
 * public class ByteArrayOutputStream
 *    extends OutputStream
 **/
public class ByteArrayOutputStreamTest {

    /**
     * 字段
     * protected byte[] buf -- 这是在数据被存储在缓冲器中。
     *
     * protected int count -- 这是在缓冲器中的有效字节数。
     */

    /**
     * 构造器
     * 1	ByteArrayOutputStream()
     * 这将创建一个新的字节数组输出流。
     * 2	ByteArrayOutputStream(int size)
     * 这将创建一个新的字节数组输出流，具有缓冲容量指定的大小，以字节为单位。
     */

    /**
     * 方法
     * 1	void close()
     * 关闭一个字节数组输出流没有影响。
     * 2	void reset()
     * 此方法重置该字节数组输出流为零的计数字段，以便在输出流中的所有当前累计输出被丢弃。
     * 3	int size()
     * 此方法返回缓冲区的当前大小。
     * 4	byte[] toByteArray()
     * 此方法创建一个新分配的字节数组。
     * 5	String toString()
     * 这种方法将缓冲区的内容转换为使用平台的默认字符集的字符串解码字节。
     * 6	String toString(String charsetName)
     * 此方法通过使用指定charsetName解码字节将缓冲区的内容转换成一个字符串。
     * 7	void write(byte[] b, int off, int len)
     * 这个方法从指定的字节数组开始在该字节数组输出流关闭写入len字节。
     * 8	void write(int b)
     * 这种方法将指定字节写入该字节数组输出流。
     * 9	void writeTo(OutputStream out)
     * 此方法写入该字节数组输出流的全部内容写入到指定的输出流参数，因为这与使用out.write(buf, 0, count)调用输出流的write方法。
     */

    private static final int LEN = 5;
    // 对应英文字母“abcddefghijklmnopqrsttuvwxyz”
    private static final byte[] ArrayLetters = {
        0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
        0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A
    };

    public static void main(String[] args) {
        //String tmp = new String(ArrayLetters);
        //System.out.println("ArrayLetters="+tmp);

        tesByteArrayOutputStream() ;

        //baos=ABC
        //baos=ABCdefgh
        //size=8
        //str=ABCdefgh
        //baos2=ABCdefgh
    }

    /**
     * ByteArrayOutputStream的API测试函数
     */
    private static void tesByteArrayOutputStream() {
        // 创建ByteArrayOutputStream字节流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // 依次写入“A”、“B”、“C”三个字母。0x41对应A，0x42对应B，0x43对应C。
        baos.write(0x41);
        baos.write(0x42);
        baos.write(0x43);
        System.out.printf("baos=%s\n", baos);

        // 将ArrayLetters数组中从“3”开始的后5个字节写入到baos中。
        // 即对应写入“0x64, 0x65, 0x66, 0x67, 0x68”，即“defgh”
        baos.write(ArrayLetters, 3, 5);
        System.out.printf("baos=%s\n", baos);

        // 计算长度
        int size = baos.size();
        System.out.printf("size=%s\n", size);

        // 转换成byte[]数组
        byte[] buf = baos.toByteArray();
        String str = new String(buf);
        System.out.printf("str=%s\n", str);

        // 将baos写入到另一个输出流中
        try {
            ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
            baos.writeTo((OutputStream)baos2);
            System.out.printf("baos2=%s\n", baos2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
