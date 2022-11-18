package com.macro.mall.tiny.util;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName StringFormatUtil
 * @Author WB-918966
 * @Date 2022/10/27 15:37
 * @Version 1.0
 **/
public class StringFormatUtil {

    private StringFormatUtil(){}

    private static Pattern pattern = Pattern.compile("(\\$\\{([\\w\\d]{1,20})})");

    public static String FormatByMap(String format, Map<String,String> data){
        Matcher matcher = pattern.matcher(format);
        while (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(FormatByMap("lskdm ksf${na2fsa},${234dsfsf}fasdaf", null));
    }
}
