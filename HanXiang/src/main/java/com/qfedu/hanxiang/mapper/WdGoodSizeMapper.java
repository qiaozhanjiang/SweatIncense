package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdGoodSize;

public interface WdGoodSizeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdGoodSize record);

    int insertSelective(WdGoodSize record);

    WdGoodSize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdGoodSize record);

    int updateByPrimaryKey(WdGoodSize record);
}