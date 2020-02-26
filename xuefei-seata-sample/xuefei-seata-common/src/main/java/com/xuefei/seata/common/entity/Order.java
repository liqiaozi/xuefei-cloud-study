package com.xuefei.seata.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName Order
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 0:11
 * @Version 1.0
 **/
@Data
@Table(name = "seata_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1462873460372044559L;

    @Id
    @Column(name = "o_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "o_good_id")
    private Integer goodId;

    @Column(name = "o_account_id")
    private Integer accountId;

    @Column(name = "o_price")
    private Double price;
}
