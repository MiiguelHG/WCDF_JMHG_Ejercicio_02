package com.upiiz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriasController {
    // Respuesta para todas las categorias - GET
    @GetMapping
    public String listarCategorias(){
        return "Listado de todas las Categorias - GET";
    }

    // Respuesta para una categoria por id - GET
    @GetMapping("/{id}")
    public  String getCategoriaPorId(@PathVariable int id){
        return "Obtener una Categoria por ID - GET: " + id;
    }

    // Agregar una categoria - POST
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar una Categoria - POST" + categoria;
    }

    // Actualizar una categoria - PUT
    @PutMapping("/{id}")
    public String actualizarCategoria(@RequestBody String categoria, @PathVariable int id){
        return "Actualizar una Categoria - PUT" + categoria + "con id" + id;
    }

    // Eliminar una categoria - DELETE
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id){
        return "Eliminar una Categoria - DELETE: " + id;
    }

}
