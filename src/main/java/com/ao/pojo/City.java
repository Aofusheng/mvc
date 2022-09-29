package com.ao.pojo;


public class City {

  private long id;
  private String name;
  private long provinceid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getProvinceid() {
    return provinceid;
  }

  public void setProvinceid(long provinceid) {
    this.provinceid = provinceid;
  }

  public City(long id, String name, long provinceid) {
    this.id = id;
    this.name = name;
    this.provinceid = provinceid;
  }

  public City(String name, long provinceid) {
    this.name = name;
    this.provinceid = provinceid;
  }

  public City() {
  }

  @Override
  public String toString() {
    return "City{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", provinceid=" + provinceid +
            '}';
  }
}
