package com.xuefei.account;

import com.xuefei.seata.common.entity.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/27 0:07
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountService {
    private static final Logger logger = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    private AccountRepository accountRepository;

    /**
     * 扣除账户余额
     * @param accountId
     * @param money
     */
    public void deduction(Integer accountId, Double money) {
        Optional<Account> optional = accountRepository.findById(accountId);
        if (!optional.isPresent()) {
            throw new RuntimeException("账户：" + accountId + "，不存在.");
        }
        Account account = optional.get();
        if (account.getMoney() - money < 0) {
            throw new RuntimeException("账户：" + accountId + "，余额不足.");
        }
        account.setMoney(account.getMoney().doubleValue() - money);
        accountRepository.save(account);
    }
}
