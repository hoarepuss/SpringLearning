package com.itheima.test;

import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTestUse {
    @Test
    public void beforeAdvice(){
        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取Bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        as.saveAccount();
    }
}
