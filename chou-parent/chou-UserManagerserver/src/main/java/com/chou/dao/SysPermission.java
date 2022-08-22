package com.chou.dao;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName sys_permission
 */
@Data
public class SysPermission implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String permission;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}