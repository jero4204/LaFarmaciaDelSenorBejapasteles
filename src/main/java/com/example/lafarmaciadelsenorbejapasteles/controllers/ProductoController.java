package com.example.lafarmaciadelsenorbejapasteles.controllers;

import com.example.lafarmaciadelsenorbejapasteles.modelentity.Cliente;
import com.example.lafarmaciadelsenorbejapasteles.modelentity.Producto;
import com.example.lafarmaciadelsenorbejapasteles.services.ProductoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService=productoService;
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        Producto producto = productoService.findById(id);
        return producto;
    }

    @PostMapping
    public Producto postProducto(@Valid @RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PutMapping("/{id}")
    public Producto putProducto(@Valid @RequestBody Producto producto, @PathVariable Long id) {
        Producto productoEncontrado = productoService.findById(id);
        if(productoEncontrado==null) {
            throw new RuntimeException("Producto no encontrado");
        }
        productoEncontrado.setNombre(producto.getNombre());
        productoEncontrado.setDescripcion(producto.getDescripcion());
        productoEncontrado.setPrecio(producto.getPrecio());
        productoEncontrado.setCantidadStock(producto.getCantidadStock());
        return productoService.update(productoEncontrado);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productoService.deleteById(id);
    }
}
