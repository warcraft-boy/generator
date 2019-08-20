package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.SysRoleUser;

public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}