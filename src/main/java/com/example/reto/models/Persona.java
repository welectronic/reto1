package com.example.reto.models;

public class Persona {
    private String nombre;
    private String numeroCelular;
    private String correoElectronico;

    // Constructor
    public Persona(String nombre, String numeroCelular, String correoElectronico) {
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
    }

    // Métodos
    public void comprarPaseEstacionamiento() {
        System.out.println(nombre + " ha comprado un pase de estacionamiento.");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
