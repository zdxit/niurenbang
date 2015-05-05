package com.niuren.base.entity;
// default package



/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article  implements java.io.Serializable {


    // Fields    

     private Long id;
     private Long mid;
     private Short type;
     private String litpic;
     private String title;
     private String simpleDescrip;
     private String text;
     private Integer click;
     private Integer insertTime;


    // Constructors

    /** default constructor */
    public Article() {
    }

	/** minimal constructor */
    public Article(Long mid, Short type, String title, String text, Integer click, Integer insertTime) {
        this.mid = mid;
        this.type = type;
        this.title = title;
        this.text = text;
        this.click = click;
        this.insertTime = insertTime;
    }
    
    /** full constructor */
    public Article(Long mid, Short type, String litpic, String title, String simpleDescrip, String text, Integer click, Integer insertTime) {
        this.mid = mid;
        this.type = type;
        this.litpic = litpic;
        this.title = title;
        this.simpleDescrip = simpleDescrip;
        this.text = text;
        this.click = click;
        this.insertTime = insertTime;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getMid() {
        return this.mid;
    }
    
    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Short getType() {
        return this.type;
    }
    
    public void setType(Short type) {
        this.type = type;
    }

    public String getLitpic() {
        return this.litpic;
    }
    
    public void setLitpic(String litpic) {
        this.litpic = litpic;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getSimpleDescrip() {
        return this.simpleDescrip;
    }
    
    public void setSimpleDescrip(String simpleDescrip) {
        this.simpleDescrip = simpleDescrip;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Integer getClick() {
        return this.click;
    }
    
    public void setClick(Integer click) {
        this.click = click;
    }

    public Integer getInsertTime() {
        return this.insertTime;
    }
    
    public void setInsertTime(Integer insertTime) {
        this.insertTime = insertTime;
    }
   








}