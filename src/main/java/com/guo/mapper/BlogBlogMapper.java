package com.guo.mapper;

import com.guo.entity.BlogBlog;
import com.guo.entity.BlogBlogExample;
import com.guo.entity.BlogBlogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogBlogMapper {
    int countByExample(BlogBlogExample example);

    int deleteByExample(BlogBlogExample example);

    int deleteByPrimaryKey(String blogId);

    int insert(BlogBlogWithBLOBs record);

    int insertSelective(BlogBlogWithBLOBs record);

    List<BlogBlogWithBLOBs> selectByExampleWithBLOBs(BlogBlogExample example);

    List<BlogBlog> selectByExample(BlogBlogExample example);

    BlogBlogWithBLOBs selectByPrimaryKey(String blogId);

    int updateByExampleSelective(@Param("record") BlogBlogWithBLOBs record, @Param("example") BlogBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogBlogWithBLOBs record, @Param("example") BlogBlogExample example);

    int updateByExample(@Param("record") BlogBlog record, @Param("example") BlogBlogExample example);

    int updateByPrimaryKeySelective(BlogBlogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogBlogWithBLOBs record);

    int updateByPrimaryKey(BlogBlog record);
}