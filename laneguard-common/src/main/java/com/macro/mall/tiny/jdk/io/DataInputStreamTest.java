package com.macro.mall.tiny.jdk.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName DataInputStreamTest
 * @Author WB-918966
 * @Date 2022/11/3 16:39
 * @Version 1.0
 **/
public class DataInputStreamTest {

    /**
     * Java.io.DataInputStream 类允许应用程序读取在与机器无关方式从底层输入流基本Java数据类型。以下是有关数据输入流的要点：
     *
     * 应用程序使用数据输出流写入，以后可以通过一个数据输入流中读取数据。
     *
     * 数据输入流并不一定是安全的多线程访问。线程安全是可选的，在这个类中的方法用户的责任。
     *
     *
     *
     * 类声明
     * 以下是java.io.DataInputStream类的声明：
     *
     * public class DataInputStream
     *    extends FilterInputStream
     *       implements DataInput
     *
     *
     *
     * 字段
     * 以下是java.io.DataInputStream类中的字段：
     *
     * protected InputStream in -- 这是将输入流进行过滤。
     *
     *
     *
     * 类的构造函数
     * S.N.	构造函数与说明
     * 1	DataInputStream(InputStream in)
     * 这将创建一个DataInputStream使用指定的底层InputStream。类方法
     *
     *
     *
     * S.N.	方法 & 描述
     * 1	int read(byte[] b)
     * 此方法从包含的输入流中读取字节数部分，并将它们存储到缓冲区数组b
     * 2	int read(byte[] b, int off, int len)
     * 此方法读取最多len个从包含的输入流的数据字节为字节数组。
     * 3	boolean readBoolean()
     * 此方法读取一个输入字节，如果该字节不为零返回true，如果该字节是零则返回false。
     * 4	byte readByte()
     * 此方法读取并返回一个输入字节。
     * 5	char readChar()
     * 此方法读取两个输入字节并返回一个char值。
     * 6	double readDouble()
     * 此方法读取八个输入字节并返回一个double值。
     * 7	float readFloat()
     * 此方法读取四个输入字节并返回一个float值。
     * 8	void readFully(byte[] b)
     * 此方法读取从输入流的一些字节，并将它们存储到缓冲区数组b中。
     * 9	void readFully(byte[] b, int off, int len)
     * 此方法从输入流读取len个字节。
     * 10	int readInt()
     * 此方法读取四个输入字节并返回一个int值。
     * 11	long readLong()
     * 此方法读取八个输入字节并返回一个长整型值。
     * 12	short readShort()
     * 此方法读取两个输入字节并返回一个short值。
     * 13	int readUnsignedByte()
     * 此方法读取一个输入字节，零扩展到int类型，并返回结果，所以结果的范围是从0到255。
     * 14	int readUnsignedShort()
     * 此方法读取两个输入字节，并通过返回在范围0-65535的int值。
     * 15	String readUTF()
     * 此方法读取在已使用UTF-8修改版格式编码的字符串。
     * 16	static String readUTF(DataInput in)
     * 此方法读取来自编码经修订的UTF-8格式的Unicode字符串的表示数据流;这串字符接着返回一个字符串。
     * 17	int skipBytes(int n)
     * 此方法使得试图从输入流中的数据跳过n个字节，丢弃跳过的字节。
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
