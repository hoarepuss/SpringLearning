package com.itheima.service.impl;

import com.itheima.service.AccountService;

import java.util.Date;

public class AccountServiceImpl2 implements AccountService {

    private  String name;
    private Integer age;
    private Date date;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void saveAccount() {

        System.out.println("service中的saveAccount方法执行了. name" + this.name + ", age"
                + this.age + ", date" + this.date);
    }
}
