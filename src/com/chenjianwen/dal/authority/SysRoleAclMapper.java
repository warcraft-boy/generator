package com.chenjianwen.dal.authority;

import com.chenjianwen.api.authority.SysRoleAcl;

public interface SysRoleAclMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleAcl record);

    int insertSelective(SysRoleAcl record);

    SysRoleAcl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleAcl record);

    int updateByPrimaryKey(SysRoleAcl record);
}