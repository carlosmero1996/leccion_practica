/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Compra;
import com.tendencias.app.Usuarios.repository.Comprarepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class CompraServiceImpl  extends GenericServiceImpl<Compra, Integer> implements GenericService<Compra, Integer> {

    @Autowired
     Comprarepository usuarioRepository;

    @Override
    public CrudRepository<Compra, Integer> getDao() {
        return usuarioRepository;
    }
    
    
}
