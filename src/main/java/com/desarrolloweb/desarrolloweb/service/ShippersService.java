package com.desarrolloweb.desarrolloweb.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.desarrolloweb.interfaceService.IshippersService;
import com.desarrolloweb.desarrolloweb.interfaces.IShippers;
import com.desarrolloweb.desarrolloweb.modelo.Shippers;

@Service

public class ShippersService implements IshippersService {

        @Autowired
    private IShippers Repository;


    @Override
    public List<Shippers> listar() {
     return (List<Shippers>)Repository.findAll();
    }

    @Override
    public Optional<Shippers> listarId(int id) {
        return Repository.findById( id);
    }

    @Override
    public Shippers save(Shippers c) {
        return Repository.save(c);
    }

    @Override
    public void delete(int id) {
        Repository.deleteById(id);
    }
    
}
