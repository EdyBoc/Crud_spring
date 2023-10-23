package com.desarrolloweb.desarrolloweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.desarrolloweb.interfaceService.IcategoriesService;
import com.desarrolloweb.desarrolloweb.interfaces.ICategories;
import com.desarrolloweb.desarrolloweb.modelo.Categories;

@Service
//Service Implementet donde se desarrolla toda la logica mas la interfas del service (metodos nada mas pero son logica)
public class CategoriesService implements IcategoriesService {

    @Autowired
    private ICategories Repository;

    @Override 
    public List<Categories> listar() {
         return (List<Categories>)Repository.findAll();
    }

    @Override
    public Optional<Categories> listarId(int id) {
        return Repository.findById( id);
    }

    @Override
    public Categories save(Categories c) {
        return Repository.save(c);
    }

    @Override
    public void delete(int id) {
        Repository.deleteById(id);
       
    }

}
