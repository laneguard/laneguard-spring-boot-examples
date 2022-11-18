package com.macro.mall.tiny.jdk.系统;

import java.util.Arrays;
import java.util.prefs.Preferences;

import com.alibaba.fastjson.JSON;

import lombok.SneakyThrows;

/**
 * @ClassName PreferencesTest
 * @Author WB-918966
 * @Date 2022/11/14 16:08
 * @Version 1.0
 * 存储并获取用户和系统首选项和配置数据。
 * 类 Preferences
 * java.lang.Object
 *   继承者 java.util.prefs.Preferences
 * 直接已知子类：
 * AbstractPreferences
 * public abstract class Preferences
 * extends Object
 * 首选项数据的层次结构 collection 中的节点。此类允许应用程序存储和获取用户和系统首选项以及配置数据。此数据持久存储在依赖于实现的内部存储中。典型实现包括纯文本文件、特定于操作系统的注册表、目录服务器和 SQL
 * 数据库。此类的用户无需关注内部存储的细节。
 **/
public class PreferencesTest {

    /**
     * 字段摘要
     * static int	MAX_KEY_LENGTH
     *           允许作为键的字符串最大长度（80 个字符）。
     * static int	MAX_NAME_LENGTH
     *           节点名的最大长度（80 个字符）。
     * static int	MAX_VALUE_LENGTH
     *           允许作为值的字符串最大长度（8192 个字符）。
     *
     * 构造方法摘要
     * protected	Preferences()
     *           单独的构造方法。
     *
     * 方法摘要
     * abstract  String	absolutePath()
     *           返回此首选项节点的绝对路径名。
     * abstract  void	addNodeChangeListener(NodeChangeListener ncl)
     *           注册指定侦听器以接收此节点的节点更改事件。
     * abstract  void	addPreferenceChangeListener(PreferenceChangeListener pcl)
     *           注册指定侦听器以接收此首选项节点的首选项更改事件。
     * abstract  String[]	childrenNames()
     *           返回此首选项节点相对于此节点的子节点名称。
     * abstract  void	clear()
     *           移除此首选项节点中的所有首选项（键-值关联）。
     * abstract  void	exportNode(OutputStream os)
     *           在指定输出流上发出表示此节点（不是其子节点）中包含的所有首选项的 XML 文档。
     * abstract  void	exportSubtree(OutputStream os)
     *           发出表示此节点及其所有子节点中包含的全部首选项的 XML 文档。
     * abstract  void	flush()
     *           强制进行从此首选项节点及其子节点到持久存储的内容更改。
     * abstract  String	get(String key, String def)
     *           返回与此首选项节点中指定键相关联的值。
     * abstract  boolean	getBoolean(String key, boolean def)
     *           返回与此首选项节点中指定的键相关联的、由字符串表示的 boolean 值。
     * abstract  byte[]	getByteArray(String key, byte[] def)
     *           返回与此首选项节点中指定键相关联的、由字符串表示的字节数组。
     * abstract  double	getDouble(String key, double def)
     *           返回与此首选项节点中指定的键相关联的、由字符串表示的 double 值。
     * abstract  float	getFloat(String key, float def)
     *           返回与此首选项节点中指定的键相关联的、由字符串表示的 float 值。
     * abstract  int	getInt(String key, int def)
     *           返回与此首选项节点中与指定键相关联的、由字符串表示的 int 值。
     * abstract  long	getLong(String key, long def)
     *           返回与此首选项节点中指定的键相关联的、由字符串表示的 long 值。
     * static void	importPreferences(InputStream is)
     *           导入指定输入流中由 XML 文档表示的所有首选项。
     * abstract  boolean	isUserNode()
     *           如果此首选项节点位于用户首选项树中，则返回 true；如果其位于系统首选项树中，则返回 false。
     * abstract  String[]	keys()
     *           返回在此首选项节点中具有关联值的所有键。
     * abstract  String	name()
     *           返回此首选项节点相对于父节点的名称。
     * abstract  Preferences	node(String pathName)
     *           将指定首选项节点返回到此节点所在的同一树中，如果此节点及其祖先已经不存在，则创建它们。
     * abstract  boolean	nodeExists(String pathName)
     *           如果此节点所在的树中存在指定首选项节点，则返回 true。
     * abstract  Preferences	parent()
     *           返回此首选项节点的父节点；如果此为根，则返回 null。
     * abstract  void	put(String key, String value)
     *           将指定值与此首选项节点中的指定键相关联。
     * abstract  void	putBoolean(String key, boolean value)
     *           将表示指定 boolean 值的字符串与此首选项节点中的指定键相关联。
     * abstract  void	putByteArray(String key, byte[] value)
     *           将表示指定字节数组的字符串与此首选项节点中的指定键相关联。
     * abstract  void	putDouble(String key, double value)
     *           将表示指定 double 值的字符串与此首选项节点中的指定键相关联。
     * abstract  void	putFloat(String key, float value)
     *           将表示指定 float 值的字符串与此首选项节点中的指定键相关联。
     * abstract  void	putInt(String key, int value)
     *           将表示指定 int 值的字符串与此首选项节点中的指定键相关联。
     * abstract  void	putLong(String key, long value)
     *           将表示指定 long 值的字符串与此首选项节点中的指定键相关联。
     * abstract  void	remove(String key)
     *           移除与此首选项节点中与指定键相关联的值（如果有）。
     * abstract  void	removeNode()
     *           移除此首选项节点及其所有子节点，移除的节点中所包含的全部首选项都将失效。
     * abstract  void	removeNodeChangeListener(NodeChangeListener ncl)
     *           移除指定 NodeChangeListener，使其不再接收更改事件。
     * abstract  void	removePreferenceChangeListener(PreferenceChangeListener pcl)
     *           移除指定首选项更改侦听器，使其不再接收首选项更改事件。
     * abstract  void	sync()
     *           确保在调用 sync 之前从此首选项节点及其子节点进行的后续读取能反映出提交到持久存储（从任何 VM）的所有更改。
     * static Preferences	systemNodeForPackage(Class<\?> c)
     *           从系统首选项树（根据约定，它与指定类的包相关联）返回首选项节点。
     * static Preferences	systemRoot()
     *           返回系统的根首选项节点。
     * abstract  String	toString()
     *           返回此首选项节点的字符串表示形式，与通过表达式：(this.isUserNode() ? "User" : "System") + " Preference Node: " + this
     *           .absolutePath() 计算的结果一样。
     * static Preferences	userNodeForPackage(Class<\?> c)
     *           从调用用户首选项树（根据约定，它与指定类的包相关联）返回首选项节点。
     * static Preferences	userRoot()
     *           返回调用用户的根首选项节点。
     */
    @SneakyThrows
    public static void main(String[] args) {
        Preferences preferences = Preferences.systemRoot();
        System.out.println(preferences);
        System.out.println(JSON.toJSONString(preferences));
        System.out.println(Arrays.toString(preferences.childrenNames()));
        System.out.println(JSON.toJSONString(preferences.keys()));
    }
}
