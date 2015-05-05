package com.niuren.base.entity;
// default package



/**
 * ProjectResume entity. @author MyEclipse Persistence Tools
 */

public class ProjectResume  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Boolean type;
     private Boolean isRead;
     private Integer fromMid;
     private String projectId;


    // Constructors

    /** default constructor */
    public ProjectResume() {
    }

    
    /** full constructor */
    public ProjectResume(Boolean type, Boolean isRead, Integer fromMid, String projectId) {
        this.type = type;
        this.isRead = isRead;
        this.fromMid = fromMid;
        this.projectId = projectId;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getType() {
        return this.type;
    }
    
    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Integer getFromMid() {
        return this.fromMid;
    }
    
    public void setFromMid(Integer fromMid) {
        this.fromMid = fromMid;
    }

    public String getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
   








}