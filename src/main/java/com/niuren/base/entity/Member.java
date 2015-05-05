package com.niuren.base.entity;
// default package



/**
 * Member entity. @author MyEclipse Persistence Tools
 */

public class Member  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String email;
     private String pwd;
     private Short mtype;
     private String regIp;
     private Integer regDate;
     private String trueName;
     private Integer sex;
     private Integer age;
     private String schoolName;
     private java.lang.Short province;
     private java.lang.Short city;
     private String mobile;
     private String telphone;
     private String icqNum;
     private Short memberRoleId;
     private String preAchieve;
     private String hopeIndustryType;
     private String avatar;
     private Boolean recommend;
     private String loginIp;
     private Integer loginTime;


    // Constructors

    /** default constructor */
    public Member() {
    }

	/** minimal constructor */
    public Member(String email, String pwd, Short mtype, String regIp, Integer regDate, Boolean recommend) {
        this.email = email;
        this.pwd = pwd;
        this.mtype = mtype;
        this.regIp = regIp;
        this.regDate = regDate;
        this.recommend = recommend;
    }
    
    /** full constructor */
    public Member(String email, String pwd, Short mtype, String regIp, Integer regDate, String trueName, Integer sex, Integer age, String schoolName, java.lang.Short province, java.lang.Short city, String mobile, String telphone, String icqNum, Short memberRoleId, String preAchieve, String hopeIndustryType, String avatar, Boolean recommend, String loginIp, Integer loginTime) {
        this.email = email;
        this.pwd = pwd;
        this.mtype = mtype;
        this.regIp = regIp;
        this.regDate = regDate;
        this.trueName = trueName;
        this.sex = sex;
        this.age = age;
        this.schoolName = schoolName;
        this.province = province;
        this.city = city;
        this.mobile = mobile;
        this.telphone = telphone;
        this.icqNum = icqNum;
        this.memberRoleId = memberRoleId;
        this.preAchieve = preAchieve;
        this.hopeIndustryType = hopeIndustryType;
        this.avatar = avatar;
        this.recommend = recommend;
        this.loginIp = loginIp;
        this.loginTime = loginTime;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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

    public Short getMtype() {
        return this.mtype;
    }
    
    public void setMtype(Short mtype) {
        this.mtype = mtype;
    }

    public String getRegIp() {
        return this.regIp;
    }
    
    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Integer getRegDate() {
        return this.regDate;
    }
    
    public void setRegDate(Integer regDate) {
        this.regDate = regDate;
    }

    public String getTrueName() {
        return this.trueName;
    }
    
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchoolName() {
        return this.schoolName;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public java.lang.Short getProvince() {
        return this.province;
    }
    
    public void setProvince(java.lang.Short province) {
        this.province = province;
    }

    public java.lang.Short getCity() {
        return this.city;
    }
    
    public void setCity(java.lang.Short city) {
        this.city = city;
    }

    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelphone() {
        return this.telphone;
    }
    
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getIcqNum() {
        return this.icqNum;
    }
    
    public void setIcqNum(String icqNum) {
        this.icqNum = icqNum;
    }

    public Short getMemberRoleId() {
        return this.memberRoleId;
    }
    
    public void setMemberRoleId(Short memberRoleId) {
        this.memberRoleId = memberRoleId;
    }

    public String getPreAchieve() {
        return this.preAchieve;
    }
    
    public void setPreAchieve(String preAchieve) {
        this.preAchieve = preAchieve;
    }

    public String getHopeIndustryType() {
        return this.hopeIndustryType;
    }
    
    public void setHopeIndustryType(String hopeIndustryType) {
        this.hopeIndustryType = hopeIndustryType;
    }

    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getRecommend() {
        return this.recommend;
    }
    
    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public String getLoginIp() {
        return this.loginIp;
    }
    
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Integer getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }
   








}