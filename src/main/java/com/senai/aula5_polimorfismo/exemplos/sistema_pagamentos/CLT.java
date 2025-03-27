package com.senai.aula5_polimorfismo.exemplos.sistema_pagamentos;

public class CLT extends Pagamentos {
    private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularpagamento() {
        return salario;
    }
}

