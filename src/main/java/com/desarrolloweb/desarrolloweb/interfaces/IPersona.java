
package com.desarrolloweb.desarrolloweb.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desarrolloweb.desarrolloweb.modelo.Persona;


@Repository
public interface IPersona extends CrudRepository <Persona, Integer>  {
    
    
    
}
