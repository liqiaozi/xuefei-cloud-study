package com.xuefei.order;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName OrderEntity
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/25 0:15
 * @Version 1.0
 **/
@Entity
@Table(name = "t_order")
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = -1552437560381163863L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 主键ID

    @Column(name = "c_goods_id")
    private String goodsId;

    @Column(name = "i_goods_count")
    private Integer goodsCount;

    @Column(name = "c_account_id")
    private String accountId;

}
