package com.macro.mall.tiny.jdk.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName DataOutputStreamTest
 * @Author WB-918966
 * @Date 2022/11/3 16:42
 * @Version 1.0
 **/
public class DataOutputStreamTest {

    /**
     *
     * Java.io.DataOutputStream 类允许应用程序写入基本Java数据类型在一个可移植的方式输出流。然后，应用程序可以使用数据输入流中读取的数据回入。
     *
     *
     *
     * 类声明
     * 以下是java.io.DataOutputStream类的声明：
     *
     * public class DataOutputStream
     *    extends FilterOutputStream
     *       implements DataOutput
     *
     *
     *
     * 字段
     * 以下是java.io.DataOutputStream类的字段：
     *
     * protected int written -- 这是写入到数据输出流到目前为止的字节数。
     *
     * protected OutputStream out -- 这是相关的输出流进行过滤。
     *
     *
     *
     * 类的构造函数
     * S.N.	构造函数 & 描述
     * 1	DataOutputStream(OutputStream out)
     * 这将创建一个新的数据输出流将数据写入到指定的基础输出流。类方法
     *
     *
     *
     * S.N.	方法 & 描述
     * 1	void flush()
     * 此方法刷新此数据输出流。
     * 2	int size()
     * 此方法返回计数器的当前值写入，写入该数据输出流到目前为止的字节数。
     * 3	void write(byte[] b, int off, int len)
     * 此方法从指定的字节数组开始到底层输出流关闭写入len字节。
     * 4	void write(int b)
     * 此方法写入指定的字节(低8位参数b)底层输出流。
     * 5	void writeBoolean(boolean v)
     * 此方法写入一个布尔到底层输出流为1个字节的值。
     * 6	void writeByte(int v)
     * 此方法写入了一个字节到基础输出流中1个字节的值。
     * 7	void writeBytes(String s)
     * 此方法写出的字符串到底层输出流为字节序列。
     * 8	void writeChar(int v)
     * 此方法写入一个char到底层输出流作为一个2-byte值，高字节在前。
     * 9	void writeChars(String s)
     * 此方法将一个字符串写入基础输出流作为一个字符序列。
     * 10	void writeDouble(double v)
     * 此方法将float参数转换为使用Float类的floatToIntBits方法，写入int值到底层输出流作为一个4字节的数量，高字节在前。
     * 11	void writeFloat(float v)
     * 此方法将float参数转换为使用Float类的floatToIntBits方法，写入int值到底层输出流作为一个4字节的数量，高字节在前。
     * 12	void writeInt(int v)
     * 此方法写入一个int到底层输出流为4个字节，高字节在前。
     * 13	void writeLong(long v)
     * 此方法写入了long的基础输出流中的8个字节，高字节在前。
     * 14	void writeShort(int v)
     * 此方法写入了短到底层输出流为两个字节，高字节在前。
     * 15	void writeUTF(String str)
     * 此方法将一个字符串写入使用经修订的UTF-8编码以与机器无关的方式的基础输出流。
     */


    private static final int LEN = 5;

    public static void main(String[] args) {
        // 测试DataOutputStream，将数据写入到输出流中。
        testDataOutputStream() ;
        // 测试DataInputStream，从上面的输出流结果中读取数据。
        testDataInputStream() ;
        //byteToHexString(0x8F):0x8f
        //charToHexString(0x8FCF):0x8fcf
        //readBoolean():true
        //readByte():0x41
        //readChar():0x4243
        //readShort():0x4445
        //readInt():0x12345678
        //readLong():0xfedcba987654321
        //readUTF():abcdefghijklmnopqrstuvwxyz严12
    }

    /**
     * DataOutputStream的API测试函数
     */
    private static void testDataOutputStream() {

        try {
            File file = new File("file.txt");
            DataOutputStream out =
                new DataOutputStream(
                    new FileOutputStream(file));

            out.writeBoolean(true);
            out.writeByte((byte)0x41);
            out.writeChar((char)0x4243);
            out.writeShort((short)0x4445);
            out.writeInt(0x12345678);
            out.writeLong(0x0FEDCBA987654321L);

            out.writeUTF("abcdefghijklmnopqrstuvwxyz严12");

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
     * DataInputStream的API测试函数
     */
    private static void testDataInputStream() {

        try {
            File file = new File("file.txt");
            DataInputStream in =
                new DataInputStream(
                    new FileInputStream(file));

            System.out.printf("byteToHexString(0x8F):0x%s\n", byteToHexString((byte)0x8F));
            System.out.printf("charToHexString(0x8FCF):0x%s\n", charToHexString((char)0x8FCF));

            System.out.printf("readBoolean():%s\n", in.readBoolean());
            System.out.printf("readByte():0x%s\n", byteToHexString(in.readByte()));
            System.out.printf("readChar():0x%s\n", charToHexString(in.readChar()));
            System.out.printf("readShort():0x%s\n", shortToHexString(in.readShort()));
            System.out.printf("readInt():0x%s\n", Integer.toHexString(in.readInt()));
            System.out.printf("readLong():0x%s\n", Long.toHexString(in.readLong()));
            System.out.printf("readUTF():%s\n", in.readUTF());

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 打印byte对应的16进制的字符串
    private static String byteToHexString(byte val) {
        return Integer.toHexString(val & 0xff);
    }

    // 打印char对应的16进制的字符串
    private static String charToHexString(char val) {
        return Integer.toHexString(val);
    }

    // 打印short对应的16进制的字符串
    private static String shortToHexString(short val) {
        return Integer.toHexString(val & 0xffff);
    }
}
