package com.desarrolloweb.desarrolloweb.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.desarrolloweb.desarrolloweb.modelo.Customers;

public interface ICustomers extends CrudRepository <Customers, Integer> {
    
}
