package com.upiiz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias/{categoriaId}/proveedores/{proveedorId}/productos")
public class ProductosController {
    @GetMapping
    public String listarProductos(@PathVariable int categoriaId, @PathVariable int proveedorId) {
        return "Listado de todos los productos de la categoria con ID: " + categoriaId + " del proveedor con ID: " + proveedorId + " - GET";
    }

    @GetMapping("/{id}")
    public String getProductos(@PathVariable int id, @PathVariable int categoriaId, @PathVariable int proveedorId){
        return "Obtener un producto por ID - GET: " + id + " de la categoria con ID: " + categoriaId + " del proveedor con ID: " + proveedorId;
    }

    @PostMapping
    public String addProducto(@RequestBody String producto, @PathVariable int categoriaId, @PathVariable int proveedorId){
        return "Agregar un producto - POST: " + producto + " de la categoria con ID: " + categoriaId + " del proveedor con ID: " + proveedorId;
    }

    @PutMapping("/{id}")
    public String editProducto(@PathVariable int id, @RequestBody String producto, @PathVariable int categoriaId, @PathVariable int proveedorId){
        return "Actualizar un producto - PUT: " + producto + " con ID - " + id + " de la categoria con ID: " + categoriaId + " del proveedor con ID: " + proveedorId;
    }

    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable int id, @PathVariable int categoriaId, @PathVariable int proveedorId){
        return "Eliminar un producto por ID - DELETE: " + id + " de la categoria con ID: " + categoriaId + " del proveedor con ID: " + proveedorId;
    }
}
