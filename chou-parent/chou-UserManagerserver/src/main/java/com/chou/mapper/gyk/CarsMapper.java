package com.chou.mapper.gyk;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chou.dao.gyk.Cars;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
* @author 10727
* @description 针对表【cars】的数据库操作Mapper
* @createDate 2022-08-17 17:01:04
* @Entity com.chou.dao.gyk.Cars
*/
@Mapper
public interface CarsMapper extends BaseMapper<Cars> {

    List<Cars> allCar();
}
