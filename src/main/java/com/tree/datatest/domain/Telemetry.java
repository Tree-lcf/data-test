package com.tree.datatest.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tree.datatest.utils.Route;

import java.util.Date;

public class Telemetry {

    private float v;
    private float i;
    private String ts;
    private String deviceId;
    private String measureDt;
    private String routeId;
    private String route;
    private double capacity;
    private int type;

    public Telemetry(float v, float i, String ts, String deviceId, String measurDt, String routeId, String route, double capacity, int type) {
        this.v = v;
        this.i = i;
        this.ts = ts;
        this.deviceId = deviceId;
        this.measureDt = measurDt;
        this.routeId = routeId;
        this.route = route;
        this.capacity = capacity;
        this.type = type;
    }

    public Telemetry() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute() {

        Route route = new Route(routeId);
        this.route = route.getRouteName();
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

    public String getMeasureDt() {
        return measureDt;
    }

    public void setMeasurDt(String measurDt) {
        this.measureDt = measurDt;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
        setRoute();
    }

    @Override
    public String toString() {
        return "Telemetry{" +
                "v=" + v +
                ", i=" + i +
                ", ts='" + ts + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", measurDt='" + measureDt + '\'' +
                ", routeId='" + routeId + '\'' +
                ", route='" + route + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
