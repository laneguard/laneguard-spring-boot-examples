package com.macro.mall.tiny.jdk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Spliterator.OfDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import cn.hutool.core.collection.CollUtil;
import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @ClassName StreamTest
 * @Author WB-918966
 * @Date 2022/10/20 16:48
 * @Version 1.0
 **/
public class StreamTest {

    @SneakyThrows
    @Test
    public void test1(){
        //创建stream流操作
        //数组创建
        Stream<Integer> stream = Arrays.asList(1, 2, 3).stream();
        IntStream stream1 = Arrays.stream(new int[] {1, 2, 3});

        //静态方法创建
        int[] arr = {1,2,3,4,5};
        Stream<int[]> arr1 = Stream.of(arr);
        IntStream range = IntStream.range(1, 100);

        //无限流
        Stream<Integer> integerStream = Stream.iterate(0, n -> n + 1).filter(x -> x % 2 != 0);
        Stream<Double> generate = Stream.generate(() -> Math.random());

        //从文件中读取行形成流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(""));
        Stream<String> lines = bufferedReader.lines();

        //随机数流
        Random random = new Random();
        IntStream ints = random.ints();

        //底层流
        DoubleStream doubleStream = StreamSupport.doubleStream(new OfDouble() {
            @Override
            public OfDouble trySplit() {
                return null;
            }

            @Override
            public boolean tryAdvance(DoubleConsumer action) {
                return false;
            }

            @Override
            public long estimateSize() {
                return 0;
            }

            @Override
            public int characteristics() {
                return 0;
            }
        }, true);
    }

    @SneakyThrows
    @Test
    public void test2(){
        //串行流和并行流，大部分情况下结果一致，除非doc表示结果会不同比如findany方法
        //流的元素只能访问一次，类似Iterator，操作没有回头路，如果你想从头重新访问流的元素，对不起，你得重新生成一个新的流。
        //CopyOnWriteArrayList这样的线程安全集合才可以同时读写，否则流也会抛出异常
        Stream<Object> stream = CollUtil.list(true).stream();
        Stream<Object> objectStream = CollUtil.list(true).parallelStream();

    }

}
