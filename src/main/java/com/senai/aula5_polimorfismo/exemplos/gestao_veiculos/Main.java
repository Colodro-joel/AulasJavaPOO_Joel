package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Main {
    public static void main(String[] args) {

        realizarManuntencao(new Carro("Ford ka"));
        realizarManuntencao(new Moto("Yamaha"));
        realizarManuntencao(new Caminhao("Mercedes"));

    }

    public void realizarManuntencao(Veiculos veiculos) {
        veiculos.realizarManuntencao();
    }
}
