package com.newer.automobile.domain;

import java.util.Date;

public class Car {
    private int cid;
    private String cname;
    private String cimg;
    private String ctype;
    private Double cprice;
    private String discount;
    private Date ctime;
    private String crank;
    private Double speed;
    private Double pailiang;
    private String transmission;
    private String fueltype;
    private String fuelEconomy;
    private int bid;
    private int by1;
    private String by2;

    public Car() {
    }

    public Car(int cid, String cname, String cimg, String ctype, Double cprice, String discount, Date ctime, String crank, Double speed, Double pailiang, String transmission, String fueltype, String fuelEconomy, int bid, int by1, String by2) {
        this.cid = cid;
        this.cname = cname;
        this.cimg = cimg;
        this.ctype = ctype;
        this.cprice = cprice;
        this.discount = discount;
        this.ctime = ctime;
        this.crank = crank;
        this.speed = speed;
        this.pailiang = pailiang;
        this.transmission = transmission;
        this.fueltype = fueltype;
        this.fuelEconomy = fuelEconomy;
        this.bid = bid;
        this.by1 = by1;
        this.by2 = by2;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public Double getCprice() {
        return cprice;
    }

    public void setCprice(Double cprice) {
        this.cprice = cprice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCrank() {
        return crank;
    }

    public void setCrank(String crank) {
        this.crank = crank;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getPailiang() {
        return pailiang;
    }

    public void setPailiang(Double pailiang) {
        this.pailiang = pailiang;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(String fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
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
