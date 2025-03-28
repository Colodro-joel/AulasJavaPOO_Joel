package com.senai.aula5_polimorfismo.exemplos.Animal;

public class Main {
    public static void main(String[] args) {
        testarSomAnimal(new Cachorro());
        testarSomAnimal(new Gato());

    }

    public static void testarSomAnimal(){
        Animal.fazerSom();
        Gato gato =(gato) Animal;
        gato.mia();
    }
}
