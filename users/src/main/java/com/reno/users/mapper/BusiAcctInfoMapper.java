package com.reno.users.mapper;

import java.util.List;


import com.reno.users.model.BusiAcctInfo;
import org.apache.ibatis.annotations.Param;



/**
 * dal Interface:BusiAcctInfo
 *
 * @author reno
 */
public interface BusiAcctInfoMapper {

    Integer insert(BusiAcctInfo record);

    Integer insertSelective(BusiAcctInfo record);

    Integer delete(BusiAcctInfo record);

    Integer deleteByPrimaryKey(@Param("acctId") Long acctId);

    Integer updateByPrimaryKey(BusiAcctInfo record);

    Integer update(BusiAcctInfo record);

    List<BusiAcctInfo> findAll();

    List<BusiAcctInfo> find(BusiAcctInfo record);

    Integer getCount(BusiAcctInfo record);

    BusiAcctInfo getByPrimaryKey(@Param("acctId") Long acctId);
}