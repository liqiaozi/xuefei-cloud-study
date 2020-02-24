package com.xuefei.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/25 0:22
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(value = "/{orderId}")
    public Object queryOrder(@PathVariable Long orderId) {
        Optional<Order> optional = orderRepository.findById(orderId);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
}
