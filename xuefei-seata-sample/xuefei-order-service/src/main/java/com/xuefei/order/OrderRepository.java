package com.xuefei.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName OrderRepository
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/25 0:21
 * @Version 1.0
 **/
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
