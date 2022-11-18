package com.macro.mall.tiny.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.difflib.DiffUtils;
import com.github.difflib.algorithm.DiffException;
import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.Chunk;
import com.github.difflib.patch.Patch;
import com.google.common.collect.Lists;
import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @ClassName DiffUtil
 * @Author WB-918966
 * @Date 2022/11/1 11:51
 * @Version 1.0
 **/
public class DiffUtil {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter path1:");
        String path1 = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("enter path2:");
        String path2 = scanner2.nextLine();
        ArrayList<File> files1 = Lists.newArrayList(FileUtil.ls(path1));
        ArrayList<File> files2 = Lists.newArrayList(FileUtil.ls(path2));
        System.out.println(files1);
        System.out.println(files2);
        Map<String, File> collect = files2.stream().collect(Collectors.toMap(File::getName, file -> file));
        System.out.println(collect);
        files1.forEach(file->{
            File target = collect.get(file.getName());
            if (Objects.isNull(target)){
                return;
            }
            try {
                String pre = IoUtil.read(new FileReader(file));
                String online = IoUtil.read(new FileReader(target));
                System.out.println(pre.length());
                System.out.println(online.length());
                System.out.println(pre.equals(online));
                System.out.println(SecureUtil.md5(pre));
                System.out.println(SecureUtil.md5(online));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private static void fileCompare(File path1, File path2) throws FileNotFoundException, DiffException {
        List<String> original = IoUtil.readLines(new FileInputStream(path1), StandardCharsets.UTF_8,
            Lists.newArrayList());
        List<String> revised = IoUtil.readLines(new FileInputStream(path2), StandardCharsets.UTF_8,
            Lists.newArrayList());
        System.out.println(String.format("正在比较文件:%s and %s ...",path1.getName(),path2.getName()));
        Patch<String> diff = DiffUtils.diff(original, revised);
        List<AbstractDelta<String>> deltas = diff.getDeltas();
        deltas.forEach(delta -> {
            switch (delta.getType()) {
                case INSERT:
                    //新增
                    Chunk<String> insert = delta.getTarget();
                    int position = insert.getPosition();
                    System.out.println("+ 第" + (position + 1) + "行 新增" + insert.getLines());
                    break;
                case CHANGE:
                    //修改
                    Chunk<String> source = delta.getSource();
                    Chunk<String> target1 = delta.getTarget();
                    System.out.println("- 第" + (source.getPosition() + 1) + "行 变更删除" + source.getLines() + " + 第" + "" + (target1.getPosition() + 1) + "行 变更增加" + target1.getLines());
                    break;
                case DELETE:
                    //删除
                    Chunk<String> delete = delta.getSource();
                    System.out.println("- 第" + (delete.getPosition() + 1) + "行 删除" + delete.getLines());
                    break;
                case EQUAL:
                    System.out.println("无变化");
                default:
                    System.out.println("文件一致.");
                    break;
            }
        });
        System.out.println(String.format("文件比较结束:%s and %s.",path1.getName(),path2.getName()));
    }

    @SneakyThrows
    @Test
    public void test(){
        System.out.println(SecureUtil.md5(IoUtil.read(IoUtil.getUtf8Reader(FileUtil.getInputStream("/Users/laneguard/Desktop/log/online/2431.csv")))));
        System.out.println(SecureUtil.md5(IoUtil.read(IoUtil.getUtf8Reader(FileUtil.getInputStream("/Users/laneguard/Desktop/log/pre/2431 (3).csv")))));
        ArrayList<String> list1 = IoUtil.readLines(new FileReader("/Users/laneguard/Desktop/log/online/2431.csv"),
            Lists.newArrayList());
        ArrayList<String> list2 = IoUtil.readLines(new FileReader("/Users/laneguard/Desktop/log/pre/2431 (3).csv"),
            Lists.newArrayList());
        List<String> sort1 = ListUtil.sort(list1, Comparator.naturalOrder());
        List<String> sort2 = ListUtil.sort(list2, Comparator.naturalOrder());
        Collection<String> disjunction = CollUtil.disjunction(sort1, sort2);
        System.out.println(disjunction);

    }
}
