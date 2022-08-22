package com.chou.dao;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName coordinate_depth
 */
@Data
public class CoordinateDepth implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * x坐标
     */
    private Double x;

    /**
     * y坐标
     */
    private Double y;

    /**
     * z坐标
     */
    private Double z;

    private static final long serialVersionUID = 1L;
}