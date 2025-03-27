package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Veiculos {
    private String Modelo;

    public Veiculos(String modelo) {
        Modelo = modelo;
    }

    public void realizarManuntencao(){
        System.out.println("Manuntenção Genérica");
    }

    public String getModelo() {
        return Modelo;
    }
}
