package com.desarrolloweb.desarrolloweb.interfaceService;

import java.util.List;
import java.util.Optional;

import com.desarrolloweb.desarrolloweb.modelo.Customers;

public interface IcustomersService {
    public List<Customers>listar();
    public Optional<Customers>listarId(int id);
    public Customers save(Customers c);
    public void delete(int id);
    
}
