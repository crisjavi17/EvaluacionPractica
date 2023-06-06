/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.m5b.proyectousarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Venta {

    //id, nombre, apellido, correo, cedula, direccion, fecha_nac, instruccion, celular
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private int idventa;

    private Persona cliente;
    private Productos producto;
    @NotBlank(message = "Alerta cantidad vacio")

    private int cantidad;
    @NotBlank(message = "Alerta precio vacio")

    private double precio;
    @NotBlank(message = "Alerta fecha de venta vacio")

    private Date fechaVenta;

}
