package com.macro.mall.tiny.util.hutool.Http客户端;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Map;

import cn.hutool.core.lang.Console;
import cn.hutool.core.map.MapUtil;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import org.junit.Test;

/**
 * @ClassName HttpRequestTest
 * @Author WB-918966
 * @Date 2022/10/22 22:36
 * @Version 1.0
 * HttpUtil中的get和post工具方法都是HttpRequest对象的封装，因此如果想更加灵活操作Http请求，可以使用HttpRequest。
 **/
public class HttpRequestTest {
    @Test
    public void test(){
        //普通表单
        String url = "url";
        Map<String, Object> map = MapUtil.newHashMap();
        //链式构建请求
        String result2 = HttpRequest.post(url)
            .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
            .form(map)//表单内容
            .timeout(20000)//超时，毫秒
            .execute().body();
        Console.log(result2);
    }

    @Test
    public void test2() {
        //json请求
        String json = "...";
        String url = "";
        String result2 = HttpRequest.post(url)
            .body(json)
            .execute().body();
    }

    @Test
    public void test3() {
        //使用请求代理
        String url = "";
        String json = "...";
        String result2 = HttpRequest.post(url)
            .setProxy(new Proxy(Proxy.Type.HTTP,
                new InetSocketAddress(8080)))
                .body(json)
                .execute().body();
        //代理
        System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");
        Authenticator.setDefault(
            new Authenticator() {
                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("authUser", "authPassword".toCharArray());
                }
            }
        );
    }

    @Test
    public void test4() {
        //json请求
        String json = "...";
        String url = "";
        HttpResponse res = HttpRequest.post(url)
            .body(json)
            .execute();
        //状态码
        Console.log(res.getStatus());
        //预定义的头信息
        Console.log(res.header(Header.CONTENT_ENCODING));
        //自定义头信息
        Console.log(res.header("Content-Disposition"));
    }

}
