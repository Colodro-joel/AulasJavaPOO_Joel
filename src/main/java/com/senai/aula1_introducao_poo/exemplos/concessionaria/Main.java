package com.senai.aula1_introducao_poo.exemplos.concessionaria;

public class Main {

    public static void main(String[] args){
        Car carro1;
        carro1 = new Car(
                "Wolkswagem",
                "Voyage",
                "Prata",
                2013,
                185000,
                50000);

        System.out.println(carro1);

        carro1.TesteDriver();
        carro1.comprar("Joel");

        carro1.valorTabelaFipe(2025);
    }
}
