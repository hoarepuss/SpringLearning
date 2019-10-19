package com.itheima.jdbctemplate;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.lang.reflect.AccessibleObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao accountDao = (IAccountDao)ac.getBean("accountDao");
        //jt.update("insert into account(name, money) values ('zzz', 1000)");
        //jt.update("insert into account(name, money) values (?, ?)", "eee", 1000);
        //jt.update("update account set name = ?, money = ? where id = ?", "fff", 2000, 6);
        //jt.update("delete from account where id = ?", 7);
        /*List<Account> accounts = jt.query("select * from account where money > ?", new BeanPropertyRowMapper<Account>(Account.class), 0);
        for (Account account:accounts){
            System.out.println(account);
        }*/
        //Long l = jt.queryForObject("select count(*) from account where money <= ?", Long.class, 1000);
        Account account = new Account();
        account.setId(6);
        account.setName("ggg");
        account.setMoney(500f);
        accountDao.updateAccount(account);
    }
}
