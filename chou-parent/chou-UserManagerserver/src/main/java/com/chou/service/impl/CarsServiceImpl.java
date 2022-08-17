package com.chou.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chou.dao.Cars;
import com.chou.service.CarsService;
import com.chou.mapper.CarsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 10727
* @description 针对表【cars】的数据库操作Service实现
* @createDate 2022-08-17 17:01:04
*/
@Service
public class CarsServiceImpl extends ServiceImpl<CarsMapper, Cars>
implements CarsService{

    @Autowired
    private CarsMapper carsMapper;
    @Override
    public List<Cars> allCar(){
        return carsMapper.allCar();
    }
}