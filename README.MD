# Reto Práctico 1 - Spring Boot con Maven

Este proyecto es el resultado de un reto práctico para implementar una aplicación utilizando **Spring Boot** y **Java**, siguiendo las especificaciones del diagrama UML y las tareas asignadas. Incluye la construcción de clases, servicios REST y funcionalidad para gestionar estudiantes.

---

## **Descripción del Reto**

### **Objetivo**

- **Estructuras de clases en Java**.
- **Implementación de un proyecto Maven con Spring Boot**.
- **Gestión de colecciones Java**.
- **Construcción de servicios REST**.

### **Puntos del Reto**

1. Construir las clases Java según el diagrama UML: `Persona`, `Direccion`, `Estudiante` y `Profesor`.
2. Implementar los constructores de cada clase.
3. Crear un repositorio para gestionar estudiantes y cargar 10 estudiantes con datos dummy.
4. Construir servicios REST para:
   - Listar todos los estudiantes.
   - Filtrar estudiantes por nombre.
   - Filtrar estudiantes por número de celular.
   - Ordenar estudiantes por promedio de notas.

---

## **Diagrama UML**

El diseño del proyecto se basa en el siguiente diagrama UML:

![Diagrama UML](/docs/diagrama.puml)  

---

## **Endpoints REST Implementados**

### **Base URL**

```http://localhost:8080/api/estudiantes```

### **1. Listar todos los estudiantes**

- **Endpoint**: `/`
- **Método HTTP**: `GET`
- **Descripción**: Devuelve una lista con todos los estudiantes.
- **Ejemplo de Respuesta**:

```json
[
  {
    "nombre": "Juan Pérez",
    "numeroCelular": "3001234567",
    "correoElectronico": "juan.perez@example.com",
    "numeroEstudiante": 1,
    "promedioNotas": 4.2,
    "listadoAsignaturas": ["Matemáticas", "Física"],
    "seminariosTomados": ["Seminario 1"]
  }
]
```

---

### **2. Filtrar estudiantes por nombre**

- **Endpoint**: `/filtrar/nombre`
- **Método HTTP**: `GET`
- **Parámetro**: `nombre` (String).
- **Descripción**: Filtra los estudiantes cuyo nombre coincida (no distingue mayúsculas).
- **Ejemplo de Uso**:
```GET /filtrar/nombre?nombre=Juan Pérez```

---

### **3. Filtrar estudiantes por número de celular**

- **Endpoint**: `/filtrar/celular`
- **Método HTTP**: `GET`
- **Parámetro**: `celular` (String).
- **Descripción**: Filtra los estudiantes por número de celular.
- **Ejemplo de Uso**:
```GET /filtrar/celular?celular=3001234567```

---

### **4. Ordenar estudiantes por promedio**

- **Endpoint**: `/ordenar/promedio`
- **Método HTTP**: `GET`
- **Descripción**: Ordena a los estudiantes de mayor a menor promedio.
- **Ejemplo de Respuesta**:

```json
[
  {
    "nombre": "Laura Vega",
    "promedioNotas": 4.6
  },
  {
    "nombre": "Juan Pérez",
    "promedioNotas": 4.2
  }
]
```

---

## **Instrucciones para Configuración y Ejecución**

### **Requisitos Previos**

- Java Development Kit (JDK) 17.
- Apache Maven 3.8.6 o superior.
- Editor de texto o IDE (recomendado: VS Code o IntelliJ IDEA).

### **Pasos para la Ejecución**

1. **Clonar el repositorio**:

   ```bash
   git clone <URL-DEL-REPOSITORIO>
   ```

2. **Instalar dependencias**:
   Ejecuta el siguiente comando para descargar todas las dependencias del proyecto:

   ```bash
   mvn install
   ```

3. **Ejecutar la aplicación**:
   Inicia el servidor Spring Boot con:

   ```bash
   mvn spring-boot:run
   ```

4. **Probar los endpoints**:
   Usa **Postman**, un navegador, o herramientas similares para probar los endpoints mencionados arriba.

---

## **Notas Importantes**

- Los datos iniciales de los estudiantes se generan automáticamente en `RepositorioEstudiante`.
- Este proyecto no incluye validaciones de datos en las clases modelo; sin embargo, estas pueden añadirse en futuros desarrollos.

---

## **Próximos Pasos**

- Añadir validaciones para los datos de entrada.
- Implementar una base de datos para persistir los estudiantes en lugar de usar datos en memoria.
- Crear una interfaz gráfica para interactuar con los servicios.
