package com.macro.mall.tiny.jdk.工具;

/**
 * @ClassName RandomTest
 * @Author WB-918966
 * @Date 2022/11/4 10:54
 * @Version 1.0
 **/
public class RandomTest {
    /**
     * java.util.Random 类实例用于生成伪随机数。下面是有关Random要点：
     *
     * 这个类使用一个48位的种子，这是一个线性同余公式修改。
     *
     * 该算法通过Random类的使用在每次调用时可以提供高达32生成的伪随机位受保护的实用方法来实现。
     *
     * 类声明
     * 以下是java.util.Random类的声明：
     *
     * public class Random
     *    extends Object
     *       implements Serializable
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	Random()
     * 这将创建一个新的随机数生成器。
     * 2	Random(long seed)
     * 这会使用单个long种子一个新的随机数发生器。类方法
     * S.N.	方法 & 描述
     * 1	protected int next(int bits)
     * 此方法生成下一个伪随机数。
     * 2	boolean nextBoolean()
     * 此方法返回下一个伪从这个随机数生成器的序列中均匀分布的boolean值。
     * 3	void nextBytes(byte[] bytes)
     * 此方法生成随机字节并将其置于用户提供的字节数组。
     * 4	double nextDouble()
     * 此方法返回下一个伪从这个随机数生成器的序列中均匀分布的0.0和1.0之间的double值。
     * 5	float nextFloat()
     * 此方法返回下一个伪从这个随机数生成器的序列中均匀分布的0.0和1.0之间的float值。
     * 6	double nextGaussian()
     * 此方法返回下一个伪高斯(“正常地”)分布的均值为0.0，标准差为1.0从此随机数生成器的序列的double值。
     * 7	int nextInt()
     * 此方法返回下一个伪从这个随机数生成器的序列中均匀分布的int值。
     * 8	int nextInt(int n)
     * 此方法返回一个伪随机，均匀分布在0(含)int值和指定值(不包括)，从此随机数生成器的序列中取出的。
     * 9	long nextLong()
     * 此方法返回下一个伪从这个随机数生成器的序列中均匀分布的long值。
     * 10	void setSeed(long seed)
     * 此方法设置此随机数生成器的使用单个long种子的种子。
     */
}
