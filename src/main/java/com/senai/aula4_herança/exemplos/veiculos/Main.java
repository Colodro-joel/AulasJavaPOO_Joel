package com.senai.aula4_herança.exemplos.veiculos;

public class Main {
    public void main(String[] args) {
        Carro carro1 = new Carro("Ford KA",2020,4);
        Moto moto1 = new Moto("Yamaha",2018,true);

        carro1.exibirdetalhes();
        moto1.exibirdetalhes();
    }

}
