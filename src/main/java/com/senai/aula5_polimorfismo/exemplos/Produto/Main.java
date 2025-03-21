package com.senai.aula5_polimorfismo.exemplos.Produto;


public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Farinha", 5.00, 50);
        Produto produto2 = new Produto("Leite", 5.00, 100);
        Produto produto3 = new Produto("Café", 20.00, 50);
        Produto produto4 = new Produto("AZUL", 20, 1);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}
