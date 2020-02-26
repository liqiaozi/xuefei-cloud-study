package com.xuefei.order;

import com.xuefei.order.common.base.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 23:32
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/submitOrder")
    public ResultResponse<Integer> submitOrder(@RequestParam("goodId") Integer goodId,
                                               @RequestParam("accountId") Integer accountId,
                                               @RequestParam("buyCount") Integer buyCount) {

        Integer orderId = orderService.submitOrder(accountId, goodId, buyCount);
        return ResultResponse.ok(orderId);
    }

}
