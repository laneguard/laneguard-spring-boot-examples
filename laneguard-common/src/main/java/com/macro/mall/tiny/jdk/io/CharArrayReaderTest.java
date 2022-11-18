package com.macro.mall.tiny.jdk.io;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @ClassName CharArrayReaderTest
 * @Author WB-918966
 * @Date 2022/11/3 16:24
 * @Version 1.0
 **/
public class CharArrayReaderTest {
    /**
     * Java.io.CharArrayReader 类实现，可以用来作为一个字符输入流的字符缓冲区。
     *
     *
     *
     * 类声明
     * 以下是java.io.CharArrayReader类的声明：
     * public class CharArrayReader
     *    extends Reader
     *
     *
     *
     * 字段
     * 以下是java.io.CharArrayReader中类中的字段：
     *
     * protected char[] buf -- 这是字符缓冲区。
     *
     * protected int count -- 这是此缓冲区的末尾的索引。
     *
     * protected int markedPos -- 这是标记在缓冲区中的位置。
     *
     * protected int pos -- 这是当前的缓冲区位置。
     *
     * protected Object lock -- 这是用于同步针对此流的操作的对象。
     *
     *
     * 类的构造函数
     * S.N.	构造函数与说明
     * 1	CharArrayReader(char[] buf)
     * 这将创建由字符指定一个数组CharArrayReader。
     * 2	CharArrayReader(char[] buf, int offset, int length)
     * 这将创建由字符指定一个数组CharArrayReader。类方法
     *
     *
     *
     * S.N.	方法与说明
     * 1	void close()
     * 此方法关闭该流并释放与之关联的所有系统资源。
     * 2	void mark(int readAheadLimit)
     * 此方法标记流中的当前位置。
     * 3	boolean markSupported()
     * 这个方法告诉此流是否支持mark()操作。
     * 4	int read()
     * 此方法读取单个字符。
     * 5	int read(char[] b, int off, int len)
     * 该方法读取字符到数组的一部分。
     * 6	boolean ready()
     * 此方法通知此流是否已准备好被读取。
     * 7	void reset()
     * 此方法重置流至最新的标记，或者如果它从来没有被标记的开始。
     * 8	long skip(long n)
     * 此方法跳过n个字符。
     */
    private static final int LEN = 5;
    // 对应英文字母“abcdefghijklmnopqrstuvwxyz”
    private static final char[] ArrayLetters = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        tesCharArrayReader() ;
        //0 : a
        //1 : b
        //2 : c
        //3 : d
        //4 : e
        //buf=klmno
        //buf=fghij
    }

    /**
     * CharArrayReader的API测试函数
     */
    private static void tesCharArrayReader() {
        try {
            // 创建CharArrayReader字符流，内容是ArrayLetters数组
            CharArrayReader car = new CharArrayReader(ArrayLetters);

            // 从字符数组流中读取5个字符
            for (int i=0; i<LEN; i++) {
                // 若能继续读取下一个字符，则读取下一个字符
                if (car.ready() == true) {
                    // 读取“字符流的下一个字符”
                    char tmp = (char)car.read();
                    System.out.printf("%d : %c\n", i, tmp);
                }
            }

            // 若“该字符流”不支持标记功能，则直接退出
            if (!car.markSupported()) {
                System.out.println("make not supported!");
                return ;
            }

            // 标记“字符流中下一个被读取的位置”。即--标记“f”，因为因为前面已经读取了5个字符，所以下一个被读取的位置是第6个字符”
            // (01), CharArrayReader类的mark(0)函数中的“参数0”是没有实际意义的。
            // (02), mark()与reset()是配套的，reset()会将“字符流中下一个被读取的位置”重置为“mark()中所保存的位置”
            car.mark(0);

            // 跳过5个字符。跳过5个字符后，字符流中下一个被读取的值应该是“k”。
            car.skip(5);

            // 从字符流中读取5个数据。即读取“klmno”
            char[] buf = new char[LEN];
            car.read(buf, 0, LEN);
            System.out.printf("buf=%s\n", String.valueOf(buf));

            // 重置“字符流”：即，将“字符流中下一个被读取的位置”重置到“mark()所标记的位置”，即f。
            car.reset();
            // 从“重置后的字符流”中读取5个字符到buf中。即读取“fghij”
            car.read(buf, 0, LEN);
            System.out.printf("buf=%s\n", String.valueOf(buf));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
