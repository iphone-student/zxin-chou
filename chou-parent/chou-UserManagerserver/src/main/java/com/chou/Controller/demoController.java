package com.chou.Controller;


import com.chou.dao.CoordinateDepth;
import com.chou.dao.gyk.Cars;
import com.chou.dao.zb.SysUser;
import com.chou.service.impl.gyk.CarsServiceImpl;
import com.chou.service.impl.zb.SysUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "多数据源测试样本 API")
public class demoController {

    @Autowired
    private CarsServiceImpl carsService;
    @Autowired
    private SysUserServiceImpl sysUserService;




    @GetMapping("/Cars/allCar")
    @ApiOperation(value = "gyk数据库查询所有cars")
    public List<Cars> allCar(){
       List<Cars> car = carsService.allCar();
       return car;
    }
    @GetMapping("/SysUser/alluser")
    @ApiOperation(value = "zb数据库查询所有user")
    public List<SysUser> allUser(){
        List<SysUser> user = sysUserService.allUser();
        return user;
    }



}
