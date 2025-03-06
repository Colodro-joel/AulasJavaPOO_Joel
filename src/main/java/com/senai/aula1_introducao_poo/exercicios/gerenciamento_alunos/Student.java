package com.senai.aula1_introducao_poo.exercicios.gerenciamento_alunos;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + name + ", Idade: " + age + ", Nota: " + grade);
    }

    public void AtualizaNota() {

    }

    public void aprovacao(double grade) {
        double grade = this.grade;

        for (int i = 0; i < grade; i++) {
            double grade >= 6.0;
        }
        System.out.println("Parabens! Com a nota "+ aprovacao+" você passou.");
        System.out.println("Que pena! Com a nota "+grade+" você reprovou.");
    }
}

