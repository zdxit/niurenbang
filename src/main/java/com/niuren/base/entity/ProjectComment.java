package com.niuren.base.entity;
// default package



/**
 * ProjectComment entity. @author MyEclipse Persistence Tools
 */

public class ProjectComment  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer pid;
     private Integer mid;
     private Integer tomid;
     private String projectId;
     private String text;
     private Boolean isRead;
     private Long insertTime;


    // Constructors

    /** default constructor */
    public ProjectComment() {
    }

    
    /** full constructor */
    public ProjectComment(Integer pid, Integer mid, Integer tomid, String projectId, String text, Boolean isRead, Long insertTime) {
        this.pid = pid;
        this.mid = mid;
        this.tomid = tomid;
        this.projectId = projectId;
        this.text = text;
        this.isRead = isRead;
        this.insertTime = insertTime;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getMid() {
        return this.mid;
    }
    
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getTomid() {
        return this.tomid;
    }
    
    public void setTomid(Integer tomid) {
        this.tomid = tomid;
    }

    public String getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Boolean getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Long getInsertTime() {
        return this.insertTime;
    }
    
    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }
   








}