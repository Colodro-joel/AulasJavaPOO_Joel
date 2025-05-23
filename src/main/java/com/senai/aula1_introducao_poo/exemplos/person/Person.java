package com.senai.aula1_introducao_poo.exemplos.person;

public class Person {
    String name;
    int age;
    float height;
    Adress adress;

    public Person(String name, int age, float height, Adress adress) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.adress = adress;
    }

    public void falar(String frase){
        System.out.println(frase);
    }

    public void comer(String alimento){
        System.out.println("a pessoa comeu: "+ alimento);
    }

    @Override
    public String toString() {
        return " O nome da pessoa é " + this.name + ", ela tem " + this.age + " anos, " + this.height + " de altura e mora no endereço " + this.adress;

    }
}
