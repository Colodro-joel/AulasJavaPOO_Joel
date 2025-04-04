package com.senai.aula6_Abstração.exemplos_classe_abstrata.Animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) { super(nome);}

    @Override
    public void fazerSom() {System.out.println("Au Au!");}
}
