package com.ssm.dao;

import com.ssm.domain.Account;
import com.ssm.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-10-20:09
 */
public class IAccountDaoTest {
    IAccountDao accountDao = null;
    SqlSession sqlSession = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        accountDao = sqlSession.getMapper(IAccountDao.class);
    }
    @After
    public void after(){
        SqlSessionFactoryUtil.close(sqlSession);
    }
    @Test
    public void testFindAll(){
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
    @Test
    public void testSaveAccount(){
        Account account = new Account();
        account.setName("小凤");
        account.setMoney(300.0);
        int i = accountDao.saveAccount(account);
        Assert.assertEquals(1,i);
    }
}
