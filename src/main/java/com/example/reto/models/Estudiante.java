package com.example.reto.models;

import java.util.List;

public class Estudiante extends Persona {
    private int numeroEstudiante;
    private double promedioNotas;
    private List<String> listadoAsignaturas;
    private List<String> seminariosTomados;

    // Constructor
    public Estudiante(String nombre, String numeroCelular, String correoElectronico, int numeroEstudiante,
                      double promedioNotas, List<String> listadoAsignaturas, List<String> seminariosTomados) {
        super(nombre, numeroCelular, correoElectronico);
        this.numeroEstudiante = numeroEstudiante;
        this.promedioNotas = promedioNotas;
        this.listadoAsignaturas = listadoAsignaturas;
        this.seminariosTomados = seminariosTomados;
    }

    // Getters y Setters
    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public List<String> getListadoAsignaturas() {
        return listadoAsignaturas;
    }

    public void setListadoAsignaturas(List<String> listadoAsignaturas) {
        this.listadoAsignaturas = listadoAsignaturas;
    }

    public List<String> getSeminariosTomados() {
        return seminariosTomados;
    }

    public void setSeminariosTomados(List<String> seminariosTomados) {
        this.seminariosTomados = seminariosTomados;
    }
}
