package com.ssm.service.impl;

import com.ssm.domain.Account;
import com.ssm.service.IAccountService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * AccountService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 10, 2019</pre>
 */
public class AccountServiceTest {
    IAccountService accountService = null;
    @Before
    public void before() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        accountService = (IAccountService) ac.getBean("accountService");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findAll()
     */
    @Test
    public void testFindAll() throws Exception {
        List<Account> accounts = accountService.findAll();
    }

    /**
     * Method: saveAccount(Account account)
     */
    @Test
    public void testSaveAccount() throws Exception {
    }
}
