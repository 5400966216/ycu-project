package com.huike.ycu.mybatis.mapper;

import com.huike.ycu.mybatis.model.UmsAdmin;

public interface UmsAdminDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    UmsAdmin selectByUsernameAndPassword(UmsAdmin umsAdmin);

    UmsAdmin selectByUsername(UmsAdmin umsAdmin);
}