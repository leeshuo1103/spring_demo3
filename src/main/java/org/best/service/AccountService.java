package org.best.service;

import org.best.Account;

import java.util.List;

public interface AccountService {
    //查询所有用户
      List<Account> findAll();
}
