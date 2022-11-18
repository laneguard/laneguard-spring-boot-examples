package com.macro.mall.tiny.jdk.工具;

/**
 * @ClassName EnumSetTestt
 * @Author WB-918966
 * @Date 2022/11/3 17:20
 * @Version 1.0
 * 添加枚举类元素的专用集合类
 * EnumSet内部实现不使用常见的数据结构，比如数组（ArrayList）,链表（LinkedList）,哈系表（HashMap、Hashtable、HashSet）,红黑树（TreeMap、TreeSet）而是使用位运算完成集合的基本操作
 *
 **/
public abstract class EnumSetTest{
    /**
     * java.util.EnumSet 类是一种专门设置实现与枚举类型的使用。以下是关于EnumSet这重要的几点：
     *
     * 所有的枚举set的元素必须来自指定的，或明或暗地，在创建时设置一个枚举类型。
     *
     * 枚举set在内部表示为位向量。
     *
     * EnumSet是不同步的。如果多个线程同时访问一个枚举同时设置，并且至少有一个线程修改的设置，它应该保持外部同步。
     *
     * 类声明
     * 以下是java.util.EnumSet类的声明：
     *
     * public abstract class EnumSet<E extends Enum<E>>
     *   extends AbstractSet<E>
     *      implements Cloneable, Serializable
     * 类方法
     * S.N.	方法 & 描述
     * 1	static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType)
     * 此方法创建一个包含所有在指定元素类型的元素的枚举set。
     * 2	EnumSet<E> clone()
     * 此方法返回这个集合的一个副本。
     * 3	static <E extends Enum<E>> EnumSet<E> complementOf(EnumSet<E> s)
     * 此方法创建一个枚举设置相同的元素类型与指定枚举set，最初包含此类型的所有未包含指定集合中的元素。
     * 4	static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c)
     * 此方法创建一个枚举集从指定集合初始化。
     * 5	static <E extends Enum<E>> EnumSet<E> copyOf(EnumSet<E> s)
     * 此方法创建一个枚举设置相同的元素类型与指定枚举set，最初包含相同的元素（如果有的话）。
     * 6	static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType)
     * 此方法创建一个空的枚举set具有指定元素类型。
     * 7	static <E extends Enum<E>> EnumSet<E> of(E e)
     * 此方法创建一个最初包含指定元素的枚举set。
     * 8	static <E extends Enum<E>> EnumSet<E> of(E first, E... rest)
     * 此方法创建一个最初包含指定元素的枚举set。
     * 9	static <E extends Enum<E>> EnumSet<E> of(E e1, E e2)
     * 此方法创建一个最初包含指定元素的枚举set。
     * 10	static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3)
     * 此方法创建一个最初包含指定元素的枚举set。
     * 11	static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4)
     * 此方法创建一个最初包含指定元素的枚举set。
     * 12	static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4, E e5)
     * 此方法创建一个最初包含指定元素的枚举set。
     * 13	static <E extends Enum<E>> EnumSet<E> range(E from, E to)
     * 此方法创建最初包含由两个指定端点所定义范围的元素的枚举set。
     */
}
