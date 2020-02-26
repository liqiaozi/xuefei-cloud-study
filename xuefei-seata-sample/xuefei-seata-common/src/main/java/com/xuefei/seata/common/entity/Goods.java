package com.xuefei.seata.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName Goods
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 0:03
 * @Version 1.0
 **/
@Data
@Table(name = "seata_good")
public class Goods implements Serializable {

    @Id
    @Column(name = "g_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "g_name")
    private String name;

    @Column(name = "g_stock")
    private Integer stock;

    @Column(name = "g_price")
    private Double price;
}
