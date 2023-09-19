package com.example.Actividades.Logica;

public class Usuario {
    private String nombre;
    private String edad;

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
