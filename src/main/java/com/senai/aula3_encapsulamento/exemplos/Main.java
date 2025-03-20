package com.senai.aula3_encapsulamento.exemplos;

import com.senai.aula1_introducao_poo.exemplos.concessionaria.Car;

public class Main {
    public static void main(String[] args) {
        //Criando a classe Carro
        Car myCar;
        myCar = new Car();

        //Utilizando métodos públicos para modificar e acessar a váriavel privada
        myCar.setvelocity(100);
        System.out.println("Velocidade atual: ");

        //Testando uma velocidade inválida
        myCar.setvelocity(-20); //Isso mostrará memsagem de erro

        /*myCar.velocity = -20;*/
       System.out.println("Velocidade modificada diretamente: * + meuCar.velocity");
    }
}