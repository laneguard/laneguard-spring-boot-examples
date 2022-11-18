package com.macro.mall.tiny.jdk.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @ClassName BufferedInputStreamTest
 * @Author WB-918966
 * @Date 2022/11/2 18:02
 * @Version 1.0
 *
 * 为另一个输入流添加一些功能，例如，提供“缓冲功能”以及支持“mark()标记”和“reset()重置方法”。
 *  本质上是通过一个内部缓冲区数组实现的。
 *
 * public class BufferedInputStream
 *    extends FilterInputStream
 **/
public class BufferedInputStreamTest {
    /**
     *字段
     *protected byte[] buf -- 这是其中数据存储在内部缓冲器阵列。
     *
     * protected int count -- 这是该指数1大于在缓冲器中的最后一个有效字节的索引。
     *
     * protected int marklimit -- 这是预读之前，后续调用reset方法失败调用mark方法后允许的最大值。
     *
     * protected int markpos -- 这是pos区域在最后标记方法被调用时的值。
     *
     * protected int pos -- 这是在缓冲器中的当前位置。
     *
     * protected InputStream in -- 这是将进行过滤的输入流。
     */

    /**
     * 构造
     * 1	BufferedInputStream(InputStream in)
     * 这将创建一个缓冲输入并保存其参数在输入流中，以备后用。
     * 2	BufferedInputStream(InputStream in, int size)
     * 这将创建具有指定缓冲区大小的一个缓冲输入流，并保存其参数在输入流中，以备后用。
     */

    /**
     //下一字节是否可读
     synchronized int     available()
     //关闭流
     void     close()
     //标记, read_limit为mark后最多可读取的字节数
     synchronized void     mark(int read_limit)
     //是否支持mark, true
     boolean     markSupported()
     //读取一个字节
     synchronized int     read()
     //读取多个字节到b
     synchronized int     read(byte[] b, int off, int len)
     //重置到mark位置
     synchronized void     reset()
     //跳过n个字节
     synchronized long     skip(long n)
     */

    public void testBufferedInput() {
        try {
            /**
             * 建立输入流 BufferedInputStream, 缓冲区大小为8
             * buffer.txt内容为
             * abcdefghij
             */
            InputStream in = new BufferedInputStream(new FileInputStream(new File("buff.txt")), 8);
            /*从缓冲字节流中读取5个字节*/
            byte [] tmp = new byte[5];
            in.read(tmp, 0, 5);
            System.out.println("字节流的前5个字节为: " + new String(tmp));
            /*标记测试*/
            in.mark(6);
            /*读取5个字节*/
            in.read(tmp, 0, 5);
            System.out.println("字节流中第6到10个字节为: " +  new String(tmp));
            /*reset*/
            in.reset();
            System.out.printf("reset后读取的第一个字节为: %c" , in.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        // 指定要读取文件的缓冲输入字节流
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("F:\\test.jpg"));
        File file = new File("E:\\test.jpg");
        if (file != null) {
            file.createNewFile();
        }
        // 指定要写入文件的缓冲输出字节流
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bb = new byte[1024];// 用来存储每次读取到的字节数组
        int n;// 每次读取到的字节数组的长度
        while ((n = in.read(bb)) != -1) {
            out.write(bb, 0, n);// 写入到输出流
        }
        out.close();// 关闭流
        in.close();
    }

}
