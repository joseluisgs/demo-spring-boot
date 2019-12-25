package com.example.demorest.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    // Punto de entrada
    @RequestMapping("/hola")
    public String sayHello(@RequestParam(value = "nombre") String nombre){
        return "Hola " + nombre +"!";
    }

    @RequestMapping("/")
    public String saludo(){
        return "Hola, prueba a poner en el navegador http://localhost:8080/hola?nombre=2dam";
    }
}
