package com.itheima.service;

import com.itheima.entity.Account;

public interface IAccountService {
    void transfer(String sourceName, String targetName, float money);
}
