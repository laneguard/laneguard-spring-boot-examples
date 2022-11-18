package com.macro.mall.tiny.component.filter;


import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.util.List;

public class BaseFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(BaseFilter.class);

    static final String TOKEN = "20220423344556abac";
    
    //内部接口集合
    public static List<String> INSIDE_URLS = Lists.newArrayList("/index","/inside");
    //白名单接口集合
    public static List<String> WHITE_PATH = Lists.newArrayList("/white","/login");


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("初始化数据");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse)servletResponse);
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        if(INSIDE_URLS.contains(requestURI)){
            //内部接口，直接通过
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        if(WHITE_PATH.contains(requestURI)){
            //白名单接口，直接通过
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        //进行校验，如token校验
        String token = request.getHeader("token");
        if(TOKEN.equals(token)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            //token校验不通过，重定向到登录页面
            wrapper.sendRedirect("/login");
        }

    }

    @Override
    public void destroy() {
    }
}

