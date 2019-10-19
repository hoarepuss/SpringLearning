package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements IAccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public void updateAccountMoneyByName(String name, float money) {
        jdbcTemplate.update("update account set money = ? where name = ?", money, name);
    }
}
