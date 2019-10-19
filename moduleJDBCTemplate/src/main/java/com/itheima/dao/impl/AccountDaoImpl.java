package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements IAccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Account findAccountById(Integer accountId) {
        return null;
    }

    public Account findAccountByName(String accountName) {
        return null;
    }

    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name = ?, money = ? where id = ?", account.getName(), account.getMoney(), account.getId());
    }
}
