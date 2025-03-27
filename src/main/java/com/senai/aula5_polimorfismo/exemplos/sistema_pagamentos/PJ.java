package com.senai.aula5_polimorfismo.exemplos.sistema_pagamentos;

public class PJ extends Pagamentos{
    private double ValorHora;
    private double HorasTrabalhadas;

    public PJ(String nome, double valorHora, double horasTrabalhadas) {
        super(nome);
        ValorHora = valorHora;
        HorasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularpagamento() {
        return HorasTrabalhadas*ValorHora;
    }
}
