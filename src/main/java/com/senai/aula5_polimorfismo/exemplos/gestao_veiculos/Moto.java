package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Moto extends Veiculos{
    public Moto(String Modelo){
        super(Modelo);
    }

    @Override
    public void realizarManuntencao() {
        System.out.println("Realizar manuntenção da moto"+getModelo());
    }
}
