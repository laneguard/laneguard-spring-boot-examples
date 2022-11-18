package com.macro.mall.tiny.jdk;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * @ClassName MatcherTest
 * @Author WB-918966
 * @Date 2022/10/26 15:26
 * @Version 1.0
 * pattern 对象是一个正则表达式的编译表示
 * Matcher 对象是对输入字符串进行解释和匹配操作的引擎
 *
 **/
public class MatcherTest {


    @Test
    public void test(){
        //创建一个正则表达式
        Pattern p=Pattern.compile("\\w+");
        p.pattern();//返回 \w+

        //根据正则表达式分割字符串
        Pattern p1=Pattern.compile("\\d+");
        String[] str=p1.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");

        //直接用正则匹配字符串
        Pattern.matches("\\d+","2223");//返回true
        Pattern.matches("\\d+","2223aa");//返回false,需要匹配到所有字符串才能返回true,这里aa不能匹配到
        Pattern.matches("\\d+","22bb23");//返回false,需要匹配到所有字符串才能返回true,这里bb不能匹配到
    }

    @Test
    public void test2(){
        //Matcher类的构造方法也是私有的,不能随意创建,只能通过Pattern.matcher(CharSequence input)方法得到该类的实例.
        //Matcher类提供了对正则表达式的分组支持,以及对正则表达式的多次匹配支持.
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("22bb23");
        m.pattern();//返回p 也就是返回该Matcher对象是由哪个Pattern对象的创建的
    }

    @Test
    public void test3(){
        //matches()对整个字符串进行匹配,只有整个字符串都匹配了才返回true
        Pattern p1=Pattern.compile("\\d+");
        Matcher m1=p1.matcher("22bb23");
        m1.matches();//返回false,因为bb不能被\d+匹配,导致整个字符串匹配未成功.
        Matcher m2=p1.matcher("2223");
        m2.matches();//返回true,因为\d+匹配到了整个字符串
    }

    @Test
    public void test4(){
        //lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("22bb23");
        m.lookingAt();//返回true,因为\d+匹配到了前面的22
        Matcher m2=p.matcher("aa2223");
        m2.lookingAt();//返回false,因为\d+不能匹配前面的aa
    }

    @Test
    public void test5(){
        //find()对字符串进行匹配,匹配到的字符串可以在任何位置.
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("22bb23");
        m.find();//返回true
        Matcher m2=p.matcher("aa2223");
        m2.find();//返回true
        Matcher m3=p.matcher("aa2223bb");
        m3.find();//返回true
        Matcher m4=p.matcher("aabb");
        m4.find();//返回false
    }

    @Test
    public void test6(){
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("aaa2223bb");
        m.find();//匹配2223
        m.start();//返回3 ,返回匹配字符索引
        m.end();//返回7,返回的是2223后的索引号
        m.group();//返回2223

        Matcher m2= m.pattern().matcher("2223bb");
        m.lookingAt();   //匹配2223
        m.start();   //返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0
        m.end();   //返回4
        m.group();   //返回2223

        Matcher m3= m.pattern().matcher("2223bb");
        m.matches();   //匹配整个字符串
        m.start();   //返回0,原因相信大家也清楚了
        m.end();   //返回6,原因相信大家也清楚了,因为matches()需要匹配所有字符串
        m.group();   //返回2223bb
    }

    @Test
    public void test7(){
        Pattern p=Pattern.compile("([a-z]+)(\\d+)");
        Matcher m=p.matcher("aaa2223bb");
        m.find();   //匹配aaa2223
        m.groupCount();   //返回2,因为正则里有两个捕获组
        m.start(1);   //返回0 返回第一组匹配到的子字符串在字符串中的索引号
        m.start(2);   //返回3
        m.end(1);   //返回3 返回第一组匹配到的子字符串的最后一个字符在字符串中的索引位置.
        m.end(2);   //返回7
        m.group(1);   //返回aaa,返回第一组匹配到的子字符串
        m.group(2);   //返回2223,返回第二组匹配到的子字符串

        //注意:只有当匹配操作成功,才可以使用start(),end(),group()三个方法,否则会抛出java.lang.IllegalStateException,也就是当matches(),lookingAt(),
        // find()其中任意一个方法返回true时,才可以使用.
        Pattern p1=Pattern.compile("\\d+");
        Matcher m1=p1.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com");
        while(m1.find()) {
            System.out.println(m1.group());
            System.out.print("start:"+m1.start());
            System.out.println(" end:"+m1.end());
        }
    }

