package com.senai.aula1_introducao_poo.exemplos.person;

public class Person {
    String name;
    int age;
    float height;
    String adress;

    public void falar(String frase){
        System.out.println(frase);
    }

    public void comer(String alimento){
        System.out.println("a pessoa comeu: "+ alimento);
    }
}
