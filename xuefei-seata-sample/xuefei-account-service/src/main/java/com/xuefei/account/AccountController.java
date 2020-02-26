package com.xuefei.account;

import com.xuefei.openfeign.AccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/27 0:13
 * @Version 1.0
 **/
@RestController
public class AccountController implements AccountClient {

    @Autowired
    private AccountService accountService;

    @Override
    public void deduction(Integer accountId, Double money) {
        accountService.deduction(accountId, money);
    }
}
