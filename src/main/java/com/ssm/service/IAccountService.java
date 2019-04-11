package com.ssm.service;

import com.ssm.domain.Account;
import java.util.List;

/**
 * 账户service接口
 * @author LM_Code
 * @create 2019-04-10-17:20
 */
public interface IAccountService {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}
