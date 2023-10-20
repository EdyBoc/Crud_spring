
package com.desarrolloweb.desarrolloweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.desarrolloweb.interfaceService.IpersonaService;
import com.desarrolloweb.desarrolloweb.interfaces.IPersona;
import com.desarrolloweb.desarrolloweb.modelo.Persona;

@Service
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;
    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
       
        return null;
    }

    @Override
    public int save(Persona p) {
       return 0;
    }

    @Override
    public void delete(int id) {

        data.deleteById(id);
    }

    
    
}
