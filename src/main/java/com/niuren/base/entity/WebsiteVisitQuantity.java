package com.niuren.base.entity;
// default package



/**
 * WebsiteVisitQuantity entity. @author MyEclipse Persistence Tools
 */

public class WebsiteVisitQuantity  implements java.io.Serializable {


    // Fields    

     private String id;
     private Integer quantity;


    // Constructors

    /** default constructor */
    public WebsiteVisitQuantity() {
    }

    
    /** full constructor */
    public WebsiteVisitQuantity(Integer quantity) {
        this.quantity = quantity;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
   








}