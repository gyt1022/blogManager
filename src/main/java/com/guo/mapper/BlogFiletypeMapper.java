package com.guo.mapper;

import com.guo.entity.BlogFiletype;
import com.guo.entity.BlogFiletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogFiletypeMapper {
    int countByExample(BlogFiletypeExample example);

    int deleteByExample(BlogFiletypeExample example);

    int deleteByPrimaryKey(String filetypeId);

    int insert(BlogFiletype record);

    int insertSelective(BlogFiletype record);

    List<BlogFiletype> selectByExampleWithBLOBs(BlogFiletypeExample example);

    List<BlogFiletype> selectByExample(BlogFiletypeExample example);

    BlogFiletype selectByPrimaryKey(String filetypeId);

    int updateByExampleSelective(@Param("record") BlogFiletype record, @Param("example") BlogFiletypeExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogFiletype record, @Param("example") BlogFiletypeExample example);

    int updateByExample(@Param("record") BlogFiletype record, @Param("example") BlogFiletypeExample example);

    int updateByPrimaryKeySelective(BlogFiletype record);

    int updateByPrimaryKeyWithBLOBs(BlogFiletype record);
}