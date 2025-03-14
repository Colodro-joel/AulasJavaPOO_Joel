package com.senai.aula4_herança.exemplos.preenchimento_conta_bancária;

public class Conta_Bancária {
    protected String titular;
    protected double saldo;

    public Conta_Bancária(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

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

    public void Depositar(double valor){
        if (valor>0){
            saldo+=valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void exibirsaldo() {
        System.out.printf("Titular: , Saldo: R$%f",titular,saldo);
    }
}
