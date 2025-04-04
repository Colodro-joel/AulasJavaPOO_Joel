package com.senai.aula6_Abstração.exemplos_classe_abstrata.conta_bancaria;

public class ContaPoupança extends ContaBancaria{

    public ContaPoupança(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }
}
