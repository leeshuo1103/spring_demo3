package org.best.test;

import org.best.Account;
import org.best.service.AccountServiceImpl;
import org.best.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void Test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        userService.say();
    }
    @org.junit.Test
    public void Test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl accountService = context.getBean("accountService", AccountServiceImpl.class);
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }

    }
}
