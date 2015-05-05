package com.niuren.base.entity;
// default package



/**
 * Links entity. @author MyEclipse Persistence Tools
 */

public class Links  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String url;
     private String name;
     private String img;
     private Integer sort;
     private Short type;


    // Constructors

    /** default constructor */
    public Links() {
    }

    
    /** full constructor */
    public Links(String url, String name, String img, Integer sort, Short type) {
        this.url = url;
        this.name = name;
        this.img = img;
        this.sort = sort;
        this.type = type;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return this.img;
    }
    
    public void setImg(String img) {
        this.img = img;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Short getType() {
        return this.type;
    }
    
    public void setType(Short type) {
        this.type = type;
    }
   








}