package com.desarrolloweb.desarrolloweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.desarrolloweb.interfaceService.IemployeesService;
import com.desarrolloweb.desarrolloweb.interfaces.IEmployees;
import com.desarrolloweb.desarrolloweb.modelo.Employees;

@Service

public class EmployeesService implements IemployeesService {

        @Autowired
    private IEmployees Repository;

    @Override
    public List<Employees> listar() {
      return (List<Employees>)Repository.findAll();
    }

    @Override
    public Optional<Employees> listarId(int id) {
        return Repository.findById( id);
    }

    @Override
    public Employees save(Employees c) {
        return Repository.save(c);
    }

    @Override
    public void delete(int id) {
        Repository.deleteById(id);
    }
    
}
