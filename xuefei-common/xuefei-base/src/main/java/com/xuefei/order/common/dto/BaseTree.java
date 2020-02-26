package com.xuefei.order.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName BaseTree
 * @Description TODO
 * @Author snowflying
 * @Date 2020/2/26 23:17
 * @Version 1.0
 **/
@Data
public class BaseTree<E, ID> implements Serializable {
    private static final long serialVersionUID = -5703964834600572016L;

    /**
     * ID
     */
    private ID id;

    /**
     * 父ID
     */
    private ID pid;

    /**
     * 是否含有子节点
     */
    private boolean hasChild = false;

    /**
     * 子节点集合
     */
    private List<E> children;

}