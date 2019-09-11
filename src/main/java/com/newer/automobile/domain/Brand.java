package com.newer.automobile.domain;

public class Brand {
    private int bid;
    private String bname;
    private int by1;
    private String by2;

    public Brand() {
    }

    public Brand(int bid, String bname, int by1, String by2) {
        this.bid = bid;
        this.bname = bname;
        this.by1 = by1;
        this.by2 = by2;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
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
