package com.itheima.dao;

import com.itheima.entity.Account;

public interface IAccountDao {
    void updateAccountMoneyByName(String name, float money);
}
