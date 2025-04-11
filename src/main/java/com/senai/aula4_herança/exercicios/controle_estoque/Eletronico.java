package com.senai.aula4_herança.exercicios.controle_estoque;

public class Eletronico extends Produto {
    private double Voltagem;

    public Eletronico(String nome, double valor, int quantidade, double voltagem) {
        super(nome, valor, quantidade);
        Voltagem = voltagem;
    }

    public double getVoltagem() {
        return Voltagem;
    }

    public void setVoltagem(double voltagem) {
        Voltagem = voltagem;
    }

    @Override
    public void ControleEstoque() {
        System.out.println("A voltagem do produto é: "+Voltagem);
    }
}
