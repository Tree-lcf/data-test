package com.tree.datatest.domain;


public class TStatHlDay implements Comparable<TStatHlDay>{

  private long id;
  private String projectId;
  private String deviceId;
  private String route;
  private java.sql.Date day;
  private double hour;
  private double loss;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String source;
  private long rankXb;


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


  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }


  public java.sql.Date getDay() {
    return day;
  }

  public void setDay(java.sql.Date day) {
    this.day = day;
  }


  public double getHour() {
    return hour;
  }

  public void setHour(double hour) {
    this.hour = hour;
  }


  public double getLoss() {
    return loss;
  }

  public void setLoss(double loss) {
    this.loss = loss;
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


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public long getRankXb() {
    return rankXb;
  }

  public void setRankXb(long rankXb) {
    this.rankXb = rankXb;
  }

  @Override
  public int compareTo(TStatHlDay o) {

    return Double.compare(o.hour, this.hour);
  }
}
