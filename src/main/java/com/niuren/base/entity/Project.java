package com.niuren.base.entity;
// default package



/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project  implements java.io.Serializable {


    // Fields    
     private Integer id;
     private Integer mid;
     private String logoPic;
     private String title;
     private Integer province;
     private Integer city;
     private  String industryType;
     private String simpleDescrip;
     private String aboutTeam;
     private String projectDescrip;
     private String projectFuture;
     private String competitiveEdge;
     private Integer teamPeople;
     private Integer teamFulltimePeople;
     private Integer progressType;
     private String webUrl;
     private String iphoneAppUrl;
     private String androidAppUrl;
     
     //待定
     private String needMemberRole;
     private String myHope;
     private String telNo;
     private String qqNo;
     private String email;
     private Long insertTime;
     private Boolean status=false;
     private Long clickNumber=0L;
     private Boolean recommend=false;
     private Integer sortRank=0;
     //收到的简历数
     private Integer resumeCount=0;
     //评论数
     private Integer commentCount=0;


    // Constructors

    /** default constructor */
    public Project() {
    }

	/** minimal constructor */
    public Project(Integer mid, Long insertTime, Boolean status, Long clickNumber, Boolean recommend, Integer sortRank, Integer resumeCount, Integer commentCount) {
        this.mid = mid;
        this.insertTime = insertTime;
        this.status = status;
        this.clickNumber = clickNumber;
        this.recommend = recommend;
        this.sortRank = sortRank;
        this.resumeCount = resumeCount;
        this.commentCount = commentCount;
    }
    
    /** full constructor */
    public Project(Integer mid, String logoPic, String title, Integer province, Integer city, String industryType, String simpleDescrip, String aboutTeam, String projectDescrip, String projectFuture, String competitiveEdge, Integer teamPeople, Integer teamFulltimePeople, Integer progressType, String webUrl, String iphoneAppUrl, String androidAppUrl, String needMemberRole, String myHope, String telNo, String qqNo, String email, Long insertTime, Boolean status, Long clickNumber, Boolean recommend, Integer sortRank, Integer resumeCount, Integer commentCount) {
        this.mid = mid;
        this.logoPic = logoPic;
        this.title = title;
        this.province = province;
        this.city = city;
        this.industryType = industryType;
        this.simpleDescrip = simpleDescrip;
        this.aboutTeam = aboutTeam;
        this.projectDescrip = projectDescrip;
        this.projectFuture = projectFuture;
        this.competitiveEdge = competitiveEdge;
        this.teamPeople = teamPeople;
        this.teamFulltimePeople = teamFulltimePeople;
        this.progressType = progressType;
        this.webUrl = webUrl;
        this.iphoneAppUrl = iphoneAppUrl;
        this.androidAppUrl = androidAppUrl;
        this.needMemberRole = needMemberRole;
        this.myHope = myHope;
        this.telNo = telNo;
        this.qqNo = qqNo;
        this.email = email;
        this.insertTime = insertTime;
        this.status = status;
        this.clickNumber = clickNumber;
        this.recommend = recommend;
        this.sortRank = sortRank;
        this.resumeCount = resumeCount;
        this.commentCount = commentCount;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return this.mid;
    }
    
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getLogoPic() {
        return this.logoPic;
    }
    
    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getProvince() {
        return this.province;
    }
    
    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return this.city;
    }
    
    public void setCity(Integer city) {
        this.city = city;
    }

    public String getIndustryType() {
        return this.industryType;
    }
    
    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getSimpleDescrip() {
        return this.simpleDescrip;
    }
    
    public void setSimpleDescrip(String simpleDescrip) {
        this.simpleDescrip = simpleDescrip;
    }

    public String getAboutTeam() {
        return this.aboutTeam;
    }
    
    public void setAboutTeam(String aboutTeam) {
        this.aboutTeam = aboutTeam;
    }

    public String getProjectDescrip() {
        return this.projectDescrip;
    }
    
    public void setProjectDescrip(String projectDescrip) {
        this.projectDescrip = projectDescrip;
    }

    public String getProjectFuture() {
        return this.projectFuture;
    }
    
    public void setProjectFuture(String projectFuture) {
        this.projectFuture = projectFuture;
    }

    public String getCompetitiveEdge() {
        return this.competitiveEdge;
    }
    
    public void setCompetitiveEdge(String competitiveEdge) {
        this.competitiveEdge = competitiveEdge;
    }

    public Integer getTeamPeople() {
        return this.teamPeople;
    }
    
    public void setTeamPeople(Integer teamPeople) {
        this.teamPeople = teamPeople;
    }

    public Integer getTeamFulltimePeople() {
        return this.teamFulltimePeople;
    }
    
    public void setTeamFulltimePeople(Integer teamFulltimePeople) {
        this.teamFulltimePeople = teamFulltimePeople;
    }

    public Integer getProgressType() {
        return this.progressType;
    }
    
    public void setProgressType(Integer progressType) {
        this.progressType = progressType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
    
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getIphoneAppUrl() {
        return this.iphoneAppUrl;
    }
    
    public void setIphoneAppUrl(String iphoneAppUrl) {
        this.iphoneAppUrl = iphoneAppUrl;
    }

    public String getAndroidAppUrl() {
        return this.androidAppUrl;
    }
    
    public void setAndroidAppUrl(String androidAppUrl) {
        this.androidAppUrl = androidAppUrl;
    }

    public String getNeedMemberRole() {
        return this.needMemberRole;
    }
    
    public void setNeedMemberRole(String needMemberRole) {
        this.needMemberRole = needMemberRole;
    }

    public String getMyHope() {
        return this.myHope;
    }
    
    public void setMyHope(String myHope) {
        this.myHope = myHope;
    }

    public String getTelNo() {
        return this.telNo;
    }
    
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getQqNo() {
        return this.qqNo;
    }
    
    public void setQqNo(String qqNo) {
        this.qqNo = qqNo;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getInsertTime() {
        return this.insertTime;
    }
    
    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }

    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getClickNumber() {
        return this.clickNumber;
    }
    
    public void setClickNumber(Long clickNumber) {
        this.clickNumber = clickNumber;
    }

    public Boolean getRecommend() {
        return this.recommend;
    }
    
    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Integer getSortRank() {
        return this.sortRank;
    }
    
    public void setSortRank(Integer sortRank) {
        this.sortRank = sortRank;
    }

    public Integer getResumeCount() {
        return this.resumeCount;
    }
    
    public void setResumeCount(Integer resumeCount) {
        this.resumeCount = resumeCount;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }
    
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

	@Override
	public String toString() {
		return "Project [id=" + id + ", mid=" + mid + ", logoPic=" + logoPic
				+ ", title=" + title + ", province=" + province + ", city="
				+ city + ", industryType=" + industryType + ", simpleDescrip="
				+ simpleDescrip + ", aboutTeam=" + aboutTeam
				+ ", projectDescrip=" + projectDescrip + ", projectFuture="
				+ projectFuture + ", competitiveEdge=" + competitiveEdge
				+ ", teamPeople=" + teamPeople + ", teamFulltimePeople="
				+ teamFulltimePeople + ", progressType=" + progressType
				+ ", webUrl=" + webUrl + ", iphoneAppUrl=" + iphoneAppUrl
				+ ", androidAppUrl=" + androidAppUrl + ", needMemberRole="
				+ needMemberRole + ", myHope=" + myHope + ", telNo=" + telNo
				+ ", qqNo=" + qqNo + ", email=" + email + ", insertTime="
				+ insertTime + ", status=" + status + ", clickNumber="
				+ clickNumber + ", recommend=" + recommend + ", sortRank="
				+ sortRank + ", resumeCount=" + resumeCount + ", commentCount="
				+ commentCount + "]";
	}
   








}