package com.example.reto.repositories;

import com.example.reto.models.Estudiante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepositorioEstudiante {
    private List<Estudiante> estudiantes;

    // Constructor: Inicializa la lista y agrega 10 estudiantes dummy
    public RepositorioEstudiante() {
        this.estudiantes = new ArrayList<>();
        cargarEstudiantes();
    }

    // Método para agregar estudiantes dummy
    private void cargarEstudiantes() {
        estudiantes.add(new Estudiante(
                "Juan Pérez", "3001234567", "juan.perez@example.com",
                1, 4.2, Arrays.asList("Matemáticas", "Física"), Arrays.asList("Seminario 1")));
        estudiantes.add(new Estudiante(
                "Ana Gómez", "3017654321", "ana.gomez@example.com",
                2, 4.0, Arrays.asList("Historia", "Filosofía"), Arrays.asList("Seminario 2")));
        estudiantes.add(new Estudiante(
                "Carlos Ruiz", "3029876543", "carlos.ruiz@example.com",
                3, 3.8, Arrays.asList("Química", "Biología"), Arrays.asList("Seminario 3")));
        estudiantes.add(new Estudiante(
                "Sofía Martínez", "3101234567", "sofia.martinez@example.com",
                4, 4.5, Arrays.asList("Literatura", "Arte"), Arrays.asList("Seminario 4")));
        estudiantes.add(new Estudiante(
                "Luis Torres", "3112345678", "luis.torres@example.com",
                5, 3.9, Arrays.asList("Cálculo", "Estadística"), Arrays.asList("Seminario 5")));
        estudiantes.add(new Estudiante(
                "María López", "3123456789", "maria.lopez@example.com",
                6, 4.3, Arrays.asList("Física", "Programación"), Arrays.asList("Seminario 6")));
        estudiantes.add(new Estudiante(
                "Pedro Jiménez", "3134567890", "pedro.jimenez@example.com",
                7, 3.7, Arrays.asList("Economía", "Contabilidad"), Arrays.asList("Seminario 7")));
        estudiantes.add(new Estudiante(
                "Lucía Ramírez", "3209876543", "lucia.ramirez@example.com",
                8, 4.1, Arrays.asList("Ética", "Psicología"), Arrays.asList("Seminario 8")));
        estudiantes.add(new Estudiante(
                "Andrés Cárdenas", "3212345678", "andres.cardenas@example.com",
                9, 3.6, Arrays.asList("Derecho", "Administración"), Arrays.asList("Seminario 9")));
        estudiantes.add(new Estudiante(
                "Laura Vega", "3223456789", "laura.vega@example.com",
                10, 4.6, Arrays.asList("Arquitectura", "Diseño"), Arrays.asList("Seminario 10")));
    }

    // Método para obtener todos los estudiantes
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
