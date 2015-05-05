package com.niuren.base.entity;
// default package



/**
 * Region entity. @author MyEclipse Persistence Tools
 */

public class Region  implements java.io.Serializable {


    // Fields    

     private Short id;
     private Short pid;
     private String name;
     private Integer  type;


    // Constructors

    /** default constructor */
    public Region() {
    }

    
    /** full constructor */
    public Region(Short pid, String name, Integer type) {
        this.pid = pid;
        this.name = name;
        this.type = type;
    }

   
    // Property accessors

    public Short getId() {
        return this.id;
    }
    
    public void setId(Short id) {
        this.id = id;
    }

    public Short getPid() {
        return this.pid;
    }
    
    public void setPid(Short pid) {
        this.pid = pid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }
   








}