package com.guo.entity;


public class BlogBlacklist {
    private String blacklistId;

    private String bloguserId;

    private String userId;

    public String getBlacklistId() {
        return blacklistId;
    }

    public void setBlacklistId(String blacklistId) {
        this.blacklistId = blacklistId == null ? null : blacklistId.trim();
    }

    public String getBloguserId() {
        return bloguserId;
    }

    public void setBloguserId(String bloguserId) {
        this.bloguserId = bloguserId == null ? null : bloguserId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}