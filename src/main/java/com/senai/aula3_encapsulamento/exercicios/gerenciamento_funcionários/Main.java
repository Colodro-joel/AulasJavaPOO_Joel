package com.senai.aula3_encapsulamento.exercicios.gerenciamento_funcionários;

public class Main {

    public static void main(String [] args) {
        System.out.println("------teste1---------");
        Funcionário funcionario1 = new Funcionário("Rafael", 8000, "gerente");
        System.out.println(funcionario1);

        System.out.println("-----teste2-------");
        Funcionário funcionario1 = new Funcionário("Orrico", 8000, "administrador");
        System.out.println(funcionario1);

        System.out.println("-----teste3-------");

        funcionario1.increaseSalário(20);
    }
}
