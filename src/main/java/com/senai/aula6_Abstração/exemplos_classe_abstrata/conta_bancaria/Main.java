package com.senai.aula6_Abstração.exemplos_classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente());
        testarContas(new ContaCorrente());
    }

    private void testarConta(ContaBancaria ContaBancaria){
        System.out.println("-------testando conta do cliente: %s ----------\n",contaBancaria.titular);
        ContaBancaria.exibirSaldo();
        ContaBancaria.AplicarTaxaMensal();
        ContaBancaria.exibirSaldo();

    }
}
