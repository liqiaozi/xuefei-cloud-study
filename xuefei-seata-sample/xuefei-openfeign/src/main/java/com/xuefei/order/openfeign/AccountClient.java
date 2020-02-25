package com.xuefei.order.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName AccountClient
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/25 23:54
 * @Version 1.0
 **/
@FeignClient(name = "account-service")
@RequestMapping(value = "/account")
public interface AccountClient {

    /**
     * 扣除指定账户金额
     *
     * @param accountId 账户编号
     * @param money     金额
     */
    @PostMapping
    void deduction(@RequestParam("accountId") Integer accountId, @RequestParam("money") Double money);
}
