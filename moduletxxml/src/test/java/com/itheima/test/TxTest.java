package com.itheima.test;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {

    @Test
    public void txTest1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = (IAccountService)ac.getBean("accountService");
        accountService.transfer("aaa", "bbb", 4000f);
    }
}
