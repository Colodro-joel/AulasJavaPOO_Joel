package com.senai.aula4_herança.exemplos.veiculos;

public class Moto extends Veiculo{
    private boolean temPartidaElétrica;

    public Moto(String marca, int ano, boolean temPartidaElétrica) {
        super(marca, ano);
        this.temPartidaElétrica = temPartidaElétrica;
    }

    public boolean isTemPartidaElétrica() {
        return temPartidaElétrica;
    }

    public void setTemPartidaElétrica(boolean temPartidaElétrica) {
        this.temPartidaElétrica = temPartidaElétrica;
    }

    @Override
    public void exibirdetalhes() {
        super.exibirdetalhes();
        System.out.println("Portas: ");
    }
}
