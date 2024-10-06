package com.upiiz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {

    // Respuesta para todos los clientes - GET
    @GetMapping
    public String listarClientes() {
        return "Listado de todos los Clientes - GET";
    }

    // Respuesta para un cliente por id - GET
    @GetMapping("/{id}")
    public String getClientePorId(@PathVariable int id) {
        return "Obtener un Cliente por ID - GET: " + id;
    }

    // Agregar un cliente - POST
    @PostMapping
    public String agregarCliente(@RequestBody String cliente) {
        return "Agregar un Cliente - POST: " + cliente;
    }

    // Actualizar un cliente - PUT
    @PutMapping("/{id}")
    public String actualizarCliente(@RequestBody String cliente, @PathVariable int id) {
        return "Actualizar un Cliente - PUT: " + cliente + " con id " + id;
    }

    // Eliminar un cliente - DELETE
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id) {
        return "Eliminar un Cliente - DELETE: " + id;
    }
}

