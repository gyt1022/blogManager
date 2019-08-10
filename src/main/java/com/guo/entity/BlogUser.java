package com.guo.entity;

public class BlogUser {
    private String bloguserId;

    private String bloguserName;

    private String bloguserPhone;

    private String bloguserPassword;

    private String bloguserState;

    public String getBloguserId() {
        return bloguserId;
    }

    public void setBloguserId(String bloguserId) {
        this.bloguserId = bloguserId == null ? null : bloguserId.trim();
    }

    public String getBloguserName() {
        return bloguserName;
    }

    public void setBloguserName(String bloguserName) {
        this.bloguserName = bloguserName == null ? null : bloguserName.trim();
    }

    public String getBloguserPhone() {
        return bloguserPhone;
    }

    public void setBloguserPhone(String bloguserPhone) {
        this.bloguserPhone = bloguserPhone == null ? null : bloguserPhone.trim();
    }

    public String getBloguserPassword() {
        return bloguserPassword;
    }

    public void setBloguserPassword(String bloguserPassword) {
        this.bloguserPassword = bloguserPassword == null ? null : bloguserPassword.trim();
    }

    public String getBloguserState() {
        return bloguserState;
    }

    public void setBloguserState(String bloguserState) {
        this.bloguserState = bloguserState == null ? null : bloguserState.trim();
    }
}