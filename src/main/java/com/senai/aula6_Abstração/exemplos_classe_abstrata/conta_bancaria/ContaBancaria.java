package com.senai.aula6_Abstração.exemplos_classe_abstrata.conta_bancaria;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        if(saldo>=0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo inválido! O saldo inicial não pode ser negativo");
        }
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

    public void depositar(double valor) {
        if(valor > 0){

        }
    }
}
