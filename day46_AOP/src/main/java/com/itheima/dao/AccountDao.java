package com.itheima.dao;

import com.itheima.bean.Account;

import java.util.List;

public interface AccountDao {
    void save( ) throws Exception;

    void update(Account account) throws Exception;

    void delete( ) throws Exception;

    Account findById(Integer id) throws Exception;

    List<Account> findAll() throws Exception;

    void add(String to,Double money);

    void reduce(String from,Double money);
}
