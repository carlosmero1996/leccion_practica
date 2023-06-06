/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;

import com.tendencias.app.Usuarios.model.Administradores;
import com.tendencias.app.Usuarios.model.Persona;
import com.tendencias.app.Usuarios.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author carlos
 */
public interface ProveedorRepository   extends JpaRepository<Proveedores, Integer> {
    @Query(value = "Select * from nombre u where u.nombre = :nombre", nativeQuery = true)
    public Persona buscarProveedor(String nombre);
}
