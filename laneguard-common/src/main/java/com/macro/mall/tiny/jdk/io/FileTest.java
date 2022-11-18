package com.macro.mall.tiny.jdk.io;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @ClassName FileTest
 * @Author WB-918966
 * @Date 2022/11/3 16:44
 * @Version 1.0
 **/
public class FileTest {

    /**
     * java.io.File类是文件和目录路径名的抽象表示。以下是有关文件的要点：
     *
     * 实例可以或可以不表示实际的文件系统对象，如文件或目录。如果是这样表示这样一个对象，然后该对象位于一个分区。分区是存储为文件系统的操作系统的特定部分。
     *
     * 文件系统可以实现限制某些操作的实际文件系统对象，如读，写，和执行上。这些限制统称为访问权限。
     *
     * File类的实例是不可变的;也就是说，一旦创建，由一个File对象表示的抽象路径名是不会改变的。
     *
     *
     *
     * 类的声明
     * 以下是声明java.io.File类：
     *
     * public class File
     *   extends Object
     *     implements Serializable, Comparable<File>
     *
     *
     *
     * 字段
     * 以下是java.io.File类的字段：
     *
     * static String pathSeparator -- 这是系统相关的路径分隔符，表示为一个字符串以方便使用。
     *
     * static char pathSeparatorChar -- 这是依赖于系统的路径分隔符。
     *
     * static String separator -- 这是与系统有关的默认名称分隔符，表示为一个字符串以方便使用。
     *
     * static char separatorChar -- 这是与系统有关的默认名称分隔符。
     *
     *
     *
     * 类的构造函数
     * S.N.	构造函数 & 描述
     * 1	File(File parent, String child)
     * 此方法创建从父抽象路径名和child路径名字符串的新File实例。
     * 2	File(String pathname)
     * 该方法通过将给定路径名字符串转换为抽象路径名来创建一个新File实例。
     * 3	File(String parent, String child)
     * 此方法创建从父路径名字符串和child路径名字符串的新File实例。
     * 4	File(URI uri)
     * URI转换成抽象路径名：此方法通过给定的文件将创建一个新的File实例。类方法
     *
     *
     *
     * S.N.	方法 & 描述
     * 1	boolean canExecute()
     * 此方法测试应用程序是否可以执行表示此抽象路径名的文件。
     * 2	boolean canRead()
     * 这种方法测试应用程序是否可以读取表示此抽象路径名的文件。
     * 3	boolean canWrite()
     * 此方法测试应用程序是否可以修改表示此抽象路径名的文件。
     * 4	int compareTo(File pathname)
     * 这种方法比较两个抽象路径名的字典顺序。
     * 5	boolean createNewFile()
     * 此方法自动创建此抽象路径名命名的，当且仅当具有此名称的文件尚不存在一个新的空文件。
     * 6	static File createTempFile(String prefix, String suffix)
     * 此方法创建的默认临时文件目录的空文件，使用给定前缀和后缀生成其名称。
     * 7	static File createTempFile(String prefix, String suffix, File directory)
     * 此方法会在指定的目录中一个新的空文件，使用给定前缀和后缀字符串生成其名称。
     * 8	boolean delete()
     * 此方法删除表示此抽象路径名的文件或目录。
     * 9	void deleteOnExit()
     * 此方法要求将表示此抽象路径名的文件或目录在虚拟机终止时被删除。
     * 10	boolean equals(Object obj)
     * 此方法测试此抽象路径名与给定对象是否相等。
     * 11	boolean exists()
     * 此方法测试表示此抽象路径名的文件或目录是否存在。
     * 12	File getAbsoluteFile()
     * 此方法返回此抽象路径名的绝对形式。
     * 13	String getAbsolutePath()
     * 此方法返回此抽象路径名的绝对路径名字符串。
     * 14	File getCanonicalFile()
     * 此方法返回此抽象路径名的规范形式。
     * 15	String getCanonicalPath()
     * 此方法返回此抽象路径名的规范路径名字符串。
     * 16	long getFreeSpace()
     * 此方法返回此抽象路径名的分区中的未分配的字节数。
     * 17	String getName()
     * 此方法返回表示此抽象路径名的文件或目录的名称。
     * 18	String getParent()
     * 此方法返回此抽象路径名的父路径名的字符串，或者null，如果此路径名没有指定父目录。
     * 19	File getParentFile()
     * 此方法返回此抽象路径名的父抽象路径名，或null，如果此路径名没有指定父目录。
     * 20	String getPath()
     * 此方法此抽象路径名转换为一个路径名字符串。
     * 21	long getTotalSpace()
     * 此方法返回此抽象路径名的分区的大小。
     * 22	long getUsableSpace()
     * 此方法返回可用字节数这个虚拟机上命名此抽象路径名的分区。
     * 23	int hashCode()
     * 此方法用于计算此抽象路径名的哈希码。
     * 24	boolean isAbsolute()
     * 此方法测试此抽象路径名是否是绝对的。
     * 25	boolean isDirectory()
     * 此方法测试表示此抽象路径名的文件是否是一个目录。
     * 26	boolean isFile()
     * 此方法测试表示此抽象路径名的文件是否是一个正常的文件。
     * 27	boolean isHidden()
     * 此方法测试此抽象路径名的文件是否是一个隐藏文件。
     * 28	long lastModified()
     * 此方法返回的时候，表示此抽象路径名的文件的最后修改
     * 29	long length()
     * 此方法返回表示此抽象路径名的文件的长度。
     * 30	String[] list()
     * 此方法返回的字符串命名表示此抽象路径名的目录中的文件和目录的数组。
     * 31	String[] list(FilenameFilter filter)
     * 此方法返回的字符串命名的目录表示此抽象路径名满足指定过滤器的文件和目录的数组。
     * 32	File[] listFiles()
     * 此方法返回抽象路径名表示在表示此抽象路径名的目录中的文件的数组。
     * 33	File[] listFiles(FileFilter filter)
     * 此方法返回抽象路径名表示的目录表示此抽象路径名满足指定过滤器的文件和目录的数组。
     * 34	File[] listFiles(FilenameFilter filter)
     * 此方法返回抽象路径名表示的目录表示此抽象路径名满足指定过滤器的文件和目录的数组。
     * 35	static File[] listRoots()
     * 此方法列出可用的文件系统的根。
     * 36	boolean mkdir()
     * 此方法创建此抽象路径名的目录。
     * 37	boolean mkdirs()
     * 此方法创建此抽象路径名的目录，包括任何必需但不存在的父目录
     * 38	boolean renameTo(File dest)
     * 这种方法将重命名表示此抽象路径名的文件。
     * 39	boolean setExecutable(boolean executable)
     * 这是一个方便的方法来设置所有者对于此抽象路径名执行权限。
     * 40	boolean setExecutable(boolean executable, boolean ownerOnly)
     * 此方法设置所有者或每个人的执行权限，此抽象路径名。
     * 41	boolean setLastModified(long time)
     * 此方法设置此抽象路径名的文件或目录的最后修改时间。
     * 42	boolean setReadable(boolean readable)
     * 这是一个方便的方法来设置此抽象路径名的所有者的读取权限。
     * 43	boolean setReadable(boolean readable, boolean ownerOnly)
     * 此方法设置所有者或在此抽象路径名大家的读取权限。
     * 44	boolean setReadOnly()
     * 此方法标志着此抽象路径名命名的，这样只允许读操作的文件或目录。
     * 45	boolean setWritable(boolean writable)
     * 这是一个方便的方法来设置此抽象路径名的所有者的写权限。
     * 46	boolean setWritable(boolean writable, boolean ownerOnly)
     * 此方法设置此抽象路径名的所有者或每个人的写权限。
     * 47	String toString()
     * 此方法返回此抽象路径名的路径名字符串。
     * 48	URI toURI()
     * 这种方法构造一个文件：URI表示此抽象路径名。
     */

