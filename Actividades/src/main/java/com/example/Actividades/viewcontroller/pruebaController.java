package com.example.Actividades.viewcontroller;

import com.example.Actividades.Logica.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class pruebaController {
    @RequestMapping("/index")
    String inicio(){
        return "index";
    }

    @RequestMapping("/usuario/{name}")
    String usuario(Model model, @PathVariable String name){
        model.addAttribute("name",name);
        return "index";
    }

    @RequestMapping("/formulario")
    String formulario(){
        return "formulario";
    }

    @PostMapping("/datos")
    String datos(Usuario usuario, Model model){
        System.out.println(usuario);
        model.addAttribute("usuario",usuario);
        return "datos";
    }
}
