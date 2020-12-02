package org.best.service;

import org.springframework.stereotype.Component;
//相当于<bean class="org.best.service.UserServiceImpl" id=""userService />
@Component("userService")
public class UserServiceImpl implements UserService {
    public void say(){
        System.out.println("你好");
    }
}
