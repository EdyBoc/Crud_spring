package com.desarrolloweb.desarrolloweb.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "Orderdetails")

public class Orderdetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Orderdetailid;
    private int Orderid;
    private int Productid;
    private int Quantity;

    public Orderdetails() {
    }

    public Orderdetails(int orderdetailid, int orderid, int productid, int quantity) {
        Orderdetailid = orderdetailid;
        Orderid = orderid;
        Productid = productid;
        Quantity = quantity;
    }

    public int getOrderdetailid() {
        return Orderdetailid;
    }

    public void setOrderdetailid(int orderdetailid) {
        Orderdetailid = orderdetailid;
    }

    public int getOrderid() {
        return Orderid;
    }

    public void setOrderid(int orderid) {
        Orderid = orderid;
    }

    public int getProductid() {
        return Productid;
    }

    public void setProductid(int productid) {
        Productid = productid;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

}
