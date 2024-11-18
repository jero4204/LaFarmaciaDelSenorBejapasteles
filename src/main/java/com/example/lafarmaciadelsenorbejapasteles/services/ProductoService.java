package com.example.lafarmaciadelsenorbejapasteles.services;

import com.example.lafarmaciadelsenorbejapasteles.dao.IProductoDAO;
import com.example.lafarmaciadelsenorbejapasteles.modelentity.Cliente;
import com.example.lafarmaciadelsenorbejapasteles.modelentity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public List<Producto> findAll() {
        return productoDAO.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoDAO.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        productoDAO.deleteById(id);
    }

    public Producto update(Producto producto) {
        return productoDAO.save(producto);
    }
}
