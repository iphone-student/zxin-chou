package com.chou.dao;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName cars
 */
@Data
@TableName(value ="cars")
public class Cars implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Double speed;

    private static final long serialVersionUID = 1L;
}