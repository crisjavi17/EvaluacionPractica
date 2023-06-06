/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author LENOVO
 */
@Data
@Entity
public class Persona {
    
    //id, nombre, apellido, correo, cedula, direccion, fecha_nac, instruccion, celular
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona")
    private int idPersona;
    
    @NotBlank(message="Alerta nombre vacio")
    private String nombre;
    
    @NotBlank(message="Alerta apellido vacio")
    private String apellido;
    
    @NotBlank(message="Alerta direccion vacia")
    private String direccion;
    
    @NotBlank(message="Alerta telefono vacio")
    private String telefono;
    
    @NotBlank(message="Alerta correo vacio")
    private String correo;
    
    @NotBlank(message="Alerta contraseña vacia")
    private String contraseña;
    
    
    
}
