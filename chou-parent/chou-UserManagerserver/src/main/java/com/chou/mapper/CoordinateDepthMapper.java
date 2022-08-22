package com.chou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chou.dao.CoordinateDepth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 10727
* @description 针对表【coordinate_depth】的数据库操作Mapper
* @createDate 2022-08-18 16:48:56
* @Entity com.chou.dao.CoordinateDepth
*/
@Mapper
public interface CoordinateDepthMapper extends BaseMapper<CoordinateDepth> {

    int txt2DB(@Param("x") double x,@Param("y") double y,@Param("z") double z);
}
