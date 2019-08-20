package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.SysAclModule;

public interface SysAclModuleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysAclModule record);

    int insertSelective(SysAclModule record);

    SysAclModule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysAclModule record);

    int updateByPrimaryKey(SysAclModule record);
}