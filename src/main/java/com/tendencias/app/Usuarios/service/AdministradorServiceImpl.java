/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Administradores;
import com.tendencias.app.Usuarios.repository.Administradorrepository;
import com.tendencias.app.Usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class AdministradorServiceImpl extends GenericServiceImpl<Administradores, Integer> implements GenericService<Administradores, Integer>{
    
    
    @Autowired
    Administradorrepository administradorrepository;

    @Override
    public CrudRepository<Administradores, Integer> getDao() {
        return administradorrepository;
    }
}
