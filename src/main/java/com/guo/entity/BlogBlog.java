package com.guo.entity;

public class BlogBlog {
    private String blogId;

    private String bloguserId;

    private String blogstate;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getBloguserId() {
        return bloguserId;
    }

    public void setBloguserId(String bloguserId) {
        this.bloguserId = bloguserId == null ? null : bloguserId.trim();
    }

    public String getBlogstate() {
        return blogstate;
    }

    public void setBlogstate(String blogstate) {
        this.blogstate = blogstate == null ? null : blogstate.trim();
    }
}