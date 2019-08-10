package com.guo.mapper;

import com.guo.entity.BlogUser;
import com.guo.entity.BlogUserExample;
import com.guo.entity.BlogUserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogUserMapper {
    int countByExample(BlogUserExample example);

    int deleteByExample(BlogUserExample example);

    int deleteByPrimaryKey(String bloguserId);

    int insert(BlogUserWithBLOBs record);

    int insertSelective(BlogUserWithBLOBs record);

    List<BlogUserWithBLOBs> selectByExampleWithBLOBs(BlogUserExample example);

    List<BlogUser> selectByExample(BlogUserExample example);

    BlogUserWithBLOBs selectByPrimaryKey(String bloguserId);

    int updateByExampleSelective(@Param("record") BlogUserWithBLOBs record, @Param("example") BlogUserExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogUserWithBLOBs record, @Param("example") BlogUserExample example);

    int updateByExample(@Param("record") BlogUser record, @Param("example") BlogUserExample example);

    int updateByPrimaryKeySelective(BlogUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogUserWithBLOBs record);

    int updateByPrimaryKey(BlogUser record);
}