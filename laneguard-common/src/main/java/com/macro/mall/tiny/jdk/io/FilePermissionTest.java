package com.macro.mall.tiny.jdk.io;

/**
 * @ClassName FilePermissionTest
 * @Author WB-918966
 * @Date 2022/11/3 17:01
 * @Version 1.0
 **/
public class FilePermissionTest {

    /**
     * Java.io.FilePermission 类表示访问一个文件或目录。它包括一个路径名和一套有效的路径名操作。以下是有关的FilePermission要点：
     *
     * 将予授出的动作传递给构造函数中包含一个或多个逗号分隔的关键字列表的字符串。可能的关键字是"read", "write", "execute", 和"delete"。
     *
     * 代码总是可以从同一目录它在(或该目录的子目录)读取文件;它并不需要明确许可这样做。
     *
     * 类的声明
     * 以下是Java.io.FilePermission类的声明：
     *
     * public final class FilePermission
     *    extends Permission
     *       implements Serializable
     * 类的构造函数
     * S.N.	构造函数 & 描述
     * 1	FilePermission(String path, String actions)
     * 将创建具有指定操作新的FilePermission对象。类方法
     * S.N.	方法 & 描述
     * 1	boolean equals(Object obj)
     * 此方法检查两个FilePermission对象是否相等。
     * 2	String getActions()
     * 此方法返回动作的“规范化字符串表示形式”。
     * 3	int hashCode()
     * 此方法返回此对象的哈希码值。
     * 4	boolean implies(Permission p)
     * 此方法检查，FilePermission对象是否“暗含”指定的权限。
     * 5	PermissionCollection newPermissionCollection()
     * 此方法返回一个新的对象PermissionCollection存储的FilePermission对象。
     */


}
