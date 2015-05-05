package com.niuren.base.entity;
// default package



/**
 * Station entity. @author MyEclipse Persistence Tools
 */

public class Station  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Short type;
     private Integer sender;
     private Integer getter;
     private String title;
     private String content;
     private Integer stime;
     private Boolean isread;
     private Boolean isreply;
     private String reply;
     private Integer rtime;


    // Constructors

    /** default constructor */
    public Station() {
    }

	/** minimal constructor */
    public Station(Short type, Integer sender, Integer getter, String title, Integer stime, Boolean isread, Boolean isreply, Integer rtime) {
        this.type = type;
        this.sender = sender;
        this.getter = getter;
        this.title = title;
        this.stime = stime;
        this.isread = isread;
        this.isreply = isreply;
        this.rtime = rtime;
    }
    
    /** full constructor */
    public Station(Short type, Integer sender, Integer getter, String title, String content, Integer stime, Boolean isread, Boolean isreply, String reply, Integer rtime) {
        this.type = type;
        this.sender = sender;
        this.getter = getter;
        this.title = title;
        this.content = content;
        this.stime = stime;
        this.isread = isread;
        this.isreply = isreply;
        this.reply = reply;
        this.rtime = rtime;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Short getType() {
        return this.type;
    }
    
    public void setType(Short type) {
        this.type = type;
    }

    public Integer getSender() {
        return this.sender;
    }
    
    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getGetter() {
        return this.getter;
    }
    
    public void setGetter(Integer getter) {
        this.getter = getter;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStime() {
        return this.stime;
    }
    
    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public Boolean getIsread() {
        return this.isread;
    }
    
    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

    public Boolean getIsreply() {
        return this.isreply;
    }
    
    public void setIsreply(Boolean isreply) {
        this.isreply = isreply;
    }

    public String getReply() {
        return this.reply;
    }
    
    public void setReply(String reply) {
        this.reply = reply;
    }

    public Integer getRtime() {
        return this.rtime;
    }
    
    public void setRtime(Integer rtime) {
        this.rtime = rtime;
    }
   








}