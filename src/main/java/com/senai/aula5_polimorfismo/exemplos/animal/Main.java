package com.senai.aula5_polimorfismo.exemplos.animal;

public class Main {
    public static void main(String[] args) {
        testarSomAnimal(new Cachorro());
        testarSomAnimal();

    }

    public static void testarSomAnimal(Animal,Animal){
        Animal.fazerSom();
    }
}
