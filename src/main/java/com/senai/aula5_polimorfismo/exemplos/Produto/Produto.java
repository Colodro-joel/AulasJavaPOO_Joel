package com.senai.aula5_polimorfismo.exemplos.Produto;

public class Produto {
    private String nome;
    private double preço;
    private int quantidade;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
}
