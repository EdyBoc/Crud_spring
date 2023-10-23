package com.desarrolloweb.desarrolloweb.interfaceService;

import java.util.List;
import java.util.Optional;

import com.desarrolloweb.desarrolloweb.modelo.Categories;


//En esta interfas se ponen todos los metodos pero sin logica
public interface IcategoriesService {
 
    
    public List<Categories>listar();
    public Optional<Categories>listarId(int id);
    public Categories save(Categories c);
    public void delete(int id);

}

