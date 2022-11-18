package com.macro.mall.tiny.jdk.io;

/**
 * @ClassName FileOutputStreamTest
 * @Author WB-918966
 * @Date 2022/11/3 17:00
 * @Version 1.0
 **/
public class FileOutputStreamTest {
    /**
     * Java.io.FileOutputStream 类是用于将数据写入一个文件或FileDescriptor的输出流。以下是关于文件输出流的要点：
     *
     * 这个类是指用于记录的原始字节，例如图像数据流。
     *
     * 写字符流，可以使用文件字符 FileWriter
     *
     * 类声明
     * 以下是java.io.FileOutputStream类的声明：
     *
     * public class FileOutputStream
     *    extends OutputStream
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	FileOutputStream(File file)
     * 这将创建一个文件输出流写入到由指定的File对象表示文件。
     * 2	FileOutputStream(File file, boolean append)
     * 这将创建一个文件输出流写入到由指定的File对象表示的文件。
     * 3	FileOutputStream(FileDescriptor fdObj)
     * 这将创建一个输出文件流写入到指定的文件描述符，它代表了文件系统中的某个实际文件的现有连接。
     * 4	FileOutputStream(String name)
     * 这将创建一个输出文件流写入到具有指定名称的文件。
     * 5	FileOutputStream(String name, boolean append)
     * 这将创建一个输出文件流写入到具有指定名称的文件。类方法
     * S.N.	方法 & 描述
     * 1	void close()
     * 此方法关闭此文件输出流并释放与此流有关的所有系统资源。
     * 2	protected void finalize()
     * 这种方法清除连接到文件，并确保此文件输出流的close方法被调用时，此流不再有引用。
     * 3	FileChannel getChannel()
     * 此方法返回与此文件输出流关联的唯一文件通道对象。
     * 4	FileDescriptor getFD()
     * 此方法返回与此流有关的文件描述符。
     * 5	void write(byte[] b)
     * 此方法写入b.length个字节从指定的字节数组到该文件输出流。
     * 6	void write(byte[] b, int off, int len)
     * 此方法从指定的字节数组开始到该文件输出流关闭写入len字节。
     * 7	void write(int b)
     * 此方法写入指定的字节写入此文件输出流。
     */


}
