/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.Data;

/**
 *
 * @author carlos
 */
@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;

    @Size(min = 3, max = 10, message = "El usuario debe tener entre 3 y 10 caracteres")
    @NotBlank(message = "El usuario no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;

    @Size(min = 5, max = 50, message = "El usuario debe tener entre 5 y 50 caracteres")
    @NotBlank(message = "la descripcion no puede estar en blanco")
    @Column(name = "descripcion")
    private String descripcion;

    @NotBlank(message = "La categoria no puede estar en blanco")
    @Column(name = "categoria")
    private String categoria;

    @NotBlank(message = "el precio no puede estar en blanco")
    @Column(name = "precio_emprendedor")
    private double precio_emprendedor;

    @NotBlank(message = "Los atributos no puede estar en blanco")
    @Column(name = "atributos_adicionales")
    private double atributos_adicionales;

   
   @ManyToOne
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    private Proveedores provee;
    
    

}
