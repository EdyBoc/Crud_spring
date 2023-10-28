package com.desarrolloweb.desarrolloweb.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "Shippers")

public class Shippers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Shipperid;
    private String Shippername;
    private String Phone;
    public Shippers() {
    }
    public Shippers(int shipperid, String shippername, String phone) {
        Shipperid = shipperid;
        Shippername = shippername;
        Phone = phone;
    }
    public int getShipperid() {
        return Shipperid;
    }
    public void setShipperid(int shipperid) {
        Shipperid = shipperid;
    }
    public String getShippername() {
        return Shippername;
    }
    public void setShippername(String shippername) {
        Shippername = shippername;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }

}
