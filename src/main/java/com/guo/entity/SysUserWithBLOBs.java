package com.guo.entity;

public class SysUserWithBLOBs extends SysUser {
    private String userRegisteredDate;

    private String userPermission;

    private String userData;

    public String getUserRegisteredDate() {
        return userRegisteredDate;
    }

    public void setUserRegisteredDate(String userRegisteredDate) {
        this.userRegisteredDate = userRegisteredDate == null ? null : userRegisteredDate.trim();
    }

    public String getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(String userPermission) {
        this.userPermission = userPermission == null ? null : userPermission.trim();
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData == null ? null : userData.trim();
    }
}