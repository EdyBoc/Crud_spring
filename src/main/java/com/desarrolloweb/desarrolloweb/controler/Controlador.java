
package com.desarrolloweb.desarrolloweb.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.desarrolloweb.desarrolloweb.interfaceService.IpersonaService;
import com.desarrolloweb.desarrolloweb.modelo.Categories;
import com.desarrolloweb.desarrolloweb.modelo.Persona;
import com.desarrolloweb.desarrolloweb.service.CategoriesService;

@Controller
@RequestMapping
public class Controlador {
//Con el Autowired se hace una inyecccion de dependencia y con eso se pueden usar todo los metos que contengan la clase 

    @Autowired
    private CategoriesService categoriaservicio;

    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/listarcategorias")
    public String listarcategorias(Model model) {
        List<Categories> categorias = categoriaservicio.listar();
        model.addAttribute("categorias", categorias);
        return "categorias";
    }

}

