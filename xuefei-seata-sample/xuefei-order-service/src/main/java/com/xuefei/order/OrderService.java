package com.xuefei.order;

import com.xuefei.openfeign.AccountClient;
import com.xuefei.openfeign.GoodsClient;
import com.xuefei.seata.common.entity.Goods;
import com.xuefei.seata.common.entity.Order;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 22:58
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private GoodsClient goodsClient;

    @Autowired
    private AccountClient accountClient;

    @GlobalTransactional
    public Integer submitOrder(Integer accountId, Integer goodId, Integer buyCount) {

        // 调用产品服务
        Goods goods = goodsClient.findById(goodId);
        double orderPrice = buyCount * goods.getPrice();
        goodsClient.reduceStock(goodId, buyCount);

        // 调用账户服务
        accountClient.deduction(accountId, orderPrice);

        // 新建订单
        Order order = toOrder(goodId, accountId, orderPrice);
        orderRepository.save(order);

        return order.getId();
    }

    private Order toOrder(Integer goodId, Integer accountId, Double orderPrice) {
        Order order = new Order();
        order.setGoodId(goodId);
        order.setAccountId(accountId);
        order.setPrice(orderPrice);
        return order;
    }
}
