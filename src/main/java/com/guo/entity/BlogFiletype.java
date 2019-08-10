package com.guo.entity;

public class BlogFiletype {
    private String filetypeId;

    private String filetypeValue;

    public String getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(String filetypeId) {
        this.filetypeId = filetypeId == null ? null : filetypeId.trim();
    }

    public String getFiletypeValue() {
        return filetypeValue;
    }

    public void setFiletypeValue(String filetypeValue) {
        this.filetypeValue = filetypeValue == null ? null : filetypeValue.trim();
    }
}