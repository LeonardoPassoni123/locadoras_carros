package com.locadora.model;


import com.locadora.model.helpers.LocacaoStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "locacao" )
@Data
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @NotNull
    @Column(name = "data_inicio")
    private Date dataInicio;

    @NotNull
    @Column(name = "data_retorno")
    private Date dateRetorno;

    @NotNull
    @Column(name = "num_cnh")
    private String cnh;

    @Column(name = "valorTotal")
    private BigDecimal valorTotal;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private LocacaoStatus status;

}
