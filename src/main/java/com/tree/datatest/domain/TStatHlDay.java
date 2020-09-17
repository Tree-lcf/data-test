package com.tree.datatest.domain;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TStatHlDay implements Comparable<TStatHlDay>{

  private long id;
  private String projectId;
  private String deviceId;
  private String route;
  @JsonFormat(pattern = "yyyyMMdd")
  private java.sql.Date day;
  private double hour;
  private double loss;
  private Date createTime;
  private Date updateTime;
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


  public Date getDay() {
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


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public Date getUpdateTime() {
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
  public String toString() {
    return "TStatHlDay{" +
            "id=" + id +
            ", projectId='" + projectId + '\'' +
            ", deviceId='" + deviceId + '\'' +
            ", route='" + route + '\'' +
            ", day=" + day +
            ", hour=" + hour +
            ", loss=" + loss +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", source='" + source + '\'' +
            ", rankXb=" + rankXb +
            '}';
  }

  @Override
  public int compareTo(TStatHlDay o) {

    return Double.compare(o.hour, this.hour);
  }
}