    @Test
    public void test8(){
        Pattern pattern = Pattern.compile("($\\{([\\w\\d]{1,20})})");
        Matcher matcher = pattern.matcher("床前${var1}光，${var2}天涯还叫");
        while (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }

    public String expressionFormat(String match, Map<String,String> formatParam){

        return null;
    }

    /**
     * 元字符
     *
     * \
     * 将下一字符标记为特殊字符、文本、反向引用或八进制转义符。例如， n匹配字符 n。\n 匹配换行符。序列 \\\\ 匹配 \\ ，\\( 匹配 (。
     *
     * ^
     * 匹配输入字符串开始的位置。如果设置了 RegExp 对象的 Multiline 属性，^ 还会与"\n"或"\r"之后的位置匹配。
     *
     * $
     * 匹配输入字符串结尾的位置。如果设置了 RegExp 对象的 Multiline 属性，$ 还会与"\n"或"\r"之前的位置匹配。
     *
     * *
     * 零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
     *
     * +
     * 一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
     *
     * ?
     * 零次或一次匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。
     *
     * {n}
     * n 是非负整数。正好匹配 n 次。例如，"o{2}"与"Bob"中的"o"不匹配，但与"food"中的两个"o"匹配。
     *
     * {n,}
     * n 是非负整数。至少匹配 n 次。例如，"o{2,}"不匹配"Bob"中的"o"，而匹配"foooood"中的所有 o。"o{1,}"等效于"o+"。"o{0,}"等效于"o*"。
     *
     * {n,m}
     * m 和 n 是非负整数，其中 n <= m。匹配至少 n 次，至多 m 次。例如，"o{1,3}"匹配"fooooood"中的头三个 o。'o{0,1}' 等效于 'o?'。注意：您不能将空格插入逗号和数字之间。
     *
     * ?
     * 当此字符紧随任何其他限定符（*、+、?、{n}、{n,}、{n,m}
     * ）之后时，匹配模式是"非贪心的"。"非贪心的"模式匹配搜索到的、尽可能短的字符串，而默认的"贪心的"模式匹配搜索到的、尽可能长的字符串。例如，在字符串"oooo"中，"o+?"只匹配单个"o"，而"o+"匹配所有"o"。
     *
     * .
     * 匹配除"\r\n"之外的任何单个字符。若要匹配包括"\r\n"在内的任意字符，请使用诸如"[\s\S]"之类的模式。
     *
     * (pattern)
     * 匹配 pattern 并捕获该匹配的子表达式。可以使用 $0…$9 属性从结果"匹配"集合中检索捕获的匹配。若要匹配括号字符 ( )，请使用"\("或者"\)"。
     *
     * (?:pattern)
     * 匹配 pattern 但不捕获该匹配的子表达式，即它是一个非捕获匹配，不存储供以后使用的匹配。这对于用"or"字符 (|) 组合模式部件的情况很有用。例如，'industr(?:y|ies) 是比
     * 'industry|industries' 更经济的表达式。
     *
     * (?=pattern)
     * 执行正向预测先行搜索的子表达式，该表达式匹配处于匹配 pattern 的字符串的起始点的字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?=95|98|NT|2000)'
     * 匹配"Windows 2000"中的"Windows"，但不匹配"Windows 3.1"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。
     *
     * (?!pattern)
     * 执行反向预测先行搜索的子表达式，该表达式匹配不处于匹配 pattern 的字符串的起始点的搜索字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?!95|98|NT|2000)'
     * 匹配"Windows 3.1"中的 "Windows"，但不匹配"Windows 2000"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。
     *
     * x|y
     * 匹配 x 或 y。例如，'z|food' 匹配"z"或"food"。'(z|f)ood' 匹配"zood"或"food"。
     *
     * [xyz]
     * 字符集。匹配包含的任一字符。例如，"[abc]"匹配"plain"中的"a"。
     *
     * [^xyz]
     * 反向字符集。匹配未包含的任何字符。例如，"[^abc]"匹配"plain"中"p"，"l"，"i"，"n"。
     *
     * [a-z]
     * 字符范围。匹配指定范围内的任何字符。例如，"[a-z]"匹配"a"到"z"范围内的任何小写字母。
     *
     * [^a-z]
     * 反向范围字符。匹配不在指定的范围内的任何字符。例如，"[^a-z]"匹配任何不在"a"到"z"范围内的任何字符。
     *
     * \b
     * 匹配一个字边界，即字与空格间的位置。例如，"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。
     *
     * \B
     * 非字边界匹配。"er\B"匹配"verb"中的"er"，但不匹配"never"中的"er"。
     *
     * \cx
     * 匹配 x 指示的控制字符。例如，\cM 匹配 Control-M 或回车符。x 的值必须在 A-Z 或 a-z 之间。如果不是这样，则假定 c 就是"c"字符本身。
     *
     * \d
     * 数字字符匹配。等效于 [0-9]。
     *
     * \D
     * 非数字字符匹配。等效于 [^0-9]。
     *
     * \f
     * 换页符匹配。等效于 \x0c 和 \cL。
     *
     * \n
     * 换行符匹配。等效于 \x0a 和 \cJ。
     *
     * \r
     * 匹配一个回车符。等效于 \x0d 和 \cM。
     *
     * \s
     * 匹配任何空白字符，包括空格、制表符、换页符等。与 [ \f\n\r\t\v] 等效。
     *
     * \S
     * 匹配任何非空白字符。与 [^ \f\n\r\t\v] 等效。
     *
     * \t
     * 制表符匹配。与 \x09 和 \cI 等效。
     *
     * \v
     * 垂直制表符匹配。与 \x0b 和 \cK 等效。
     *
     * \w
     * 匹配任何字类字符，包括下划线。与"[A-Za-z0-9_]"等效。
     *
     * \W
     * 与任何非单词字符匹配。与"[^A-Za-z0-9_]"等效。
     *
     * \xn
     * 匹配 n，此处的 n 是一个十六进制转义码。十六进制转义码必须正好是两位数长。例如，"\x41"匹配"A"。"\x041"与"\x04"&"1"等效。允许在正则表达式中使用 ASCII 代码。
     *
     * \num
     * 匹配 num，此处的 num 是一个正整数。到捕获匹配的反向引用。例如，"(.)\1"匹配两个连续的相同字符。
     *
     * \n
     * 标识一个八进制转义码或反向引用。如果 \n 前面至少有 n 个捕获子表达式，那么 n 是反向引用。否则，如果 n 是八进制数 (0-7)，那么 n 是八进制转义码。
     *
     * \nm
     * 标识一个八进制转义码或反向引用。如果 \nm 前面至少有 nm 个捕获子表达式，那么 nm 是反向引用。如果 \nm 前面至少有 n 个捕获，则 n 是反向引用，后面跟有字符 m。如果两种前面的情况都不存在，则 \nm
     * 匹配八进制值 nm，其中 n 和 m 是八进制数字 (0-7)。
     *
     * \nml
     * 当 n 是八进制数 (0-3)，m 和 l 是八进制数 (0-7) 时，匹配八进制转义码 nml。
     *
     * \\un
     * 匹配 n，其中 n 是以四位十六进制数表示的 Unicode 字符。例如，\u00A9 匹配版权符号 (©)。
     */
}
