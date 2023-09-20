package com.example.Actividades.Logica;

public class Usuario {
    public String nombre;
    public String edad;

    public Usuario(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

}
