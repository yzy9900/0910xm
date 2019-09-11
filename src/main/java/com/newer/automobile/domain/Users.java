package com.newer.automobile.domain;

import java.io.Serializable;

public class Users {
    private int uid;
    private String uname;
    private String uemail;
    private String upwd;
    private String uphone;
    private int by1;
    private String by2;

    public Users() {
    }

    public Users(int uid, String uname, String uemail, String upwd, String uphone, int by1, String by2) {
        this.uid = uid;
        this.uname = uname;
        this.uemail = uemail;
        this.upwd = upwd;
        this.uphone = uphone;
        this.by1 = by1;
        this.by2 = by2;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public int getBy1() {
        return by1;
    }

    public void setBy1(int by1) {
        this.by1 = by1;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }
}
