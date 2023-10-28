package com.desarrolloweb.desarrolloweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.desarrolloweb.interfaceService.IcustomersService;
import com.desarrolloweb.desarrolloweb.interfaces.ICustomers;
import com.desarrolloweb.desarrolloweb.modelo.Customers;

@Service
public class CustomersService implements IcustomersService{

    @Autowired
    private ICustomers Repository;

    @Override
    public List<Customers> listar() {
         return (List<Customers>)Repository.findAll();
    }

    @Override
    public Optional<Customers> listarId(int id) {
        return Repository.findById( id);
    }

    @Override
    public Customers save(Customers c) {
        return Repository.save(c);
    }

    @Override
    public void delete(int id) {
        Repository.deleteById(id);
    }
    


    
}
