package com.chou.dao;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName sys_menu
 */
@Data
public class SysMenu implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Integer parentId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String path;

    /**
     * 
     */
    private String css;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 是否菜单 1 是 2 不是
     */
    private Integer isMenu;

    /**
     * 是否隐藏,0 false 1 true
     */
    private Integer hidden;

    private static final long serialVersionUID = 1L;
}