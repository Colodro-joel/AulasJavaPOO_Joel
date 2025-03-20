package com.senai.aula3_encapsulamento.exercicios.cadastro_produto_simples;

public class Main {

    public static void main(String[] args) {
        product product1 = new product("Feijão",10);
        product product2 = new product("Arroz",30);

        System.out.println(product1);
        System.out.println(product2);

        System.out.println("-----------");
        product1.setPrice(10);
        product2.setPrice(-20);

        int a = 2;
        int b = 2;
        System.out.println( product1.equals(product2));

     }
}
