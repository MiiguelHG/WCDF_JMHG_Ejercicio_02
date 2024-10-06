package com.upiiz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facturas/{facturaID}/productos/{productoID}/ventas")
public class VentasController {
    @GetMapping
    public String listarVentas(@PathVariable int facturaID, @PathVariable int productoID) {
        return "Listado de todas las ventas de las facturas con ID: " + facturaID + " y productos con ID: " + productoID + " - GET";
    }

    @GetMapping("/{id}")
    public String getVentas(@PathVariable int id, @PathVariable int productoID, @PathVariable int facturaID) {
        return "Obtener una venta por ID - GET: " + id + " de la factura con ID: " + facturaID +" y productos con ID: " + productoID;
    }

    @PostMapping
    public String addVenta(@RequestBody String venta, @PathVariable int facturaID, @PathVariable int productoID) {
        return "Agregar una venta - POST: " + venta + " de la factura con ID: " + facturaID +" y productos con ID: " + productoID;
    }

    @PutMapping("/{id}")
    public String editVenta(@RequestBody String venta, @PathVariable int id, @PathVariable int productoID, @PathVariable int facturaID) {
        return "Actualizar una venta: "+ venta + " por ID - PUT: " + id + " de la factura con ID: " + facturaID +" y productos con ID: " + productoID;
    }

    @DeleteMapping("/{id}")
    public String deleteVenta(@PathVariable int id, @PathVariable int facturaID, @PathVariable int productoID) {
        return "Eliminar una venta por ID - DELETE: " + id + " de la factura con ID: " + facturaID +" y productos con ID: " + productoID;
    }
}
