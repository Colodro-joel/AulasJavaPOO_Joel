package com.senai.aula4_herança.exemplos.preenchimento_conta_bancária;

public class Conta_Corrente extends Conta_Bancária {
    private double limite;

    public Conta_Corrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getsaldo() {
        return saldo;
    }

    public double setsaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public boolean Sacar(double valor){
        if(valor <= valor + limite){
            valor -= valor;
            System.out.println("Saque realizado com sucesso na conta de de:"+titular+" com o saldo de: R$"+saldo);
            return true;
        } else {
            System.out.println("SAQUE INVALIDO");
            return false;
        }
    }
}


