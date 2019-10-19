package com.itheima.service.impl;

import com.itheima.service.AccountService;
import sun.awt.image.IntegerComponentRaster;

import java.util.Date;

public class AccountServiceImpl implements AccountService {

    private  String name;
    private Integer age;
    private Date date;

    public AccountServiceImpl(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public void saveAccount() {

        System.out.println("service中的saveAccount方法执行了. name" + this.name + ", age"
                + this.age + ", date" + this.date);
    }
}
