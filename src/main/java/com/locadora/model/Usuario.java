package com.locadora.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

}
