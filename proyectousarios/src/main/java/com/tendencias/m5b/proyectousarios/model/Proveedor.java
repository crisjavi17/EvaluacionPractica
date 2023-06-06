/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5b.proyectousarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.List;
import lombok.Data;

/**
 *
 * @author LENOVO
 */
@Data
@Entity
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private int idProveedor;
    @NotBlank(message = "Alerta  nombre vacia")
    private String nombre;
    @NotBlank(message = "Alerta  direccion vacia")
    private String direccion;
    @NotBlank(message = "Alerta  telefono vacia")
    private String telefono;
    @NotBlank(message = "Alerta  correo vacia")
    private String correoElectronico;
    
    @OneToMany(mappedBy = "producto")
    private List<Compra> compras;


}
