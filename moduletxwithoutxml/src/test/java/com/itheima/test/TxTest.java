package com.itheima.test;

import com.itheima.service.IAccountService;
import config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxTest {

    @Test
    public void txTest1() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        IAccountService accountService = (IAccountService)ac.getBean("accountService");
        accountService.transfer("aaa", "bbb", 4000f);
    }
}
