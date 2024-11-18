package com.example.lafarmaciadelsenorbejapasteles.controllers;

import com.example.lafarmaciadelsenorbejapasteles.modelentity.Cliente;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import com.example.lafarmaciadelsenorbejapasteles.services.ClienteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService=clienteService;
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        Cliente cliente = clienteService.findById(id);
        return cliente;
    }

    @PostMapping
    public Cliente postCliente(@Valid @RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente putCliente(@Valid @RequestBody Cliente cliente, @PathVariable Long id) {
        Cliente clienteEncontrado = clienteService.findById(id);
        if(clienteEncontrado==null) {
            throw new RuntimeException("Cliente no encontrado");
        }
        clienteEncontrado.setNombre(cliente.getNombre());
        clienteEncontrado.setDireccion(cliente.getDireccion());
        clienteEncontrado.setEmail(cliente.getEmail());
        clienteEncontrado.setTelefono(cliente.getTelefono());
        return clienteService.update(clienteEncontrado);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
}
