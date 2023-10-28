package com.desarrolloweb.desarrolloweb.interfaceService;

import java.util.List;
import java.util.Optional;

import com.desarrolloweb.desarrolloweb.modelo.Employees;

public interface IemployeesService {
    public List<Employees>listar();
    public Optional<Employees>listarId(int id);
    public Employees save(Employees c);
    public void delete(int id);
    
}
