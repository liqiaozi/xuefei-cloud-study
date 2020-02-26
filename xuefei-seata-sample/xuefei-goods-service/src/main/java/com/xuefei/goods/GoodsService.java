package com.xuefei.goods;

import com.xuefei.seata.common.entity.Goods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @ClassName GoodsService
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 23:53
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsService {
    private static final Logger logger = LoggerFactory.getLogger(GoodsService.class);

    @Autowired
    private GoodsRepository goodsRepository;

    /**
     * 查询商品详情
     * @param goodsId 商品id
     * @return
     */
    public Goods findById(Integer goodsId) {
        Optional<Goods> optional = goodsRepository.findById(goodsId);
        return !optional.isPresent() ? null : optional.get();
    }

    /**
     * 扣除商品库存.
     *
     * @param goodId 商品id
     * @param stock  扣除的库存数量
     */
    public void reduceStock(Integer goodId, int stock) {

        Goods goods = this.findById(goodId);
        if (null == goods) {
            throw new RuntimeException("商品：" + goodId + ",不存在.");
        }
        if (goods.getStock() - stock < 0) {
            throw new RuntimeException("商品：" + goodId + "库存不足.");
        }

        goods.setStock(goods.getStock() - stock);
        goodsRepository.save(goods);
    }
}
