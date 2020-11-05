package com.itheima.dao.impl;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save() throws Exception {

        System.out.println("增强了哦");
    }

    public void update(Account account) throws Exception {

    }

    @Override
    public void delete() throws Exception {
        System.out.println("后置增强哦");
    }


    public Account findById(Integer id) throws Exception {
        return null;
    }

    public List<Account> findAll() throws Exception {
        return null;
    }

    @Override
    public void add(String to, Double money) {
       jdbcTemplate.update("update  account set money=money+? where name=?",money,to);
    }

    @Override
    public void reduce(String from, Double money) {

        jdbcTemplate.update("update  account set money=money-? where name=?",money,from);
    }
}
