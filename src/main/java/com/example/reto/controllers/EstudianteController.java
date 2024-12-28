package com.example.reto.controllers;

import com.example.reto.models.Estudiante;
import com.example.reto.services.ServiceEstudiante;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {
    private final ServiceEstudiante service;

    public EstudianteController() {
        this.service = new ServiceEstudiante();
    }

    // 1. Endpoint para listar todos los estudiantes
    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return service.listarEstudiantes();
    }

    // 2. Endpoint para filtrar estudiantes por nombre
    @GetMapping("/filtrar/nombre")
    public List<Estudiante> filtrarPorNombre(@RequestParam String nombre) {
        return service.filtrarPorNombre(nombre);
    }

    // 3. Endpoint para filtrar estudiantes por celular
    @GetMapping("/filtrar/celular")
    public List<Estudiante> filtrarPorCelular(@RequestParam String celular) {
        return service.filtrarPorCelular(celular);
    }

    // 4. Endpoint para ordenar estudiantes por promedio
    @GetMapping("/ordenar/promedio")
    public List<Estudiante> ordenarPorPromedio() {
        return service.ordenarPorPromedio();
    }
}
