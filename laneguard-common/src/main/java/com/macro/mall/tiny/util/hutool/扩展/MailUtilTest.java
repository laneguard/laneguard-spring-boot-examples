package com.macro.mall.tiny.util.hutool.扩展;

import cn.hutool.extra.mail.MailUtil;
import org.junit.Test;

/**
 * @ClassName MailUtilTest
 * @Author WB-918966
 * @Date 2022/9/17 10:43
 * @Version 1.0
 **/
public class MailUtilTest {
    @Test
    public void test1(){
        MailUtil.send("1209721204@qq.com","test mail","床前明月光，疑是地上霜；",false,null);
    }

    @Test
    public void test2(){
        
    }
}
