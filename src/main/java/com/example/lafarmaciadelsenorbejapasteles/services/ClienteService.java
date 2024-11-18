package com.example.lafarmaciadelsenorbejapasteles.services;

import com.example.lafarmaciadelsenorbejapasteles.dao.IClienteDAO;
import com.example.lafarmaciadelsenorbejapasteles.modelentity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        clienteDAO.deleteById(id);
    }

    public Cliente update(Cliente cliente) {
        return clienteDAO.save(cliente);
    }
}
