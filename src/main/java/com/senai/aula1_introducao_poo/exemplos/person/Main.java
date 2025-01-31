package com.senai.aula1_introducao_poo.exemplos.person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joel";
        person1.height = "1,81";
        person1.age = "20y";
        person1.adress = "Rua Vice Presidente Francisco Alvaro Bueno de Paiva, 179, Parque São Vicente, Mauá"
        System.out.println(person1.name);
    }
}
