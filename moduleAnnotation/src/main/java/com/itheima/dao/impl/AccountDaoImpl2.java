package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao {
    public void saveAccount() {
        System.out.println("保存数据成功  2");
    }
}
