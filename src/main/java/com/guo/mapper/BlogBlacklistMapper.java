package com.guo.mapper;

import com.guo.entity.BlogBlacklist;
import com.guo.entity.BlogBlacklistExample;
import com.guo.entity.BlogBlacklistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogBlacklistMapper {
    int countByExample(BlogBlacklistExample example);

    int deleteByExample(BlogBlacklistExample example);

    int deleteByPrimaryKey(String blacklistId);

    int insert(BlogBlacklistWithBLOBs record);

    int insertSelective(BlogBlacklistWithBLOBs record);

    List<BlogBlacklistWithBLOBs> selectByExampleWithBLOBs(BlogBlacklistExample example);

    List<BlogBlacklist> selectByExample(BlogBlacklistExample example);

    BlogBlacklistWithBLOBs selectByPrimaryKey(String blacklistId);

    int updateByExampleSelective(@Param("record") BlogBlacklistWithBLOBs record, @Param("example") BlogBlacklistExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogBlacklistWithBLOBs record, @Param("example") BlogBlacklistExample example);

    int updateByExample(@Param("record") BlogBlacklist record, @Param("example") BlogBlacklistExample example);

    int updateByPrimaryKeySelective(BlogBlacklistWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogBlacklistWithBLOBs record);

    int updateByPrimaryKey(BlogBlacklist record);
}