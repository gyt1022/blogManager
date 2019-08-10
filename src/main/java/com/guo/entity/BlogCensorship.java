package com.guo.entity;

public class BlogCensorship {
    private String censorshipId;

    private String blogId;

    private String userId;

    private String bloguserId;

    public String getCensorshipId() {
        return censorshipId;
    }

    public void setCensorshipId(String censorshipId) {
        this.censorshipId = censorshipId == null ? null : censorshipId.trim();
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getBloguserId() {
        return bloguserId;
    }

    public void setBloguserId(String bloguserId) {
        this.bloguserId = bloguserId == null ? null : bloguserId.trim();
    }
}