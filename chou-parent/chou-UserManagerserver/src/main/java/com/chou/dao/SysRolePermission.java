package com.chou.dao;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sys_role_permission
 */
@Data
public class SysRolePermission implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Integer roleId;

    /**
     * 
     */
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}