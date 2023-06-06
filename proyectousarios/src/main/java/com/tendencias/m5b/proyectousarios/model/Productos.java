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
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int idproducto;

    @NotBlank(message = "Alerta  nombre vacio")
    private String nombre;

    @NotBlank(message = "Alerta  categoria vacio")
    private String categoria;

    @NotBlank(message = "Alerta precio emprendedor vacio")
    private double precio_emprendedor;

    @NotBlank(message = "Alerta descripcion vacia")
    private String descripcion;

    @NotBlank(message = "Alerta  imagen vacia")
    private String[] imagen;

    @NotBlank(message = "Alerta cantidad vacia")
    private int cantidadDisponible;

    @OneToMany(mappedBy = "producto")
    private List<Compra> compras;

}
