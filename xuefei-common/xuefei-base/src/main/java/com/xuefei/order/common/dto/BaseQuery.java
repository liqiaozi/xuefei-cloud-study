package com.xuefei.order.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BaseQuery
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 23:18
 * @Version 1.0
 **/
@Data
public class BaseQuery implements Serializable {

    private static final long serialVersionUID = 3319698607712846427L;

    /**
     * 当前页
     */
    private Integer pageNum = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    /**
     * 排序
     */
    private String orderBy;

}
