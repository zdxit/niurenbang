package com.niuren.base.entity;

// default package

/**
 * Member entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String email;
	private String pwd;
	// 用户类型1企业2个人
	private String mtype;
	private String regIp;
	private Integer regDate;
	private String trueName;
	private String sex;
	private Integer age;
	private String schoolName;
	private String province;
	private String city;
	private String mobile;
	private String telphone;
	private String icqNum;
	private String memberRole;
	private String preAchieve;
	private String hopeIndustryType;
	private String avatar;
	private Boolean recommend;
	private String loginIp;
	private Integer loginTime;

	public User() {

	}

	public User(Integer id, String email, String pwd, String mtype,
			String regIp, Integer regDate, String trueName, String sex,
			Integer age, String schoolName, String province, String city,
			String mobile, String telphone, String icqNum, String memberRole,
			String preAchieve, String hopeIndustryType, String avatar,
			Boolean recommend, String loginIp, Integer loginTime) {
		super();
		this.id = id;
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
		this.memberRole = memberRole;
		this.preAchieve = preAchieve;
		this.hopeIndustryType = hopeIndustryType;
		this.avatar = avatar;
		this.recommend = recommend;
		this.loginIp = loginIp;
		this.loginTime = loginTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public Integer getRegDate() {
		return regDate;
	}

	public void setRegDate(Integer regDate) {
		this.regDate = regDate;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getIcqNum() {
		return icqNum;
	}

	public void setIcqNum(String icqNum) {
		this.icqNum = icqNum;
	}

	public String getMemberRole() {
		return memberRole;
	}

	public void setMemberRole(String memberRole) {
		this.memberRole = memberRole;
	}

	public String getPreAchieve() {
		return preAchieve;
	}

	public void setPreAchieve(String preAchieve) {
		this.preAchieve = preAchieve;
	}

	public String getHopeIndustryType() {
		return hopeIndustryType;
	}

	public void setHopeIndustryType(String hopeIndustryType) {
		this.hopeIndustryType = hopeIndustryType;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Boolean getRecommend() {
		return recommend;
	}

	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Integer getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Integer loginTime) {
		this.loginTime = loginTime;
	}

	public void convertMember(Member member) {

		this.id = member.getId();
		this.email = member.getEmail();
		this.pwd = member.getPwd();
		if(member.getMtype()==1){
			this.mtype = "用户";
		}else{
			this.mtype = "企业";
		}
		this.regIp = member.getRegIp();
		this.regDate = member.getRegDate();
		this.trueName = member.getTrueName();
		if(member.getSex()==1){
			this.sex ="男";
		}else{
			this.sex ="女";
		}
		this.age = member.getAge();
		this.schoolName = member.getSchoolName();
		this.mobile = member.getMobile();
		this.telphone = member.getTelphone();
		this.icqNum = member.getIcqNum();
		this.preAchieve = member.getPreAchieve();
		this.avatar = member.getAvatar();
		this.recommend = member.getRecommend();
		this.loginIp = member.getLoginIp();
		this.loginTime = member.getLoginTime();
	}

}