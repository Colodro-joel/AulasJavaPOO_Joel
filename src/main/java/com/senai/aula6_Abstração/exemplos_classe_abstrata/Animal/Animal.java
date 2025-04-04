package com.senai.aula6_Abstração.exemplos_classe_abstrata.Animal;

public abstract class Animal {
     protected String nome;

     public Animal(String nome) {this.nome = nome;}
     void dormir() {System.out.println(nome+"está dormindo");}
     public abstract void fazerSom();
}
