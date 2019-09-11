package com.newer.automobile.domain;

import java.util.Date;

public class Maintain {
    private int mid;
    private String ucar;
    private String phone;
    private String email;
    private String Service;
    private Date time;
    private int by1;
    private String by2;

    public Maintain() {
    }

    public Maintain(int mid, String ucar, String phone, String email, String service, Date time, int by1, String by2) {
        this.mid = mid;
        this.ucar = ucar;
        this.phone = phone;
        this.email = email;
        Service = service;
        this.time = time;
        this.by1 = by1;
        this.by2 = by2;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getUcar() {
        return ucar;
    }

    public void setUcar(String ucar) {
        this.ucar = ucar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
