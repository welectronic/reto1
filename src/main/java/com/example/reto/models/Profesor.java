package com.example.reto.models;

import java.util.List;

public class Profesor extends Persona {
    private double salario;
    private List<String> materiasDictadas;

    // Constructor
    public Profesor(String nombre, String numeroCelular, String correoElectronico, double salario,
                    List<String> materiasDictadas) {
        super(nombre, numeroCelular, correoElectronico);
        this.salario = salario;
        this.materiasDictadas = materiasDictadas;
    }

    // Getters y Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<String> getMateriasDictadas() {
        return materiasDictadas;
    }

    public void setMateriasDictadas(List<String> materiasDictadas) {
        this.materiasDictadas = materiasDictadas;
    }
}
