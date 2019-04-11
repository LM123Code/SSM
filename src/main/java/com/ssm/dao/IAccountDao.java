package com.ssm.dao;

import com.ssm.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 * @author LM_Code
 * @create 2019-04-10-17:17
 */
@Repository
public interface IAccountDao {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public int saveAccount(Account account);
}
