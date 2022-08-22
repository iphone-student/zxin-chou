package com.chou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chou.dao.SysMenu;
import com.chou.service.SysMenuService;
import com.chou.mapper.SysMenuMapper;
import org.springframework.stereotype.Service;

/**
* @author 10727
* @description 针对表【sys_menu】的数据库操作Service实现
* @createDate 2022-08-18 14:11:32
*/
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu>
implements SysMenuService{

}
