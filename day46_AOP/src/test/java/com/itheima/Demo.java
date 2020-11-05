package com.itheima;

import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4Anno.xml")
public class Demo {

@Autowired
private AccountService accountService;
    @Test
    public  void text(){

        accountService.transform("zs","ls",100.0);

    }
}
