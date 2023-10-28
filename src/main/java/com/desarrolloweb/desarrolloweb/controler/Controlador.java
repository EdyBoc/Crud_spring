
package com.desarrolloweb.desarrolloweb.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.desarrolloweb.desarrolloweb.interfaceService.IpersonaService;
import com.desarrolloweb.desarrolloweb.modelo.Categories;
import com.desarrolloweb.desarrolloweb.modelo.Customers;
import com.desarrolloweb.desarrolloweb.modelo.Employees;
import com.desarrolloweb.desarrolloweb.modelo.Orderdetails;
import com.desarrolloweb.desarrolloweb.modelo.Persona;
import com.desarrolloweb.desarrolloweb.modelo.Shippers;
import com.desarrolloweb.desarrolloweb.service.CategoriesService;
import com.desarrolloweb.desarrolloweb.service.CustomersService;
import com.desarrolloweb.desarrolloweb.service.EmployeesService;
import com.desarrolloweb.desarrolloweb.service.OrdendetailsService;
import com.desarrolloweb.desarrolloweb.service.ShippersService;

@Controller
// @RequestMapping
public class Controlador {
    // Con el Autowired se hace una inyecccion de dependencia y con eso se pueden
    // usar todo los metos que contengan la clase

    @Autowired
    private CategoriesService categoriaservicio;

    @Autowired
    private IpersonaService service;

    @Autowired
    private EmployeesService empleadoservicio;

    @Autowired
    private CustomersService clientesservicio;

    @Autowired
    private OrdendetailsService ordendetailsservice;

    @Autowired
    private ShippersService proveedoreserivece;

    @GetMapping("/")
    public String menu() {
        return "menu";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    // listar catalogos
    @GetMapping("/listarcategoria")
    public String listarcategorias(Model model) {
        List<Categories> categorias = categoriaservicio.listar();
        model.addAttribute("categorias", categorias);
        return "categorias";
    }

    // Agregar categorias
    @PostMapping("/listarcategoria")
    public String agregarcategorias(Categories categories, Model model) {
        List<Categories> categorias = categoriaservicio.listar();
        model.addAttribute("categorias", categorias);
        categoriaservicio.save(categories);
        return "categorias";
    }

    // Mostrar Formulario
    @GetMapping("/formulariocategorias")
    public String formulariocategorias() {
        return "formulariocategorias";
    }

    // listar empleados
    @GetMapping("/listarempleados")
    public String listarempleados(Model model) {
        List<Employees> empleados = empleadoservicio.listar();
        model.addAttribute("empleados", empleados);
        return "empleados";
    }

    // Agregar categorias
    @PostMapping("/listarempleados")
    public String agregarempleados(Employees employees, Model model) {
        List<Employees> empleados = empleadoservicio.listar();
        model.addAttribute("empleados", empleados);
        empleadoservicio.save(employees);
        return "empleados";
    }

    // Mostrar Formulario
    @GetMapping("/formularioempleados")
    public String formularioempleados() {
        return "formularioempleados";
    }

    // listar clientes
    @GetMapping("/listadoclientes")
    public String listadoclientes(Model model) {
        List<Customers> clientes = clientesservicio.listar();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    // Agregar clientes
    @PostMapping("/listadoclientes")
    public String agregarcliente(Customers customers, Model model) {
        List<Customers> clientes = clientesservicio.listar();
        model.addAttribute("clientes", clientes);
        clientesservicio.save(customers);
        return "clientes";
    }

    // Mostrar clientes
    @GetMapping("/formularioclientes")
    public String formularioclientes() {
        return "formularioclientes";
    }

    // listar detalle de orden
    @GetMapping("/listadodetalleorden")
    public String listadodetalleorden(Model model) {
        List<Orderdetails> ordendetalles = ordendetailsservice.listar();
        model.addAttribute("ordendetalles", ordendetalles);
        return "ordendetalles";
    }

    // Agregar detalle de orden
    @PostMapping("/listadodetalleorden")
    public String agregardetalleorden(Orderdetails orderdetails, Model model) {
        List<Orderdetails> ordendetalles = ordendetailsservice.listar();
        model.addAttribute("ordendetalles", ordendetalles);
        ordendetailsservice.save(orderdetails);
        return "ordendetalles";
    }
    

    // Mostrar clientes
    @GetMapping("/formularioordendetalles")
    public String formularioordendetalles() {
        return "formularioordendetalles";
    }

    // listar proveedores
    @GetMapping("/listadodeproveedores")
    public String listadodeproveedores(Model model) {
        List<Shippers> proveedores = proveedoreserivece.listar();
        model.addAttribute("proveedores", proveedores);
        return "proveedores";
    }

    // Agregar proveedores
    @PostMapping("/listadodeproveedores")
    public String agregarproveedores(Shippers shippers, Model model) {
        List<Shippers> proveedores = proveedoreserivece.listar();
        model.addAttribute("proveedores", proveedores);
        proveedoreserivece.save(shippers);
        return "proveedores";
    }

    // Mostrar proveedores
    @GetMapping("/formularioproveedores")
    public String formularioproveedores() {
        return "formularioproveedores";
    }

     // Mostrar grafica proveedores
    @GetMapping("/grafica_cant_proveedores")
    public String grafica_cant_proveedores() {
        return "grafica_cant_proveedores";
    }

     // Mostrar grafica proveedores
    @GetMapping("/plantilla")
    public String plantilla() {
        return "plantilla";
    }

}

