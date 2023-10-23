package com.desarrolloweb.desarrolloweb.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.desarrolloweb.desarrolloweb.modelo.Categories;


//Repositorio  coneccion a base de datos
public interface ICategories  extends CrudRepository <Categories, Integer> {
    
}
