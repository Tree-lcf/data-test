package com.tree.datatest.domain;

public class Telemetry {

    private float v;
    private float i;
    private String ts;
    private String deviceId;
    private String measurDt;
    private String route;
    private double capacity;

    public Telemetry(float v, float i, String ts, String deviceId, String measurDt, String route, double capacity) {
        this.v = v;
        this.i = i;
        this.ts = ts;
        this.deviceId = deviceId;
        this.measurDt = measurDt;
        this.route = route;
        this.capacity = capacity;
    }

    public Telemetry() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public float getV() {
        return v;
    }

    public void setV(float v) {
        this.v = v;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMeasurDt() {
        return measurDt;
    }

    public void setMeasurDt(String measurDt) {
        this.measurDt = measurDt;
    }


    @Override
    public String toString() {
        return "Branch{" +
                "v=" + v +
                ", i=" + i +
                ", ts='" + ts + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", measurDt='" + measurDt + '\'' +
                ", route='" + route + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
