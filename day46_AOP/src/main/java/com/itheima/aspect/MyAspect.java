package com.itheima.aspect;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//表明是一个切面类,切入点和通知的结合,就是实际增强的方法和逻辑
@Aspect
public class MyAspect {
    //配置前置,切入点

    @Before("execution(* com.itheima.dao.impl.AccountDaoImpl.save())")
    //参数 第一个表示返回值任意  第二个切入点的方法  ..表示任意参数
    public void checkPrivilege(){
        System.out.println("MyAspect#checkPrivilege-权限校验");
    }

    //配置后置切入点
    @AfterReturning("execution(* com.itheima.dao.impl.AccountDaoImpl.delete())")
    public void showLog(){
        System.out.println("MyAspect#showLog-删除日志");
    }


}
