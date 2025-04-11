package com.senai.aula4_herança.exercicios.controle_estoque;

public class Alimento extends Produto {
    private double DatadeValidade;

    public Alimento(String nome, double valor, int quantidade, double datadeValidade) {
        super(nome, valor, quantidade);
        DatadeValidade = datadeValidade;
    }

    public double getDatadeValidade() {
        return DatadeValidade;
    }

    public void setDatadeValidade(double datadeValidade) {
        DatadeValidade = datadeValidade;
    }

    @Override
    public void ControleEstoque() {
        System.out.println("O produto vencerá em: "+DatadeValidade);
    }
}
