package com.chou.Controller;


import com.chou.dao.Cars;
import com.chou.service.impl.CarsServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "样本 API")
public class demoController {

    @Autowired
    private CarsServiceImpl carsService;

    @GetMapping("/Cars/allCar")
    @ApiOperation(value = "后台管理查询所有角色（带分页功能）")
    public List<Cars> allCar(){
       List<Cars> car = carsService.allCar();
       return car;
    }
}
