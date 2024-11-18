package com.example.lafarmaciadelsenorbejapasteles.dao;

import com.example.lafarmaciadelsenorbejapasteles.modelentity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDAO extends JpaRepository<Producto, Long>{

}
