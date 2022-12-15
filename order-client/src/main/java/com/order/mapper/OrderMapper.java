package com.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    List<Map<String,String>> searchOrder(@Param("map") Map<String, Object> params);

    void insertOrder(@Param("map") Map<String,Object> map);
}
