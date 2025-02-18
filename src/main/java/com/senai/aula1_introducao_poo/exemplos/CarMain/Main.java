package com.senai.aula1_introducao_poo.exemplos.CarMain;

import com.senai.aula1_introducao_poo.exemplos.concessionaria.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> Carlist = new ArrayList<>();

        System.out.println("Quantos carros deseja imprimir no sistema:");
        int qtdCarros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qtdCarros; i++){
            System.out.println("\nCar "+(i+1)+"\n");
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Fabricante: ");
            String fabricante = scanner.nextLine();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            System.out.print("KM: ");
            int km = scanner.nextInt();
            System.out.print("Valor: ");
            double valorinicial = scanner.nextDouble();
            scanner.nextLine();

            Car car = new Car(modelo, fabricante, marca, ano, km, valorinicial);
            Carlist.add(car);

            Carlist.forEach(System.out::println);

        }
    }
}
