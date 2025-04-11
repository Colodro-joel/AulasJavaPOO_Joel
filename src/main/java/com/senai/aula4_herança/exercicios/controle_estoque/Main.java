package com.senai.aula4_herança.exercicios.controle_estoque;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Bolinho",4.50,230);
        Produto produto2 = new Produto("Samsung Galaxy A", 1200, 90);

        produto1.ControleEstoque();
        produto2.ControleEstoque();

    }
}
