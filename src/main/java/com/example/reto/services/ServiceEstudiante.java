package com.example.reto.services;

import com.example.reto.models.Estudiante;
import com.example.reto.repositories.RepositorioEstudiante;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceEstudiante {
    private final RepositorioEstudiante repositorio;

    // Constructor: inicializa el repositorio
    public ServiceEstudiante() {
        this.repositorio = new RepositorioEstudiante();
    }

    // 1. Listar todos los estudiantes
    public List<Estudiante> listarEstudiantes() {
        return repositorio.getEstudiantes();
    }

    // 2. Filtrar estudiantes por nombre
    public List<Estudiante> filtrarPorNombre(String nombre) {
        return repositorio.getEstudiantes().stream()
                .filter(estudiante -> estudiante.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    // 3. Filtrar estudiantes por número de celular
    public List<Estudiante> filtrarPorCelular(String numeroCelular) {
        return repositorio.getEstudiantes().stream()
                .filter(estudiante -> estudiante.getNumeroCelular().equals(numeroCelular))
                .collect(Collectors.toList());
    }

    // 4. Ordenar estudiantes por promedio de notas
    public List<Estudiante> ordenarPorPromedio() {
        return repositorio.getEstudiantes().stream()
                .sorted((e1, e2) -> Double.compare(e2.getPromedioNotas(), e1.getPromedioNotas()))
                .collect(Collectors.toList());
    }
}
