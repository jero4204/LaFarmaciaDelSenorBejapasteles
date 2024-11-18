package com.example.lafarmaciadelsenorbejapasteles.services;

import com.example.lafarmaciadelsenorbejapasteles.modelentity.Cliente;
import java.util.*;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente save(Cliente cliente);
    public Cliente findById(Long id);
    public void deleteById(Long id);
}
