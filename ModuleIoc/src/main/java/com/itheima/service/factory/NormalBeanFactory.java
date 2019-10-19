package com.itheima.service.factory;

import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;

public class NormalBeanFactory {
    public AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
