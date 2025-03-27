package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Carro extends Veiculos{
    public Carro(String Modelo) {
        super(Modelo);
    }

    public void realizarManuntencao() {
        System.out.println("Manuntenção preventiva realizada para o carro"+getModelo());
    }
}
