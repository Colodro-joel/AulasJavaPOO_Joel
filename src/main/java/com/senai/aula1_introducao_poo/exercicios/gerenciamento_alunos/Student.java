package com.senai.aula1_introducao_poo.exercicios.gerenciamento_alunos;

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

    public void AtualizaNota(double grade) {
        this.grade = grade;
    }

    public boolean aprovacao(double grade) {
        return grade >= 6;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

