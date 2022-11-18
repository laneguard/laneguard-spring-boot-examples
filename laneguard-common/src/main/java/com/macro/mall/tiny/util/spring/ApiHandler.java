package com.macro.mall.tiny.util.spring;

import org.springframework.stereotype.Service;

public interface ApiHandler {
    boolean execute();
}

@Service
class SimpleService implements ApiHandler{

    @Override
    public boolean execute() {
        System.out.println("我执行了...");
        return false;
    }
}

class SimpleApp{
    public boolean test(String beanName){
        Object bean =  SpringBeanUtil.getBean(beanName);
        if (bean instanceof ApiHandler){
            //以顶层接口的形式直接强转
            ApiHandler serviceBean = (ApiHandler) bean;
            //通过顶层接口的方法执行服务获取结果
            boolean result = serviceBean.execute();
            return result;
        }else{
            //没有对应服务抛出异常
            throw new RuntimeException("不支持的服务名");
        }
    }
}
