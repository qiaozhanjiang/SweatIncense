package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdGoodType;

public interface WdGoodTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdGoodType record);

    int insertSelective(WdGoodType record);

    WdGoodType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdGoodType record);

    int updateByPrimaryKey(WdGoodType record);
}