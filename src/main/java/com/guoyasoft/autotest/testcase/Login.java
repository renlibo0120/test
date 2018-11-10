package com.guoyasoft.autotest.testcase;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.autotest.bean.login.LoginReq;
import com.guoyasoft.autotest.bean.login.LoginResp;
import com.guoyasoft.autotest.tools.HttpTools;
import java.sql.SQLOutput;
import javax.xml.ws.http.HTTPBinding;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: auto-test3
 * @description:
 * @author: guoya
 * @create: 2018-11-10 15:14
 **/
public class Login {
  @Test
  public void testLogin(){
    LoginReq loginReq = new LoginReq();
    loginReq.setUserName("renlibo123");
    loginReq.setPwd("ren123456");

    String reqJson = JSON.toJSONString(loginReq,true);
    System.out.println("------------请求数据------------");
    System.out.println(reqJson);

    String respString = HttpTools.doPostByJson("http://qa.guoyasoft.com:8080/user/login",reqJson,"UTF-8");
    System.out.println(respString);

    LoginResp loginResp = JSON.parseObject(respString, LoginResp.class);
    String respCode = loginResp.getRespCode();
    System.out.println("------------响应报文------------");
    System.out.println(respCode);

    Assert.assertEquals(respCode,"0000");

  }
}
