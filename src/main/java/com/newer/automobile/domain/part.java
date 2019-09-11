package com.newer.automobile.domain;

public class part {
    private int pid;
    private Double pprice;
    private String partType;
    private String describes;
    private int by1;
    private String by2;

    public part() {
    }

    public part(int pid, Double pprice, String partType, String describes, int by1, String by2) {
        this.pid = pid;
        this.pprice = pprice;
        this.partType = partType;
        this.describes = describes;
        this.by1 = by1;
        this.by2 = by2;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
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
