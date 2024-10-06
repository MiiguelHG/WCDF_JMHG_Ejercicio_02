package com.upiiz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes/{clienteId}/facturas")
public class FacturasController {

    // Obtener todas las facturas de un cliente - GET
    @GetMapping
    public String listarFacturasPorCliente(@PathVariable int clienteId) {
        return "Listado de todas las facturas del Cliente con ID: " + clienteId + " - GET";
    }

    // Obtener una factura específica de un cliente - GET
    @GetMapping("/{facturaId}")
    public String getFacturaPorId(@PathVariable int clienteId, @PathVariable int facturaId) {
        return "Obtener la factura con ID: " + facturaId + " del Cliente con ID: " + clienteId + " - GET";
    }

    // Agregar una factura para un cliente - POST
    @PostMapping
    public String agregarFactura(@PathVariable int clienteId, @RequestBody String factura) {
        return "Agregar una factura para el Cliente con ID: " + clienteId + " - POST: " + factura;
    }

    // Actualizar una factura específica de un cliente - PUT
    @PutMapping("/{facturaId}")
    public String actualizarFactura(@PathVariable int clienteId, @PathVariable int facturaId, @RequestBody String factura) {
        return "Actualizar la factura con ID: " + facturaId + " del Cliente con ID: " + clienteId + " - PUT: " + factura;
    }

    // Eliminar una factura específica de un cliente - DELETE
    @DeleteMapping("/{facturaId}")
    public String eliminarFactura(@PathVariable int clienteId, @PathVariable int facturaId) {
        return "Eliminar la factura con ID: " + facturaId + " del Cliente con ID: " + clienteId + " - DELETE";
    }
}
