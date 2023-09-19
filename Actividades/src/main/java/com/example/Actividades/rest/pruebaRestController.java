package com.example.Actividades.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaRestController {
    @GetMapping("/")
    String holaMundo(){
        return "Hola Mundo!";
    }

    @GetMapping("/param/{numero}")
    String mostrarNumero(@PathVariable String numero){
        return "Has enviado " + numero;
    }
}
