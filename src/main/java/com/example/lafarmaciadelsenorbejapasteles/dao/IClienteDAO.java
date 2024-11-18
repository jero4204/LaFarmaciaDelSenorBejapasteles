package com.example.lafarmaciadelsenorbejapasteles.dao;

import com.example.lafarmaciadelsenorbejapasteles.modelentity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDAO extends JpaRepository<Cliente, Long>{

}
