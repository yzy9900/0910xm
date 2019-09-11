package com.newer.automobile.domain;

import java.util.Date;

public class Order {
    private int oid;
    private int uid;
    private int sid;
    private String otype;
    private Date dealtime;
    private String payment;
    private String accomplish;
    private Double dealprice;
    private String delivery;
    private int by1;
    private String by2;

    public Order() {
    }

    public Order(int oid, int uid, int sid, String otype, Date dealtime, String payment, String accomplish, Double dealprice, String delivery, int by1, String by2) {
        this.oid = oid;
        this.uid = uid;
        this.sid = sid;
        this.otype = otype;
        this.dealtime = dealtime;
        this.payment = payment;
        this.accomplish = accomplish;
        this.dealprice = dealprice;
        this.delivery = delivery;
        this.by1 = by1;
        this.by2 = by2;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype;
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAccomplish() {
        return accomplish;
    }

    public void setAccomplish(String accomplish) {
        this.accomplish = accomplish;
    }

    public Double getDealprice() {
        return dealprice;
    }

    public void setDealprice(Double dealprice) {
        this.dealprice = dealprice;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
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
