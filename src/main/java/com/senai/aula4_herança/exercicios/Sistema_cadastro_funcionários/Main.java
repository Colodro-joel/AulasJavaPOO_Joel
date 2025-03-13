package com.senai.aula4_herança.exercicios.Sistema_cadastro_funcionários;

public class Main {
    public static void main(String[] args) {
        funcionário funcionario = new funcionário("");
        gerente gerente = new gerente("");

        funcionário.exibirDados();
        gerente.exibirDados();
    }
}
