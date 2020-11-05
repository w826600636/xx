package com.itheima.service;

public interface AccountService {

    // 转账
    void transform(String fromPerson, String toPerson, Double money);
}
