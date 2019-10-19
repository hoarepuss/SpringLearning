package com.itheima.service.impl;

import com.itheima.service.IAccountService;
import org.springframework.stereotype.Service;

@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("a");
    }

    public void updateAccount(Integer i) {
        System.out.println("执行了更新");
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
