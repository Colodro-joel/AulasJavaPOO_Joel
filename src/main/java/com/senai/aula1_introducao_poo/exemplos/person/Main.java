package com.senai.aula1_introducao_poo.exemplos.person;

public class Main {
    public static void main(String[] args) {

        adress adress1 = new adress();
        adress1.rua = "Vice Presidente Francisco Alvaro Bueno de Paiva";
        adress1.numero = "179";
        adress1.bairro = "Parque São Vicente";
        adress1.cidade = "Mauá";
        adress1.UF = "SP";


        Person person1 = new Person();
        person1.name = "Joel";
        person1.height = "1.81";
        person1.age = "20y";
        person1.adress = "Rua Vice Presidente Francisco Alvaro Bueno de Paiva, 179, Parque São Vicente, Mauá";

        System.out.println(person1.name);
    }
}
