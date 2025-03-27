package com.senai.aula5_polimorfismo.exemplos.sistema_pagamentos;

public class freelancers extends Pagamentos{
    private double valorprojeto;

    public freelancers(String nome, double valorprojeto) {
        super(nome);
        this.valorprojeto = valorprojeto;
    }

    @Override
    public double calcularpagamento() {
        return valorprojeto;
    }
}
