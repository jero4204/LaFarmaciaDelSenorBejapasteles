package com.example.lafarmaciadelsenorbejapasteles.services;

import com.example.lafarmaciadelsenorbejapasteles.modelentity.Producto;
import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto save(Producto producto);
    public Producto findById(Long id);
    public void deleteById(Long id);
}
