package com.senai.aula4_herança.exemplos.veiculos;

public class Moto extends Veiculo{
    private boolean temPartidaElétrica;

    public Moto(String marca, int ano, boolean temPartidaElétrica) {
        super(marca, ano);
        this.temPartidaElétrica = temPartidaElétrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Portas: ");
    }
}
