package com.ao.pojo;


public class Province {

  private long id;
  private String name;
  private String jiancheng;
  private String shenghui;


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

  public Province(long id, String name, String jiancheng, String shenghui) {
    this.id = id;
    this.name = name;
    this.jiancheng = jiancheng;
    this.shenghui = shenghui;
  }

  public Province(String name, String jiancheng, String shenghui) {
    this.name = name;
    this.jiancheng = jiancheng;
    this.shenghui = shenghui;
  }

  public Province() {
  }

  @Override
  public String toString() {
    return "Province{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", jiancheng='" + jiancheng + '\'' +
            ", shenghui='" + shenghui + '\'' +
            '}';
  }

  public String getJiancheng() {
    return jiancheng;
  }

  public void setJiancheng(String jiancheng) {
    this.jiancheng = jiancheng;
  }


  public String getShenghui() {
    return shenghui;
  }

  public void setShenghui(String shenghui) {
    this.shenghui = shenghui;
  }

}
