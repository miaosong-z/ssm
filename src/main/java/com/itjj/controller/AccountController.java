package com.itjj.controller;

import com.itjj.domain.Account;
import com.itjj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户控制层
 * @auther zjj
 * @create 2020-06-21-9:09
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("web层：查询所有的账户信息...");
        //调用service层方法，调用成功说明整合成功了
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "list";
    }


    @RequestMapping("/saveAccount")
    public String saveAccount(Account account, HttpServletRequest request, HttpServletResponse resqponse) throws IOException {
        System.out.println("web层：保存账户信息...");
        //调用service层方法，调用成功说明整合成功了
        accountService.saveAccount(account);
//        resqponse.sendRedirect(request.getContextPath()+"account/findAll");
        return "saveSuccess";
    }

}
