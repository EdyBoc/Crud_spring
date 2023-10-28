package com.desarrolloweb.desarrolloweb.modelo;
//import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")

public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Customerid;
    private String Customername;
    private String Contactname;
    private String Address;
    private String City;
    private String Postalcode;
    private String Country;

    public Customers() {
    }

    public Customers(int customerid, String customername, String contactname, String address, String city,
            String postalcode, String country) {
        Customerid = customerid;
        Customername = customername;
        Contactname = contactname;
        Address = address;
        City = city;
        Postalcode = postalcode;
        Country = country;
    }

    public int getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(int customerid) {
        Customerid = customerid;
    }

    public String getCustomername() {
        return Customername;
    }

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public String getContactname() {
        return Contactname;
    }

    public void setContactname(String contactname) {
        Contactname = contactname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalcode() {
        return Postalcode;
    }

    public void setPostalcode(String postalcode) {
        Postalcode = postalcode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

}
