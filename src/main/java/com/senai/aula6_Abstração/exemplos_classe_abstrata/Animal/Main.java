package com.senai.aula6_Abstração.exemplos_classe_abstrata.Animal;

public class Main {
    public static void main(String[] args) {
        testarAnimal(new Cachorro("Lavinho"));
        testarAnimal(new Pato("Rob"));
    }

    private static void testarAnimal(Animal animal){
        animal.dormir();
        animal.fazerSom();
        if (animal instanceof Pato pato) {
            pato.botarOvo();
        }
        Pato pato = (Pato) animal;
        pato.botarOvo();
    }
}
