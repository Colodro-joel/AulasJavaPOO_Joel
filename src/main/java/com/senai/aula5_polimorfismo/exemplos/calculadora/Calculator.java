package com.senai.aula5_polimorfismo.exemplos.calculadora;

public class Calculator {

    int somar (int a,int b) {
        System.out.println("int,int");
        return a+b;
    }

    int somar(int a, int b, int c){
        System.out.println("int,int,int");
        return a+b;
    }

    double somar(double a, double b){
        System.out.println("double,double");
        return a+b;
    }

    double somar(int a, double b){
        System.out.println("int,double");
        return a+b;
    }

    double somar(double a,int b){
        System.out.println("double,int");
        return a+b;
    }


}

