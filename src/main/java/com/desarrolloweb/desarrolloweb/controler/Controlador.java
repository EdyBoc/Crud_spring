
package com.desarrolloweb.desarrolloweb.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.desarrolloweb.desarrolloweb.interfaceService.IpersonaService;
import com.desarrolloweb.desarrolloweb.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {


    @Autowired
private IpersonaService service;


    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona>personas=service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    //Categories
    @GetMapping("/listar")
    public String listar2(Model model) {
        List<Persona>personas=service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

}
