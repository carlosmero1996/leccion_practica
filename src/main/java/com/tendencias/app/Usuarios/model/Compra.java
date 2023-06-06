/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author carlos
 */
@Data
@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private int id_compra;

    @NotBlank(message = "el precio no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;
    
    @NotBlank(message = "el precio no puede estar en blanco")
    @Column(name = "precio_emprendedor")
    private double precio_emprendedor;
    
    @NotBlank(message = "el precio no puede estar en blanco")
    @Column(name = "precio_pvp")
    private double precio_pvp;
    
    

}
