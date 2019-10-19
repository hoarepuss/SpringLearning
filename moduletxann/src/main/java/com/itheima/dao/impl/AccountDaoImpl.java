package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sun.awt.SunHints;

import javax.annotation.Resource;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Resource(name = "jt")
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public void updateAccountMoneyByName(String name, float money) {
        jdbcTemplate.update("update account set money = ? where name = ?", money, name);
    }
}
