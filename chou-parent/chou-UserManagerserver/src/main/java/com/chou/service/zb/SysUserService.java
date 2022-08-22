package com.chou.service.zb;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chou.dao.zb.SysUser;

import java.util.List;

/**
* @author 10727
* @description 针对表【sys_user】的数据库操作Service
* @createDate 2022-08-18 08:32:37
*/
public interface SysUserService extends IService<SysUser> {
    List<SysUser> allUser();
    int insertAll(SysUser sysUser);
    int updateAll(SysUser sysUser);

}
