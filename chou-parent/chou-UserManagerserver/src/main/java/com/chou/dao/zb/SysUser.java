package com.chou.dao.zb;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName sys_user
 */
@Data
@TableName(value ="sys_user")
public class SysUser implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String nickName;

    /**
     * 
     */
    private String headImgUrl;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private Integer sex;

    /**
     * 
     */
    private Integer enabled;

    /**
     * 
     */
    private String type;

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