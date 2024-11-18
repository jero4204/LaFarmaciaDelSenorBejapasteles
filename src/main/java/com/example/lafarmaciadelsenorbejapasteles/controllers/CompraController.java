package com.example.lafarmaciadelsenorbejapasteles.controllers;


import com.example.lafarmaciadelsenorbejapasteles.modelentity.Compra;
import com.example.lafarmaciadelsenorbejapasteles.services.CompraService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {
    private final CompraService compraService;
    public CompraController(CompraService compraService) {
        this.compraService=compraService;
    }

    @GetMapping
    public List<Compra> getAllCompras() {
        return compraService.findAll();
    }

    @GetMapping("/{id}")
    public Compra getCompraById(@PathVariable Long id) {
        Compra compra = compraService.findById(id);
        return compra;
    }

    @PostMapping
    public Compra postCompra(@Valid @RequestBody Compra compra) {
        return compraService.save(compra);
    }

    @PutMapping("/{id}")
    public Compra putCompra(@Valid @RequestBody Compra compra, @PathVariable Long id) {
        Compra compraEncontrada = compraService.findById(id);
        if(compraEncontrada==null) {
            throw new RuntimeException("Compra no encontrada");
        }
        compraEncontrada.setFecha(compra.getFecha());
        compraEncontrada.setCantidad(compra.getCantidad());
        compraEncontrada.setProducto(compra.getProducto());
        compraEncontrada.setCliente(compra.getCliente());
        return compraService.update(compraEncontrada);
    }

    @DeleteMapping("/{id}")
    public void deleteCompra(@PathVariable Long id) {
        compraService.deleteById(id);
    }
}
