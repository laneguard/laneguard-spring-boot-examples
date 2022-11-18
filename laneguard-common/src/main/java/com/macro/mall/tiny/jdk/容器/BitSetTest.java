package com.macro.mall.tiny.jdk.容器;

/**
 * @ClassName BitSetTest
 * @Author WB-918966
 * @Date 2022/11/2 10:18
 * @Version 1.0
 *java.util.BitSet 类实现位向量作为一个按需增长。以下是关于BitSet中的要点：
 *
 * BitSet 是不安全的，除非外部同步多线程使用。
 *
 * 集合中的所有位的初始值false。
 *
 * 传递一个null参数到BitSet中的任何方法会导致一个NullPointerException。
 *
 * public class BitSet
 *    extends Object
 *       implements Cloneable, Serializable
 **/
public class BitSetTest {
    /**
     * 1	BitSet()
     * 此构造函数创建一个新的位集。
     * 2	BitSet(int nbits)
     * 此构造函数创建一个位集，它的初始大小足够大，可以通过0 到 nbits-1范围显式表示索引。
     */

    /**
     * 1	void and(BitSet set)
     * 此方法执行一个逻辑这个目标位，并设置参数位集合。
     * 2	void andNot(BitSet set)
     * 此方法清除所有的位，其相应的位在指定BitSet中设置此BitSet中的位。
     * 3	int cardinality()
     * 此方法返回设置为true，此BitSet中的比特数。
     * 4	void clear()
     * 此方法将此BitSet中的所有的位设置为false。
     * 5	void clear(int bitIndex)
     * 此方法设置由index指定的位为false。
     * 6	void clear(int fromIndex, int toIndex)
     * 这个方法从指定的fromIndex（包括）设置位到指定toIndex（不包括）为false。
     * 7	Object clone()
     * 此方法克隆该BitSet中，并产生一个新的等于它的BitSet。
     * 8	boolean equals(Object obj)
     * 这个方法是比较这个对象与指定对象。
     * 9	void flip(int bitIndex)
     * 这种方法在指定索引到它的当前值的补码在设置位。
     * 10	void flip(int fromIndex, int toIndex)
     * 此方法设置每个位将指定的fromIndex（包括）到指定的toIndex（不包括）为其当前值的补码。
     * 11	boolean get(int bitIndex)
     * 此方法返回具有指定索引的位的值。
     * 12	BitSet get(int fromIndex, int toIndex)
     * 此方法返回的位组成一个新BitSet中此BitSet中从fromIndex（包括）到toIndex（不包括）。
     * 13	int hashCode()
     * 此方法返回具有指定索引的位的值。
     * 14	boolean intersects(BitSet set)
     * 如果指定BitSet中有设置为true，此BitSet中的任何位此方法返回true。
     * 15	boolean isEmpty()
     * 如果此BitSet中没有包含位被设置为true，此方法返回true。
     * 16	int length()
     * 此方法返回此BitSet的“逻辑大小”：在BitSet中最高设置位加一的索引。
     * 17	int nextClearBit(int fromIndex)
     * 此方法返回被设置为出现或之后指定的起始索引false的位的索引。
     * 18	int nextSetBit(int fromIndex)
     * 此方法返回被设置为出现或之后指定的起始索引true的位的索引。
     * 19	void or(BitSet set)
     * 此方法执行的逻辑该位或设置该位设置参数。
     * 20	void set(int bitIndex)
     * 这种方法在指定索引设置该位为true。
     * 21	void set(int bitIndex, boolean value)
     * 这种方法指定索引到指定设置该位的值。
     * 22	void set(int fromIndex, int toIndex)
     * 此方法设置的位将指定的fromIndex（包括）到指定的toIndex（不包括）为true。
     * 23	void set(int fromIndex, int toIndex, boolean value)
     * 此方法从指定的fromIndex（包括）设置位到指定的toIndex（不包括）到指定的值。
     * 24	int size()
     * 此方法返回实际使用此BitSet表示位值的空间的比特数。
     * 25	String toString()
     * 此方法返回此位set的字符串表示形式。
     * 26	void xor(BitSet set)
     * 此方法执行此位的逻辑异或设置该位设置参数。
     */


}
