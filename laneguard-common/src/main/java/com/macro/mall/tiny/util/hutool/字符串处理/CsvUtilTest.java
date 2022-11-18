package com.macro.mall.tiny.util.hutool.字符串处理;

import java.util.List;

import cn.hutool.core.annotation.Alias;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.text.csv.CsvData;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvRow;
import cn.hutool.core.text.csv.CsvUtil;
import cn.hutool.core.text.csv.CsvWriter;
import cn.hutool.core.util.CharsetUtil;
import lombok.Data;
import org.junit.Test;

/**
 * @ClassName CsvUtilTest
 * @Author WB-918966
 * @Date 2022/10/24 15:30
 * @Version 1.0
 * 逗号分隔值（Comma-Separated Values，CSV，有时也称为字符分隔值，因为分隔字符也可以不是逗号），其文件以纯文本形式存储表格数据（数字和文本）。
 *
 * Hutool针对此格式，参考FastCSV项目做了对CSV文件读写的实现(Hutool实现完全独立，不依赖第三方)
 *
 * CsvUtil是CSV工具类，主要封装了两个方法：
 *
 * getReader 用于对CSV文件读取
 * getWriter 用于生成CSV文件
 * 这两个方法分别获取CsvReader对象和CsvWriter，从而独立完成CSV文件的读写。
 *
 * CSV文件本身为一种简单文本格式，有编码区分，你可以使用任意编码。
 *
 * 但是当使用Excel读取CSV文件时，如果你的编码与系统编码不一致，会出现乱码的情况，解决方案如下：
 *
 * 可以将csv文本编码设置为与系统一致，如Windows下可以设置GBK
 *
 * 可以增加BOM头来指定编码，这样Excel可以自动识别bom头的编码完成解析。在文件字节流开头增加三个字节的bom标识即可。
 **/
public class CsvUtilTest {
    @Test
    public void test(){
        CsvReader reader = CsvUtil.getReader();
        //从文件中读取CSV数据
        CsvData data = reader.read(FileUtil.file("test.csv"));
        List<CsvRow> rows = data.getRows();
        //遍历行
        for (CsvRow csvRow : rows) {
            //getRawList返回一个List列表，列表的每一项为CSV中的一个单元格（既逗号分隔部分）
            Console.log(csvRow.getRawList());
        }
    }

    @Test
    public void test1(){
        final CsvReader reader = CsvUtil.getReader();
        //假设csv文件在classpath目录下
        final List<TestBean> result = reader.read(
            ResourceUtil.getUtf8Reader("test_bean.csv"), TestBean.class);
    }

    @Test
    public void test2(){
        //指定路径和编码
        CsvWriter writer = CsvUtil.getWriter("e:/testWrite.csv", CharsetUtil.CHARSET_UTF_8);
        //按行写出
        writer.write(
            new String[] {"a1", "b1", "c1"},
            new String[] {"a2", "b2", "c2"},
            new String[] {"a3", "b3", "c3"}
        );
    }

    @Data
    private static class TestBean{
        // 如果csv中标题与字段不对应，可以使用alias注解设置别名
        @Alias("姓名")
        private String name;
        private String gender;
        private String focus;
        private Integer age;
    }
}
