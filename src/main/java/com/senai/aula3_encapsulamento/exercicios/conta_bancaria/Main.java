package com.senai.aula3_encapsulamento.exercicios.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Joel" , 2000);
        BankAccount bankAccount2 = new BankAccount("Eliseu", -15);

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);

        System.out.println("--------teste depositar--------");

        bankAccount1.Depositar(10);
        bankAccount2.Depositar(20);

        System.out.println("--------teste sacar-----------");

        bankAccount1.Sacar(10);
        bankAccount2.Sacar(10);



    }
}
