package com.senai.aula4_herança.exercicios.controle_estoque;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta",50.90,25);
        Produto produto2 = new Alimento("Bolinho",4.50,230,26.09);
        Produto produto3 = new Eletronico("Samsung Galaxy A", 1200, 90,220);

        produto1.ControleEstoque();
        produto2.ControleEstoque();
        produto3.ControleEstoque();

    }
}
