package com.senai.aula4_herança.exemplos.veiculos;

public class Carro extends Veiculo{
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    public Carro(String marca, int ano) {
        super(marca,ano);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public static void exibirdetalhes() {
        super.exibirdetalhes();
        System.out.println("Portas: ");
    }
}
