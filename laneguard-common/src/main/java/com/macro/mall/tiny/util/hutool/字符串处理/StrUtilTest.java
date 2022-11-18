package com.macro.mall.tiny.util.hutool.字符串处理;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @ClassName StrUtilTest
 * @Author WB-918966
 * @Date 2022/10/21 16:46
 * @Version 1.0
 **/
@Slf4j
public class StrUtilTest {


    @Test
    public void test1(){
        //hasBlank、hasEmpty方法
        // 这两个方法的区别是hasEmpty只判断是否为null或者空字符串（""），
        //hasBlank则会把不可见字符也算做空，isEmpty和isBlank同理。
        StrUtil.hasEmpty();
        StrUtil.hasBlank();

        //removePrefix、removeSuffix方法
        //这两个是去掉字符串的前缀后缀的，例如去个文件名的扩展名啥。
        String fileName = StrUtil.removeSuffix("pretty_girl.jpg", ".jpg") ;//fileName -> pretty_girl

        //sub方法
        //不会越界异常
        String str = "abcdefgh";
        String strSub1 = StrUtil.sub(str, 2, 3); //strSub1 -> c
        String strSub2 = StrUtil.sub(str, 2, -3); //strSub2 -> cde
        String strSub3 = StrUtil.sub(str, 3, 2); //strSub2 -> c

        //str、bytes方法,不会乱码
        StrUtil.str(StrUtil.bytes("test"),"UTF-8");

        //format方法
        String template = "{}爱{}，就像老鼠爱大米";
        String strf = StrUtil.format(template, "我", "你"); //str -> 我爱你，就像老鼠爱大米

        //常量
        //public static final String HTML_NBSP = "&nbsp;";
        //public static final String HTML_AMP = "&amp;";
        //public static final String HTML_QUOTE = "&quot;";
        //public static final String HTML_APOS = "&apos;";
        //public static final String HTML_LT = "&lt;";
        //public static final String HTML_GT = "&gt;";
        //public static final String EMPTY_JSON = "{}";
    }

    @Test
    public void test2(){
        //去除空格
        StrUtil.trim("");

        //根据模板渲染字符串
        String format = StrUtil.format("hello {var1}", MapUtil.newHashMap());

        //生成uuid
        String uuid = StrUtil.uuid();

        //计算相似度
        double similar = StrUtil.similar("1,2,3,4", "1,2,3,4");
        System.out.println(similar);
    }


    @Test
    public void test() throws InterruptedException {

    }
}
