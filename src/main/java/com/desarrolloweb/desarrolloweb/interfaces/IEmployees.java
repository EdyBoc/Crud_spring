package com.desarrolloweb.desarrolloweb.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.desarrolloweb.desarrolloweb.modelo.Employees;

public interface IEmployees extends CrudRepository <Employees, Integer> {
    
}
