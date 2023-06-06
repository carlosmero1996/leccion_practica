/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Socios;
import com.tendencias.app.Usuarios.repository.Sociorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class SocioServiceImpl extends GenericServiceImpl<Socios, Integer> implements GenericService<Socios, Integer>{

    @Autowired
    Sociorepository socioRepository;

    @Override
    public CrudRepository<Socios, Integer> getDao() {
        return socioRepository;
    }

   
    
}
