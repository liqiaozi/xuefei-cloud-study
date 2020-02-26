package com.xuefei.seata.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Account
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 0:09
 * @Version 1.0
 **/
@Data
@Table(name = "seata_account")
public class Account implements Serializable {

    private static final long serialVersionUID = -8575587974362140798L;

    @Id
    @Column(name = "a_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "a_money")
    private Double money;

    @Column(name = "a_create_time")
    private Date createTime;

    @Column(name = "a_mark")
    private String mark;
}
