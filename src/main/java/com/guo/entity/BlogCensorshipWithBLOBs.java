package com.guo.entity;

public class BlogCensorshipWithBLOBs extends BlogCensorship {
    private String censorshipDate;

    private String censorshipResult;

    public String getCensorshipDate() {
        return censorshipDate;
    }

    public void setCensorshipDate(String censorshipDate) {
        this.censorshipDate = censorshipDate == null ? null : censorshipDate.trim();
    }

    public String getCensorshipResult() {
        return censorshipResult;
    }

    public void setCensorshipResult(String censorshipResult) {
        this.censorshipResult = censorshipResult == null ? null : censorshipResult.trim();
    }
}