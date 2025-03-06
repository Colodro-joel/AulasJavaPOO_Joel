package com.senai.aula3_encapsulamento.exercicios.conta_bancaria;

public class BankAccount {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public BankAccount(String titular, double saldo) {
        this.titular = titular;
        if (saldo>=0) {
            this.saldo = saldo;
        } else {
            System.out.println("Seu saldo não pode ser negativo");
            System.out.println("O saldo da conta iniciará em R$0.0");
        }
    }

    public void Depositar(double valor){
        if (valor<=saldo){
            saldo-=valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void Sacar(double valor){
        if (valor > 0) {
            saldo -=valor;
            System.out.println("sacado com sucesso!");
        } else if (saldo < 0) {
            System.out.println("Saldo insuficente!");
        }

    }


}
