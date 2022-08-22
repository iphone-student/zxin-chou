package com.chou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chou.dao.CoordinateDepth;

import java.util.List;

/**
* @author 10727
* @description 针对表【coordinate_depth】的数据库操作Service
* @createDate 2022-08-18 16:48:56
*/
public interface CoordinateDepthService extends IService<CoordinateDepth> {

    int txt2DB(double x,double y,double z);
}
