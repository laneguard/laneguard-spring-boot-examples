package com.macro.mall.tiny.util.hutool.Http客户端;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.StreamProgress;
import cn.hutool.core.lang.Console;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpUtil;
import org.junit.Test;

/**
 * @ClassName HttpUtilTest
 * @Author WB-918966
 * @Date 2022/10/22 22:16
 * @Version 1.0
 **/
public class HttpUtilTest {
    @Test
    public void test(){
        // 最简单的HTTP请求，可以自动通过header等信息判断编码，不区分HTTP和HTTPS
        String result1= HttpUtil.get("https://www.baidu.com");

        // 当无法识别页面编码的时候，可以自定义请求页面的编码
        String result2= HttpUtil.get("https://www.baidu.com", CharsetUtil.CHARSET_UTF_8);

        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("city", "北京");

        String result3= HttpUtil.get("https://www.baidu.com", paramMap);
    }

    @Test
    public void test2(){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("city", "北京");

        String result= HttpUtil.post("https://www.baidu.com", paramMap);
    }

    @Test
    public void test3(){
        HashMap<String, Object> paramMap = new HashMap<>();
        //文件上传只需将参数中的键指定（默认file），值设为文件对象即可，对于使用者来说，文件上传与普通表单提交并无区别
        paramMap.put("file", FileUtil.file("D:\\face.jpg"));

        String result= HttpUtil.post("https://www.baidu.com", paramMap);
    }

    @Test
    public void test4(){
        String fileUrl = "http://mirrors.sohu.com/centos/8.4.2105/isos/x86_64/CentOS-8.4.2105-x86_64-dvd1.iso";
        //带进度显示的文件下载
        HttpUtil.downloadFile(fileUrl, FileUtil.file("e:/"), new StreamProgress(){

            @Override
            public void start() {
                Console.log("开始下载。。。。");
            }

            @Override
            public void progress(long total,long progressSize) {
                Console.log("已下载：{}", FileUtil.readableFileSize(progressSize));
            }

            @Override
            public void finish() {
                Console.log("下载完成！");
            }
        });
    }

    @Test
    public void test5(){
        //对url进行标准化编码
        String s = HttpUtil.encodeParams("", StandardCharsets.UTF_8);

        //设置或者解析url中的参数
        String s1 = HttpUtil.toParams(MapUtil.newHashMap());
        Map<String, List<String>> stringListMap = HttpUtil.decodeParams("", "UTF-8");

        //合并map参数为请求参数到url后
        String url = HttpUtil.urlWithForm("url", MapUtil.newHashMap(), StandardCharsets.UTF_8, true);

        //获取mime的媒体类型
        String filePath = HttpUtil.getMimeType("filePath");
    }
}
