package com.desarrolloweb.desarrolloweb.interfaceService;

import java.util.List;
import java.util.Optional;

import com.desarrolloweb.desarrolloweb.modelo.Orderdetails;

public interface IorderdetailsService {
    public List<Orderdetails>listar();
    public Optional<Orderdetails>listarId(int id);
    public Orderdetails save(Orderdetails c);
    public void delete(int id);
    
}
