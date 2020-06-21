package com.itjj.service.impl;

import com.itjj.dao.AccountDao;
import com.itjj.domain.Account;
import com.itjj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户业务层实现类
 * @auther zjj
 * @create 2020-06-21-9:07
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("Service层，查询所有账户...");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("Service层，保存账户...");
        accountDao.saveAccount(account);
}
}
