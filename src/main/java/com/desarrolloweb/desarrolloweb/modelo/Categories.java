package com.desarrolloweb.desarrolloweb.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Categories")

public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int CategoryID;
    private String Categoryname;
    private String Description;

    public Categories() {
    }

    public Categories(int categoryID, String categoryname, String description) {
        CategoryID = categoryID;
        Categoryname = categoryname;
        Description = description;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryname() {
        return Categoryname;
    }

    public void setCategoryname(String categoryname) {
        Categoryname = categoryname;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
