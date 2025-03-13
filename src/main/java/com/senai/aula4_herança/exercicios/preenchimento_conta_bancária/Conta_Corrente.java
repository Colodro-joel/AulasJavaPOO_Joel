package com.senai.aula4_herança.exercicios.preenchimento_conta_bancária;

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

    @Override
    public void Sacar(double valor){
        if(valor<=saldo && valor>0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso na conta de de:"+getTitular()+" com o saldo de: R$"+getSaldo());
            return true;
        } else {
            System.out.println("SAQUE INVALIDO");
            return false;
        }
    }
}
