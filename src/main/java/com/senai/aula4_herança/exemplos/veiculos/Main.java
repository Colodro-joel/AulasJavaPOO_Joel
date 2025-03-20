package com.senai.aula4_herança.exemplos.veiculos;

public class Main {
    public void main(String[] args) {
        Carro carro = new Carro("Ford KA",2020,4);
        Moto moto = new Moto("Yamaha",2018,true);

        Carro.exibirdetalhes();
        Moto.exibirdetalhes();
    }

}
