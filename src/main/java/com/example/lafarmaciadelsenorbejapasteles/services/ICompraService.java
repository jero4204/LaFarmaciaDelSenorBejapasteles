package com.example.lafarmaciadelsenorbejapasteles.services;

import com.example.lafarmaciadelsenorbejapasteles.modelentity.Compra;
import java.util.List;

public interface ICompraService {
    public List<Compra> findAll();
    public Compra save(Compra compra);
    public Compra findById(Long id);
    public void deleteById(Long id);
}
