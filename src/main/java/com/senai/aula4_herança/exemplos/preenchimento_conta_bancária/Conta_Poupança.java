package com.senai.aula4_herança.exemplos.preenchimento_conta_bancária;

public class Conta_Poupança extends Conta_Bancária {
    private double taxaderendimento;

    public Conta_Poupança(String titular, double saldo, double taxaderendimento) {
        super(titular, saldo);
        this.taxaderendimento = taxaderendimento;
    }

    public void aplicarrendimento() {
        saldo += (saldo * taxaderendimento)/100;
    }
}
