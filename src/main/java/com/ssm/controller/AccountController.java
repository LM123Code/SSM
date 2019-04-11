package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.util.List;

/**
 * Account web
 * @author LM_Code
 * @create 2019-04-10-17:25
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService = null;

    /**
     * 查询所有
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层findAll执行了......");
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "list";
    }
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("表现层saveAccount执行了。。。");
        accountService.saveAccount(account);
//        request.getRequestDispatcher("/account/findAll").forward(request, response);//能够实现，但是提交表单后为避免重复提交，应用重定向
        response.sendRedirect("findAll");
    }
}
