package com.desarrolloweb.desarrolloweb.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.desarrolloweb.desarrolloweb.modelo.Shippers;

public interface IShippers extends CrudRepository <Shippers, Integer> {
    
}
