package com.guoyasoft.autotest.bean.login;

/**
 * @program: auto-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-10 15:00
 **/
public class LoginReq {
  private String pwd;
  private String userName ;

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
