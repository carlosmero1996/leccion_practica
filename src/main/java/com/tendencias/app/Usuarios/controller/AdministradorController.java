/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.controller;

import com.tendencias.app.Usuarios.model.Administradores;
import com.tendencias.app.Usuarios.service.AdministradorServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlos
 */
@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    
    @Autowired
    AdministradorServiceImpl administradorService;

    @Operation(summary = "Se obtiene la lista de administradores")
    @GetMapping("/listar")
    public ResponseEntity<List<Administradores>> listaAdminstrador() {
        return new ResponseEntity<>(administradorService.findByAll(), HttpStatus.OK);
    }
    
    @Operation(summary = "Debe enviar los campos del administrador")
    @PostMapping("/crear")
    public ResponseEntity<Administradores> crearAdministrador(@RequestBody Administradores u) {
        return new ResponseEntity<>(administradorService.save(u), HttpStatus.CREATED);
    }
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Administradores> actualizarAdministradores(@PathVariable Integer id, @RequestBody Administradores u) {
        Administradores usuario = administradorService.findById(id);
        if (usuario != null) {
            try {
                usuario.setNombre(u.getNombre());
                usuario.setPersona(u.getPersona());
                
                return new ResponseEntity<>(administradorService.save(usuario), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
       @DeleteMapping("/delete/{id}")
    public ResponseEntity<Administradores> elimiarAdministrador(@PathVariable Integer id) {
        administradorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
