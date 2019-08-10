package com.guo.entity;

import java.util.List;

public class BlogBlogWithBLOBs extends BlogBlog {
    private String blogDate;

    private String blogContent;

    private String blogtype;

    private List<BlogFileWithBLOBs> fileList;

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate == null ? null : blogDate.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getBlogtype() {
        return blogtype;
    }

    public void setBlogtype(String blogtype) {
        this.blogtype = blogtype == null ? null : blogtype.trim();
    }

    public List<BlogFileWithBLOBs> getFileList() {
        return fileList;
    }

    public void setFileList(List<BlogFileWithBLOBs> fileList) {
        this.fileList = fileList;
    }
}