    public static void main(String[] args) {
        testFileStaticFields() ;
        testFileDirAPIS() ;
    }

    public static void testFileStaticFields() {
        // 打印 路径分隔符":"
        System.out.printf("File.pathSeparator=\"%s\"\n", File.pathSeparator);
        // 打印 路径分隔符':'
        System.out.printf("File.pathSeparatorChar=\"%c\"\n", File.pathSeparatorChar);
        // 打印 分隔符"/"
        System.out.printf("File.separator=\"%s\"\n", File.separator);
        // 打印 分隔符'/'
        System.out.printf("File.separatorChar=\"%c\"\n", File.separatorChar);
    }

    public static void testFileDirAPIS() {
        try {
            // 新建目录 "dir"
            File dir = new File("dir");
            dir.mkdir();

            // 方法1：新建目录 "dir/sub1"。父目录“dir”必须已经存在！
            File sub1 = new File("dir", "sub1");
            sub1.mkdir();
            // 方法2：新建目录 "dir/sub2"。父目录“dir”必须已经存在！
            File sub2 = new File(dir, "sub2");
            sub2.mkdir();
            // 方法3：新建目录 "dir/sub3"。mkdirs()会自动创建不存在的父目录。
            File sub3 = new File("dir/sub3");
            sub3.mkdirs();
            // 方法4：新建目录 "dir/sub4"。根据“绝对路径”创建，前面3个方法都是根据“相对路径”创建。
            String dirPath = dir.getAbsolutePath();    // 获取“dir”的绝对路径
            String sub4AbsPath = dirPath + File.separator + "sub4";    // File.separator是分隔符"/"
            File sub4 = new File(sub4AbsPath);
            sub4.mkdirs();
            // 方法5：新建目录 "dir/sub5"。根据uri
            String uri_sub5_path = "file:"+ dirPath + File.separator + "sub5";
            URI uri_sub5 = new URI(uri_sub5_path);
            File sub5 = new File(uri_sub5);
            sub5.mkdirs();

            // 方法1：新建文件 "dir/l1_normal.txt"
            File l1_normal = new File(dir, "l1_normal.txt");
            l1_normal.createNewFile();
            // 方法2：新建文件 "dir/.l1_hide.txt"。
            File l1_hide = new File("dir", ".l1_hide.txt"); // 在linux中, "."开头的文件是隐藏文件。
            l1_hide.createNewFile();
            // 方法3：新建文件 "dir/l1_abs.txt"。
            String dirAbsPah =  dir.getAbsolutePath();    // 获取dir的绝对路径
            String l1_abs_path = dirAbsPah+File.separator+"l1_abs.txt";
            File l1_abs = new File(l1_abs_path);
            l1_abs.createNewFile();
            //System.out.printf("l1_abs_path=%s\n", l1_abs_path);
            //System.out.printf("l1_abs path=%s\n", l1_abs.getAbsolutePath());
            // 方法4：新建文件 "dir/l1_uri.txt"。根据URI新建文件
            String uri_path = "file:"+ dirAbsPah + File.separator + "l1_uri.txt";
            URI uri_l1 = new URI(uri_path);
            //System.out.printf("uri_l1=%s\n", l1_abs.getAbsolutePath());
            File l1_uri = new File(uri_l1);
            l1_uri.createNewFile();

            // 新建文件 "dir/sub/s1_normal"
            File s1_normal = new File(sub1, "s1_normal.txt");
            s1_normal.createNewFile();

            System.out.printf("%30s = %s\n", "s1_normal.exists()", s1_normal.exists());
            System.out.printf("%30s = %s\n", "s1_normal.getName()", s1_normal.getName());
            System.out.printf("%30s = %s\n", "s1_normal.getParent()", s1_normal.getParent());
            System.out.printf("%30s = %s\n", "s1_normal.getPath()", s1_normal.getPath());
            System.out.printf("%30s = %s\n", "s1_normal.getAbsolutePath()", s1_normal.getAbsolutePath());
            System.out.printf("%30s = %s\n", "s1_normal.getCanonicalPath()", s1_normal.getCanonicalPath());
            System.out.printf("%30s = %s is \"%s\"\n", "s1_normal.lastModified()", s1_normal.lastModified(), getModifyTime(s1_normal.lastModified()));
            System.out.printf("%30s = %s\n", "s1_normal.toURI()", s1_normal.toURI());


            // 列出“dir”目录下的“文件”和“文件夹”。
            // 注意：dir.listFiles()只会遍历目录dir，而不会遍历dir的子目录！
            System.out.println("---- list files and folders ----");
            File[] fs = dir.listFiles();
            for (File f:fs) {
                String fname = f.getName();
                String absStr = f.isAbsolute() ? "[Absolute]" : "";
                String hidStr = f.isHidden() ? "[Hidden]" : "";
                String dirStr = f.isDirectory() ? "[Directory]" : "";
                String fileStr = f.isFile() ? "[File]" : "";

                System.out.printf("%-30s  %s%s%s%s\n", fname, fileStr, dirStr, absStr, hidStr);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getModifyTime(long millis) {
        // 获取Calendar对象
        Calendar cal = Calendar.getInstance();
        // 设置时间为 millis
        cal.setTimeInMillis(millis);
        // 获取格式化对象，它会按照"yyyy-MM-dd HH:mm:ss"格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.printf("TIME %s\n", str);
        return sdf.format(cal.getTime());
    }

    /**
     * api结果
     * getName(): FileTest.txt
     * getParent(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02
     * getParentFile(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02
     * getAbsolutePath(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02\FileTest.txt
     * getAbsoluteFile(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02\FileTest.txt
     * getAbsoluteFile().getParent(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02
     * getPath(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02\FileTest.txt
     * isAbsolute(): true
     * getCanonicalPath(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02\FileTest.txt
     * getCanonicalFile(): C:\Users\LIAOJIANYA\Desktop\filetest\filedir02\FileTest.txt
     * canRead(): true
     * canWrite(): false
     * canExecute(): true
     * exists(): true
     * isDirectory(): false
     * isFile(): true
     * isHidden(): false
     * true
     * lastModified(): 1970-01-19 05:31:15
     * length(): 3
     * mkdir(): false
     * mkdirs(): false
     * ========上一级目录下的所有文件和路径=========
     * dir1
     * dir2
     * FileTest.txt
     * file重命名：true
     * ========上一级目录下的所有文件和目录=========
     * dir1
     * dir2
     * FileTest.txt
     * canRead(): true
     * setWritable(): true
     * canWrite(): false
     * canExecute(): true
     * ========相对路径=========
     * user.dir：C:\DATA\selfcode
     * newFile文件是否存在：true
     * 新建newFile文件后是否存在：true, 路径为：C:\DATA\selfcode\test.txt
     * getName(): test.txt
     * getParent(): null
     * getParentFile(): null
     * getAbsolutePath(): C:\DATA\selfcode\test.txt
     * getAbsoluteFile(): C:\DATA\selfcode\test.txt
     * getAbsoluteFile().getParent(): C:\DATA\selfcode
     * getPath(): test.txt
     * isAbsolute(): false
     * getCanonicalPath(): C:\DATA\selfcode\test.txt
     * getCanonicalFile(): C:\DATA\selfcode\test.txt
     * URI：file:/C:/DATA/selfcode/test.txt
     * ========系统根目录下的所有文件和路径=========
     * C:\
     * getTotalSpace(): 237 G
     * getFreeSpace(): 41 G
     * getUsableSpace(): 41 G
     * Path: C:\Users\LIAOJIANYA\Desktop\filetest\filedir02\FileTest.txt
     */
}
