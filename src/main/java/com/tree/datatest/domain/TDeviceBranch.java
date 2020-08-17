package com.tree.datatest.domain;


public class TDeviceBranch {

  private long id;
  private String projectId;
  private String deviceId;
  private long route;
  private double power;
  private long number;
  private double capacity;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long systemType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public long getRoute() {
    return route;
  }

  public void setRoute(long route) {
    this.route = route;
  }


  public double getPower() {
    return power;
  }

  public void setPower(double power) {
    this.power = power;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getSystemType() {
    return systemType;
  }

  public void setSystemType(long systemType) {
    this.systemType = systemType;
  }

}
