package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdBrand;

public interface WdBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdBrand record);

    int insertSelective(WdBrand record);

    WdBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdBrand record);

    int updateByPrimaryKey(WdBrand record);
}