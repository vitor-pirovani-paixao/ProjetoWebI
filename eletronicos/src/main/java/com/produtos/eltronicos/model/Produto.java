package com.produtos.eltronicos.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private BigDecimal preco;

    private Long qtdDisponivel;

}
