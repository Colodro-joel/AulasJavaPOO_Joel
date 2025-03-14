package com.senai.aula4_herança.exemplos.preenchimento_conta_bancária;

public class Main {
    public void main(String[] args) {
        Conta_Corrente contaCorrente1 = new Conta_Corrente("Joel",200,3000);
        Conta_Poupança contapoupança1 = new Conta_Poupança("Joel", 6000, 10);

        Conta_Poupança.exibirsaldo();
        Conta_Corrente.saldo();

        System.out.println("-----teste Conta Corrente-----");
        Conta_Corrente.Sacar(200);
        Conta_Corrente.Sacar(100);
        Conta_Corrente.Sacar(10);

        System.out.println("-----teste Conta Poupança-----");
        Conta_Poupança.aplicarrendimento();
        System.out.println("------------------------------");

        Conta_Corrente.exibirsaldo();
        Conta_Poupança.exibirsaldo();


    }
}
