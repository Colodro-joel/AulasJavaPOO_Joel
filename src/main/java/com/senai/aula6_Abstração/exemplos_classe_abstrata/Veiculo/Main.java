package com.senai.aula6_Abstração.exemplos_classe_abstrata.Veiculo;

public class Main {
    public static void main(String[] args) {
        testarVeiculo(new Carro());
        testarVeiculo(new Moto());
    }

    public static void testarVeiculo(Veiculo veiculo){
        veiculo.ligar();
        veiculo.acelerar(5);
        veiculo.acelerar(12);
    }
}
