package com.market.projectmarket.persistence.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "celular")
    private Integer celular;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;
}
