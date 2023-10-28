package com.desarrolloweb.desarrolloweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.desarrolloweb.interfaceService.IorderdetailsService;
import com.desarrolloweb.desarrolloweb.interfaces.IOrderdetails;
import com.desarrolloweb.desarrolloweb.modelo.Orderdetails;

@Service


public class OrdendetailsService implements IorderdetailsService {

     @Autowired
    private IOrderdetails Repository;

    @Override
    public List<Orderdetails> listar() {
        return (List<Orderdetails>)Repository.findAll();
    }

    @Override
    public Optional<Orderdetails> listarId(int id) {
        return Repository.findById( id);
    }

    @Override
    public Orderdetails save(Orderdetails c) {
        return Repository.save(c);
    }

    @Override
    public void delete(int id) {
        Repository.deleteById(id);
    }
    
}
