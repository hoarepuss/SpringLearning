package com.itheima.service.factory;

import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;
import jdk.internal.dynalink.beans.StaticClass;

public class StaticBeanFactory {
    public static AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
