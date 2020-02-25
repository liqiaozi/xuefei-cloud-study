package com.xuefei.order;

import com.xuefei.order.seata.common.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName OrderRepository
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 0:24
 * @Version 1.0
 **/
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
