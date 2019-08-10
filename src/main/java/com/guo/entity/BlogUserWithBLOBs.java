package com.guo.entity;

public class BlogUserWithBLOBs extends BlogUser {
    private String bloguserDate;

    private String bloguserAddress;

    private String bloguserData;

    public String getBloguserDate() {
        return bloguserDate;
    }

    public void setBloguserDate(String bloguserDate) {
        this.bloguserDate = bloguserDate == null ? null : bloguserDate.trim();
    }

    public String getBloguserAddress() {
        return bloguserAddress;
    }

    public void setBloguserAddress(String bloguserAddress) {
        this.bloguserAddress = bloguserAddress == null ? null : bloguserAddress.trim();
    }

    public String getBloguserData() {
        return bloguserData;
    }

    public void setBloguserData(String bloguserData) {
        this.bloguserData = bloguserData == null ? null : bloguserData.trim();
    }
}