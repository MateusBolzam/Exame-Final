package com.senai.ExameFinal.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private boolean aberto;

    public Pedidos() {
    }

    public Pedidos(Long id, String nome, double valor, boolean aberto) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.aberto = aberto;
    }


}
