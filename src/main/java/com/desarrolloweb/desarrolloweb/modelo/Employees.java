package com.desarrolloweb.desarrolloweb.modelo;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Employeeid;
    private String Lastname;
    private String Firstname;
    private Date Birthdate;
    private String Photo;
    private String Notes;

    public Employees() {
    }

    public Employees(int employeeid, String lastname, String firstname, Date birthdate, String photo, String notes) {
        Employeeid = employeeid;
        Lastname = lastname;
        Firstname = firstname;
        Birthdate = birthdate;
        Photo = photo;
        Notes = notes;
    }

    public int getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(int employeeid) {
        Employeeid = employeeid;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }


}
