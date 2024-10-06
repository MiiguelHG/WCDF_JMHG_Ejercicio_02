package com.upiiz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/proveedores")
public class ProveedoresController {

    // Obtener todos los proveedores - GET
    @GetMapping
    public String listarProveedores() {
        return "Listado de todos los Proveedores - GET";
    }

    // Obtener un proveedor por id - GET
    @GetMapping("/{id}")
    public String getProveedorPorId(@PathVariable int id) {
        return "Obtener un Proveedor por ID - GET: " + id;
    }

    // Agregar un proveedor - POST
    @PostMapping
    public String agregarProveedor(@RequestBody String proveedor) {
        return "Agregar un Proveedor - POST: " + proveedor;
    }

    // Actualizar un proveedor - PUT
    @PutMapping("/{id}")
    public String actualizarProveedor(@RequestBody String proveedor, @PathVariable int id) {
        return "Actualizar un Proveedor - PUT: " + proveedor + " con id " + id;
    }

    // Eliminar un proveedor - DELETE
    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable int id) {
        return "Eliminar un Proveedor - DELETE: " + id;
    }
}
