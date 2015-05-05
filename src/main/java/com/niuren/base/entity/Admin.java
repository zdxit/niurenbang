package com.niuren.base.entity;
// default package



/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin  implements java.io.Serializable {


    // Fields    

     private Integer aid;
     private String nickname;
     private String email;
     private String pwd;
     private Integer status;
     private String remark;
     private String findCode;
     private Integer time;


    // Constructors

    /** default constructor */
    public Admin() {
    }

    
    /** full constructor */
    public Admin(String nickname, String email, String pwd, Integer status, String remark, String findCode, Integer time) {
        this.nickname = nickname;
        this.email = email;
        this.pwd = pwd;
        this.status = status;
        this.remark = remark;
        this.findCode = findCode;
        this.time = time;
    }

   
    // Property accessors

    public Integer getAid() {
        return this.aid;
    }
    
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return this.pwd;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFindCode() {
        return this.findCode;
    }
    
    public void setFindCode(String findCode) {
        this.findCode = findCode;
    }

    public Integer getTime() {
        return this.time;
    }
    
    public void setTime(Integer time) {
        this.time = time;
    }
   








}