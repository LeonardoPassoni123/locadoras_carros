package com.locadora.model;


import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dataInicio;

    @NotNull
    @Column(name = "data_retorno")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dataRetorno;

    @Column(name = "valorTotal")
    private BigDecimal valorTotal;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private LocacaoStatus status;

}
