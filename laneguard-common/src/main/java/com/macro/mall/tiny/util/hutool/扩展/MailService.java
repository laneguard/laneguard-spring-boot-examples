package com.macro.mall.tiny.util.hutool.扩展;

/**
 * @ClassName MailService
 * @Author WB-918966
 * @Date 2022/9/17 11:18
 * @Version 1.0
 **/
public interface MailService {
    void sendSimpleMail(String to, String subject, String content);

    void sendTemplateMail(String to, String subject, String content);
}
