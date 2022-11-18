package com.macro.mall.tiny.util.hutool.Http客户端;

import cn.hutool.http.HtmlUtil;
import org.junit.Test;

/**
 * @ClassName HtmlUtilTest
 * @Author WB-918966
 * @Date 2022/10/22 22:50
 * @Version 1.0
 * html字符和标签处理
 **/
public class HtmlUtilTest {
    @Test
    public void test(){
        String html = "<html><body>123'123'</body></html>";
        // 结果为：&lt;html&gt;&lt;body&gt;123&#039;123&#039;&lt;/body&gt;&lt;/html&gt;
        String escape = HtmlUtil.escape(html);

        String escape1 = "&lt;html&gt;&lt;body&gt;123&#039;123&#039;&lt;/body&gt;&lt;/html&gt;";
        // 结果为：<html><body>123'123'</body></html>
        String unescape = HtmlUtil.unescape(escape);

        String str = "pre<img src=\"xxx/dfdsfds/test.jpg\">";
        // 结果为：pre
        String result = HtmlUtil.removeHtmlTag(str, "img");

        String str2 = "pre<div class=\"test_div\">\r\n\t\tdfdsfdsfdsf\r\n</div><div class=\"test_div\">BBBB</div>";
        // 结果为：pre\r\n\t\tdfdsfdsfdsf\r\nBBBB
        String result2 = HtmlUtil.cleanHtmlTag(str);

        String str1 = "pre<div class=\"test_div\">abc</div>";
        // 结果为：preabc
        String result1 = HtmlUtil.unwrapHtmlTag(str, "div");

        String html1 = "<alert></alert>";
        // 结果为：""
        String filter = HtmlUtil.filter(html);
    }
}
