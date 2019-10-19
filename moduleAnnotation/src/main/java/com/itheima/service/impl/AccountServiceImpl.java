package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component(value = "accountService")
@Scope(value = "singleton")
public class AccountServiceImpl implements AccountService {

    //@Autowired
    //@Qualifier(value = "accountDao2")

    @Resource(name = "accountDao1")
    private AccountDao accountDao;

    /*@PostConstruct
    public void init(){
        System.out.println("对象初始化了");
    }

    @PreDestroy
    public void destory(){
        System.out.println("对象销毁了");
    }*/

    public void saveAccount() {

        accountDao.saveAccount();
    }
}
