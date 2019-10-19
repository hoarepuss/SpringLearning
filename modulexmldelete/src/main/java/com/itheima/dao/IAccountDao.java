package com.itheima.dao;

import com.itheima.Entity.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAllAccount();
    Account findAccountById(Integer accountId);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Integer accountId);
}
