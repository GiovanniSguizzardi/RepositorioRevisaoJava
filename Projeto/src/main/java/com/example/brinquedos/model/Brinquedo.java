package com.example.brinquedos.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@Entity
@Table(name="tds_tb_brinquedos")
public class Brinquedo implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "classificacao", nullable = false, length = 50)
    private String classificacao;

    @Column(name = "tamanho", nullable = false, length = 50)
    private String tamanho;

    @Column(name="preco", nullable = false, length = 10)
    private Double preco;
}