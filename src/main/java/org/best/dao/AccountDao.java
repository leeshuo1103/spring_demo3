package org.best.dao;

import org.best.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
}
