package com.guo.mapper;

import com.guo.entity.SysUser;
import com.guo.entity.SysUserExample;
import com.guo.entity.SysUserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(SysUserWithBLOBs record);

    int insertSelective(SysUserWithBLOBs record);

    List<SysUserWithBLOBs> selectByExampleWithBLOBs(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    SysUserWithBLOBs selectByPrimaryKey(String userId);

    List<SysUserWithBLOBs> selectByPermission(@Param("permission") String permission);

    int updateByExampleSelective(@Param("record") SysUserWithBLOBs record, @Param("example") SysUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SysUserWithBLOBs record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysUserWithBLOBs record);

    int updateByPrimaryKey(SysUser record);
}