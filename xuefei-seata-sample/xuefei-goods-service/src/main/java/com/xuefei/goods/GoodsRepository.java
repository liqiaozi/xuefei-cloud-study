package com.xuefei.goods;

import com.xuefei.seata.common.entity.Goods;
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
public interface GoodsRepository extends JpaRepository<Goods, Integer> {

}
