package com.xcy.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: xuchenyi
 * @Date: 2020/11/17 21:47
 */
@Mapper
public interface StudentMapper {
    int deleteByDId(String id);
}
