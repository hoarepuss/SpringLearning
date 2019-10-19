package com.itheima.service.impl;

import com.itheima.service.IAccountService;
import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;

public class AccountServiceImpl implements IAccountService {

    private  IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String sourceName, String targetName, float money) {

        float sourceMoney = 5000f;
        float targetMoney = 6000f;
        sourceMoney = sourceMoney - money;
        targetMoney = targetMoney + money;

        accountDao.updateAccountMoneyByName(sourceName, sourceMoney);
        accountDao.updateAccountMoneyByName(targetName, targetMoney);
        System.out.println(1/0);
    }
}
