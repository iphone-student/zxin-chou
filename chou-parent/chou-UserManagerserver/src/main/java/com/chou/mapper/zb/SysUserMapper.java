package com.chou.mapper.zb;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chou.dao.zb.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

/**
* @author 10727
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2022-08-18 08:32:37
* @Entity com.chou.dao.zb.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> allUser();
    int insertAll(SysUser sysUser);
    int updateAll(SysUser sysUser);
    SysUser findByUsername(String username);
    int delById(@Param("id") Long id);

}
