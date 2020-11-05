package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Transactional// 类上面加表示类的所有方法都纳入事务管理
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    // 表示当前方法纳入事务管理
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void transform(String from, String to, Double money) {
        accountDao.reduce(from, money);
        //int i = 1/0;
        accountDao.add(to, money);
    }
}
