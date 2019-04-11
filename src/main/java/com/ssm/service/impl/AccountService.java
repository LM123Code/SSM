package com.ssm.service.impl;

import com.ssm.dao.IAccountDao;
import com.ssm.domain.Account;
import com.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-10-17:22
 */
@Service("accountService")
public class AccountService implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存用户。。。");
        accountDao.saveAccount(account);
    }
}
