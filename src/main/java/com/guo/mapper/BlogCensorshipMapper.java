package com.guo.mapper;

import com.guo.entity.BlogCensorship;
import com.guo.entity.BlogCensorshipExample;
import com.guo.entity.BlogCensorshipWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogCensorshipMapper {
    int countByExample(BlogCensorshipExample example);

    int deleteByExample(BlogCensorshipExample example);

    int deleteByPrimaryKey(String censorshipId);

    int insert(BlogCensorshipWithBLOBs record);

    int insertSelective(BlogCensorshipWithBLOBs record);

    List<BlogCensorshipWithBLOBs> selectByExampleWithBLOBs(BlogCensorshipExample example);

    List<BlogCensorship> selectByExample(BlogCensorshipExample example);

    BlogCensorshipWithBLOBs selectByPrimaryKey(String censorshipId);

    int updateByExampleSelective(@Param("record") BlogCensorshipWithBLOBs record, @Param("example") BlogCensorshipExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogCensorshipWithBLOBs record, @Param("example") BlogCensorshipExample example);

    int updateByExample(@Param("record") BlogCensorship record, @Param("example") BlogCensorshipExample example);

    int updateByPrimaryKeySelective(BlogCensorshipWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogCensorshipWithBLOBs record);

    int updateByPrimaryKey(BlogCensorship record);
}