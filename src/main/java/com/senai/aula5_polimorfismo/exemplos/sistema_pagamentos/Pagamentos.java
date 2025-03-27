package com.senai.aula5_polimorfismo.exemplos.sistema_pagamentos;

public class Pagamentos {
    String nome;

    public Pagamentos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularpagamento() {
        return 0.0;
    }
}
