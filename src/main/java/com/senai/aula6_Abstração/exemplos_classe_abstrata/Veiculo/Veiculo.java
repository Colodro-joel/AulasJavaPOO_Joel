package com.senai.aula6_Abstração.exemplos_classe_abstrata.Veiculo;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo() {this.velocidade = 0;}
    public void acelerar(int incremento){
        velocidade+=incremento;
        System.out.println("Vrummmmm, acelerando para " +velocidade+ "km/h");
    }
    abstract void ligar();
}
