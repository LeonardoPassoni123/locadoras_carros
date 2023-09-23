package com.locadora.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "carro")
@Data
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "ano")
    private String ano;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "placa")
    private String placa;

    @Column(name = "especificacoes",length = 2000 )
    private String especificacoes;

}
