package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Caminhao extends Veiculos {
    public Caminhao(String Modelo) {
        super(Modelo);
    }

    @Override
    public void realizarManuntencao(){
        System.out.println("Reparação solicitada para o caminhão"+getModelo());
    }
}
