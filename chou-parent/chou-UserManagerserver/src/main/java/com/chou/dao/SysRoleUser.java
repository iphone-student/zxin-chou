package com.chou.dao;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sys_role_user
 */
@Data
public class SysRoleUser implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;
}