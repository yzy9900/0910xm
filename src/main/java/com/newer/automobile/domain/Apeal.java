package com.newer.automobile.domain;

public class Apeal {
    private int aid;
    private int cid;
    private int SeatingCapacity;
    private String size;
    private String Wheelbase;
    private int Overall;
    private int TopSpeed;
    private String AntiLockBreaking;
    private String ParkingSensor;
    private String TractionControl;
    private int by1;
    private String by2;

    public Apeal() {
    }

    public Apeal(int aid, int cid, int seatingCapacity, String size, String wheelbase, int overall, int topSpeed, String antiLockBreaking, String parkingSensor, String tractionControl, int by1, String by2) {
        this.aid = aid;
        this.cid = cid;
        SeatingCapacity = seatingCapacity;
        this.size = size;
        Wheelbase = wheelbase;
        Overall = overall;
        TopSpeed = topSpeed;
        AntiLockBreaking = antiLockBreaking;
        ParkingSensor = parkingSensor;
        TractionControl = tractionControl;
        this.by1 = by1;
        this.by2 = by2;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        SeatingCapacity = seatingCapacity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWheelbase() {
        return Wheelbase;
    }

    public void setWheelbase(String wheelbase) {
        Wheelbase = wheelbase;
    }

    public int getOverall() {
        return Overall;
    }

    public void setOverall(int overall) {
        Overall = overall;
    }

    public int getTopSpeed() {
        return TopSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        TopSpeed = topSpeed;
    }

    public String getAntiLockBreaking() {
        return AntiLockBreaking;
    }

    public void setAntiLockBreaking(String antiLockBreaking) {
        AntiLockBreaking = antiLockBreaking;
    }

    public String getParkingSensor() {
        return ParkingSensor;
    }

    public void setParkingSensor(String parkingSensor) {
        ParkingSensor = parkingSensor;
    }

    public String getTractionControl() {
        return TractionControl;
    }

    public void setTractionControl(String tractionControl) {
        TractionControl = tractionControl;
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
