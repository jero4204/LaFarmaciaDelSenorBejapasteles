package com.example.lafarmaciadelsenorbejapasteles.services;

import com.example.lafarmaciadelsenorbejapasteles.dao.ICompraDAO;
import com.example.lafarmaciadelsenorbejapasteles.modelentity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompraService implements ICompraService{
    @Autowired
    private ICompraDAO compraDAO;

    @Override
    public List<Compra> findAll() {
        return compraDAO.findAll();
    }

    @Override
    public Compra save(Compra compra) {
        return compraDAO.save(compra);
    }

    @Override
    public Compra findById(Long id) {
        return compraDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        compraDAO.deleteById(id);
    }

    public Compra update(Compra compra) {
        return compraDAO.save(compra);
    }
}
