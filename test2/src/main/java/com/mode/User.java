package com.mode;

import java.io.Serializable;

/**
 * @program: test2
 * @description: 用戶信息
 * @author: ALan
 * @create: 2019-04-07 12:01
 */
public class User implements Serializable {
    private static final long serialVersionUID = 7240947629657936966L;
    private  int id;
    private  String userName;
    private  String sex;

    public int getId() {
        return id;
    }

    /*
    *@Description: 
    *@Param: 
    *@return: 
    *@Author: ALan
    *@date: 2019/4/7
    */
    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
