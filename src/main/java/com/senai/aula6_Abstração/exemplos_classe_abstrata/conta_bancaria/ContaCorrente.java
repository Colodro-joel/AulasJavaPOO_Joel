package com.senai.aula6_Abstração.exemplos_classe_abstrata.conta_bancaria;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void AplicarTaxaMensal() {
        saldo+=20;
    }
}
