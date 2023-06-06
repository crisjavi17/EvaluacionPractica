/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5b.proyectousarios.controller;

import com.tendencias.m5b.proyectousarios.model.Productos;
import com.tendencias.m5b.proyectousarios.service.ServicioProductosImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author LENOVO
 */
public class ProductoController {
       @Autowired
       ServicioProductosImpl perSer;

    @Operation(summary = "Se obtiene la lista de productos")
    @GetMapping("/listar")
    public ResponseEntity<List<Productos>> listPro() {

        return new ResponseEntity<>(perSer.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos roducto")
    @PostMapping("/crear")
    public ResponseEntity<Productos> crearPersona(@RequestBody Productos p) {
        return new ResponseEntity<>(perSer.save(p), HttpStatus.CREATED);
    }

    @PutMapping("/actulizar/{id}")
    public ResponseEntity<Productos> actualizarPersona(@PathVariable Integer id, @RequestBody Productos p) {
        Productos per = perSer.findById(id);

        if (per != null) {
            per.setNombre(p.getNombre());
            per(p.());
            per.setDireccion(p.getDireccion());
            per.setCorreo(p.getCorreo());
            per.setTelefono(p.getTelefono());
            per.setContraseña(p.getContraseña());


            return new ResponseEntity<>(perSer.save(per), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<Productos> eliminarPersona(@PathVariable Integer id) {
        perSer.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
