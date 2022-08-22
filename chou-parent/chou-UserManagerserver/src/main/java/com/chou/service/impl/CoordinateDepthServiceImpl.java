package com.chou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chou.dao.CoordinateDepth;
import com.chou.service.CoordinateDepthService;
import com.chou.mapper.CoordinateDepthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 10727
* @description 针对表【coordinate_depth】的数据库操作Service实现
* @createDate 2022-08-18 16:48:56
*/
@Service
public class CoordinateDepthServiceImpl extends ServiceImpl<CoordinateDepthMapper, CoordinateDepth>
implements CoordinateDepthService{

    @Autowired
    private CoordinateDepthMapper coordinateDepthMapper;
    @Override
    public int txt2DB(double x, double y, double z){
     return coordinateDepthMapper.txt2DB(x,y,z);
    }
}
