/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Proveedores;
import com.tendencias.app.Usuarios.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class ProveedoresServiceImpl extends GenericServiceImpl<Proveedores, Integer> implements GenericService<Proveedores, Integer>{

    @Autowired
    ProveedorRepository proveedorRepository;

    @Override
    public CrudRepository<Proveedores, Integer> getDao() {
        return proveedorRepository;
    }
    
}
