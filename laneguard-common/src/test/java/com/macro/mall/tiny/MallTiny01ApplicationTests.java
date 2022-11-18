package com.macro.mall.tiny;

import com.macro.mall.tiny.modules.pms.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class MallTiny01ApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        PmsBrandService pmsBrandService = (PmsBrandService)applicationContext.getBean("pmsBrandService");
        pmsBrandService.println();
    }

}
