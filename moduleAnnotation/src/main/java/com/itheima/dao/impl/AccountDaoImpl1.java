package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDaoImpl1 implements AccountDao {

    @Value(value = "张三")
    private String name;

    @Value(value = "29")
    private Integer age;

    public void saveAccount() {

        System.out.println("保存数据成功  1, " + "name: " + this.name+ ", age: " + this.age);
    }
}
