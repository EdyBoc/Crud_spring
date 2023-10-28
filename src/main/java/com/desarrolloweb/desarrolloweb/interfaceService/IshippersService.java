package com.desarrolloweb.desarrolloweb.interfaceService;

import java.util.List;
import java.util.Optional;

import com.desarrolloweb.desarrolloweb.modelo.Shippers;

public interface IshippersService {
    
    public List<Shippers>listar();
    public Optional<Shippers>listarId(int id);
    public Shippers save(Shippers c);
    public void delete(int id);

}
