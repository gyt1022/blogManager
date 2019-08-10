package com.guo.entity;

public class BlogBlacklistWithBLOBs extends BlogBlacklist {
    private String blacklistDate;

    private String blacklistCause;

    public String getBlacklistDate() {
        return blacklistDate;
    }

    public void setBlacklistDate(String blacklistDate) {
        this.blacklistDate = blacklistDate == null ? null : blacklistDate.trim();
    }

    public String getBlacklistCause() {
        return blacklistCause;
    }

    public void setBlacklistCause(String blacklistCause) {
        this.blacklistCause = blacklistCause == null ? null : blacklistCause.trim();
    }
}