package com.itheima;

import com.itheima.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//配置测试类注解
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest01 {

    @Autowired()//注册成Bean
   private AccountDao accountDao;

    @Test
    public void testBefore() throws Exception {
        accountDao.save();
    }


    @Test
    public void testAfterReturning() throws Exception {
        accountDao.delete();

    }
}