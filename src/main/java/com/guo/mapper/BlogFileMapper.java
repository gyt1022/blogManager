package com.guo.mapper;

import com.guo.entity.BlogFile;
import com.guo.entity.BlogFileExample;
import com.guo.entity.BlogFileWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogFileMapper {
    int countByExample(BlogFileExample example);

    int deleteByExample(BlogFileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(BlogFileWithBLOBs record);

    int insertSelective(BlogFileWithBLOBs record);

    List<BlogFileWithBLOBs> selectByExampleWithBLOBs(BlogFileExample example);

    List<BlogFile> selectByExample(BlogFileExample example);

    BlogFileWithBLOBs selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") BlogFileWithBLOBs record, @Param("example") BlogFileExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogFileWithBLOBs record, @Param("example") BlogFileExample example);

    int updateByExample(@Param("record") BlogFile record, @Param("example") BlogFileExample example);

    int updateByPrimaryKeySelective(BlogFileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogFileWithBLOBs record);

    int updateByPrimaryKey(BlogFile record);
}