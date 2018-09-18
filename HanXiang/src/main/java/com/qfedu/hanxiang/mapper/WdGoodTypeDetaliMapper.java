package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdGoodTypeDetali;

public interface WdGoodTypeDetaliMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdGoodTypeDetali record);

    int insertSelective(WdGoodTypeDetali record);

    WdGoodTypeDetali selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdGoodTypeDetali record);

    int updateByPrimaryKey(WdGoodTypeDetali record);
}