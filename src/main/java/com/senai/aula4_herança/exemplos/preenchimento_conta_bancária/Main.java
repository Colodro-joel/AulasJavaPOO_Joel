package com.senai.aula4_herança.exemplos.preenchimento_conta_bancária;

public class Main {
    public void main(String[] args) {
        Conta_Corrente contaCorrente1 = new Conta_Corrente("Joel",200,3000);
        Conta_Poupança contapoupança1 = new Conta_Poupança("Joel", 6000, 10);

        contapoupança1.exibirsaldo();
        contaCorrente1.exibirsaldo();

        System.out.println("-----teste Conta Corrente-----");
        contaCorrente1.Sacar(10);
        contaCorrente1.Sacar(15);
        contaCorrente1.Sacar(20);

        System.out.println("-----teste Conta Poupança-----");
        contapoupança1.aplicarrendimento();
        System.out.println("------------------------------");

        contaCorrente1.exibirsaldo();
        contapoupança1.exibirsaldo();


    }
}
