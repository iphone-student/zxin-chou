package com.chou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chou.dao.Cars;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 10727
* @description 针对表【cars】的数据库操作Service
* @createDate 2022-08-17 17:01:04
*/

public interface CarsService extends IService<Cars> {
    List<Cars> allCar();
}
