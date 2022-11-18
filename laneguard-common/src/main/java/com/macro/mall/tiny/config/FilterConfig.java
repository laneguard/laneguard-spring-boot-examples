package com.macro.mall.tiny.config;

import com.google.common.collect.Lists;
import com.macro.mall.tiny.component.filter.BaseFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @description:
 * @author: 梦想的边缘
 * @create: 2021/08/11 10:39
 */
@Configuration
public class FilterConfig {
    /**
     * 基础过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean<Filter> baseFilter(){
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new BaseFilter());
        filterRegistrationBean.setUrlPatterns(Lists.newArrayList("/*"));
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}

