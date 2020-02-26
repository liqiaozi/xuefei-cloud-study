package com.xuefei.openfeign;

import com.xuefei.seata.common.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName GoodClient
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/25 23:55
 * @Version 1.0
 **/
@FeignClient(name = "goods-service")
@RequestMapping(value = "/goods")
public interface GoodsClient {

    /**
     * 查询商品基本信息
     *
     * @param goodId
     * @return
     */
    @GetMapping
    Goods findById(@RequestParam("goodId") Integer goodId);

    /**
     * 减少商品的库存
     *
     * @param goodId
     * @param stock
     */
    @PostMapping
    void reduceStock(@RequestParam("goodId") Integer goodId, @RequestParam("stock") int stock);
}
