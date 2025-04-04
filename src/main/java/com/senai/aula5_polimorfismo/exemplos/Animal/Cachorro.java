package com.senai.aula5_polimorfismo.exemplos.Animal;


public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("AUUUUUU AU AU AU AUUUUUUUUUU");
    }
}
