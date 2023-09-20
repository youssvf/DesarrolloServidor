package com.example.Actividades.viewcontroller;

import com.example.Actividades.Logica.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/suma/{x}/{y}")
    String resultado(@PathVariable Integer x, @PathVariable Integer y){
        return "sumas";
    }

    @RequestMapping("/arrays")
    String array(Model model){
        Usuario[] usuarios = new Usuario[3];

        Usuario u1 = new Usuario("Juan","23");
        Usuario u2 = new Usuario("Manolo","43");
        Usuario u3 = new Usuario("Pedro","45");

        usuarios[0] = u1;
        usuarios[1] = u2;
        usuarios[2] = u3;

        model.addAttribute("usuarios",usuarios);
        return "array";
    }

    @RequestMapping("/numeros")
    String numeros(Model model){

        Integer[] numeros = new Integer[5];
        numeros[0] = 2;
        numeros[1] = 1;
        numeros[2] = 5;
        numeros[3] = 19;
        numeros[4] = 8;

        model.addAttribute("numeros",numeros);

        return "numeros";
    }


}
