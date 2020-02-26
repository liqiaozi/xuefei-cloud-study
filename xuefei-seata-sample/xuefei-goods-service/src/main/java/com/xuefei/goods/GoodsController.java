package com.xuefei.goods;

import com.xuefei.openfeign.GoodsClient;
import com.xuefei.seata.common.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodsController
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 23:53
 * @Version 1.0
 **/
@RestController
public class GoodsController implements GoodsClient {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查询商品信息
     *
     * @param goodId
     * @return
     */
    @Override
    public Goods findById(Integer goodId) {
        return goodsService.findById(goodId);
    }

    /**
     * 扣减商品库存
     *
     * @param goodId
     * @param stock
     */
    @Override
    public void reduceStock(Integer goodId, int stock) {
        goodsService.reduceStock(goodId, stock);
    }
}
