package com.Practica.Practica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Getter @Setter @Column(name="id") @Id
    private long id;
    @Getter @Setter @Column(name="Nombre")
    private String Nombre;
    @Getter @Setter @Column(name="Apellido")
    private String Apellido;

    @Getter @Setter @Column(name="Ciudad")
    private String Ciudad;
    @Getter @Setter @Column(name="Telefono")
    private String Telefono;
    @Getter @Setter @Column(name="Email")
    private String Email;
    @Getter @Setter @Column(name="password")
    private String Password;


}
