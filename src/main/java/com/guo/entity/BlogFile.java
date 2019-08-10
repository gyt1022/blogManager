package com.guo.entity;

public class BlogFile {
    private String fileId;

    private String filetypeId;

    private String blogId;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(String filetypeId) {
        this.filetypeId = filetypeId == null ? null : filetypeId.trim();
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }
}