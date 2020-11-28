package com.xcy.mapper;

import com.xcy.dto.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: xuchenyi
 * @Date: 2020/11/15 22:25
 */

@Mapper
public interface DeptMapper {
    List<Dept> list();

    int deleteById(String id);

    int insert(Dept dept);
}
