package com.macro.mall.tiny.jdk.io;

import java.io.ByteArrayInputStream;

/**
 * @ClassName ByteArrayInputStreamTest
 * @Author WB-918966
 * @Date 2022/11/2 18:33
 * @Version 1.0
 *
 * java.io.ByteArrayInputStream 类包含包含可从流中读取的字节的内部缓冲器。内部计数器保持下一个字节的读法提供的轨道。以下是关于ByteArrayInputStream类重要的几点：
 *
 * 关闭ByteArrayInputStream类没有任何效果。
 *
 * 在这个类中的方法可以在流已关闭后，而被调用不会产生一个IOException。
 *
 * public class ByteArrayInputStream
 *    extends InputStream
 **/
public class ByteArrayInputStreamTest {

    /**
     * 字段
     * protected byte[] buf -- 这是由流的创建者所提供的字节数组。
     *
     * protected int count -- 这是索引一个大于在输入流缓冲器中的最后一个有效字符。
     *
     * protected int mark -- 这是流中的当前标记的位置。
     *
     * protected int pos -- 这是从输入流缓存器读取的下一个字符索引。
     */

    /**
     * 字段
     *1	ByteArrayInputStream(byte[] buf)
     * 这将创建一个ByteArrayInputStream类，以便它使用的buf为缓冲区数组。
     * 2	ByteArrayInputStream(byte[] buf, int offset, int length)
     * 这将创建一个ByteArrayInputStream类使用的buf为缓冲区数组。
     */

    /**
     * 1	int available()
     * 这个方法从当前输入流返回可以读取(或跳过)的剩余字节数。
     * 2	void close()
     * 关闭ByteArrayInputStream类没有任何影响效果。
     * 3	void mark(int readAheadLimit)
     * 这种方法在流中设置的当前标记的位置。
     * 4	boolean markSupported()
     * 是否这个InputStream支持标记/重置此方法测试。
     * 5	int read()
     * 此方法读取从这个输入流数据的下一个字节。
     * 6	int read(byte[] b, int off, int len)
     * 此方法读取最多len个字节数据到从这个输入流中的字节数组。
     * 7	void reset()
     * 这种方法缓冲区重置为标记位置。
     * 8	long skip(long n)
     * 此方法跳过输入流中n个字节的输入。
     */

    private static final int LEN = 5;
    // 对应英文字母“abcddefghijklmnopqrsttuvwxyz”
    private static final byte[] ArrayLetters = {
        0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
        0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A
    };

    public static void main(String[] args) {

        String tmp = new String(ArrayLetters);
        System.out.println("ArrayLetters="+tmp);

        tesByteArrayInputStream() ;
        //ArrayLetters=abcdefghijklmnopqrstuvwxyz
        //0 : 0x61
        //1 : 0x62
        //2 : 0x63
        //3 : 0x64
        //4 : 0x65
        //str1=klmno
        //str2=fghij
    }

    /**
     * ByteArrayInputStream的API测试函数
     */
    private static void tesByteArrayInputStream() {
        // 创建ByteArrayInputStream字节流，内容是ArrayLetters数组
        ByteArrayInputStream bais = new ByteArrayInputStream(ArrayLetters);

        // 从字节流中读取5个字节
        for (int i=0; i<LEN; i++) {
            // 若能继续读取下一个字节，则读取下一个字节
            if (bais.available() >= 0) {
                // 读取“字节流的下一个字节”
                int tmp = bais.read();
                System.out.printf("%d : 0x%s\n", i, Integer.toHexString(tmp));
            }
        }

        // 若“该字节流”不支持标记功能，则直接退出
        if (!bais.markSupported()) {
            System.out.println("make not supported!");
            return ;
        }

        // 标记“字节流中下一个被读取的位置”。即--标记“0x66”，因为因为前面已经读取了5个字节，所以下一个被读取的位置是第6个字节”
        // (01), ByteArrayInputStream类的mark(0)函数中的“参数0”是没有实际意义的。
        // (02), mark()与reset()是配套的，reset()会将“字节流中下一个被读取的位置”重置为“mark()中所保存的位置”
        bais.mark(0);

        // 跳过5个字节。跳过5个字节后，字节流中下一个被读取的值应该是“0x6B”。
        bais.skip(5);

        // 从字节流中读取5个数据。即读取“0x6B, 0x6C, 0x6D, 0x6E, 0x6F”
        byte[] buf = new byte[LEN];
        bais.read(buf, 0, LEN);
        // 将buf转换为String字符串。“0x6B, 0x6C, 0x6D, 0x6E, 0x6F”对应字符是“klmno”
        String str1 = new String(buf);
        System.out.printf("str1=%s\n", str1);

        // 重置“字节流”：即，将“字节流中下一个被读取的位置”重置到“mark()所标记的位置”，即0x66。
        bais.reset();
        // 从“重置后的字节流”中读取5个字节到buf中。即读取“0x66, 0x67, 0x68, 0x69, 0x6A”
        bais.read(buf, 0, LEN);
        // 将buf转换为String字符串。“0x66, 0x67, 0x68, 0x69, 0x6A”对应字符是“fghij”
        String str2 = new String(buf);
        System.out.printf("str2=%s\n", str2);
    }
}
