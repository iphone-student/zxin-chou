package com.chou.Controller;



import com.chou.config.ResultsPage;
import com.chou.dao.zb.SysUser;

import com.chou.service.impl.zb.SysUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户管理 API")
public class UserController {


    @Autowired
    private SysUserServiceImpl sysUserService;


    @GetMapping("/SysUser/allUser")
    @ApiOperation(value = "查询所有user")
    public ResultsPage<List<SysUser>> allUser(){
        List<SysUser> user = sysUserService.allUser();
        return ResultsPage.succeed(user,"查询成功");
    }
    @GetMapping("/SysUser/addUser")
    @ApiOperation(value = "添加user")
    public ResultsPage addUser(SysUser sysUser){
        int i = sysUserService.insertAll(sysUser);
        return i > 0 ? ResultsPage.succeed("添加成功！") : ResultsPage.Error("添加失败！");
    }
    @GetMapping("/SysUser/updateUser")
    @ApiOperation(value = "添加user")
    public ResultsPage updateUser(SysUser sysUser){
        int i = sysUserService.updateAll(sysUser);
        return i > 0 ? ResultsPage.succeed("修改成功！") : ResultsPage.Error("修改失败！");
    }



}
