package com.senai.aula6_Abstração.exemplos_classe_abstrata.Animal;

public class Pato extends Animal{
    public Pato(String nome) { super(nome);}

    @Override
    public void fazerSom() {
        System.out.println("Qua Qua!");
    }
    void botarOvo() {
        System.out.println("Bota!");
    }
}
