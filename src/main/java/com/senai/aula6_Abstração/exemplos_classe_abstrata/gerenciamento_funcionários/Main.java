package com.senai.aula6_Abstração.exemplos_classe_abstrata.gerenciamento_funcionários;

public class Main {
    public static void main(String[] args) {
        testarPagamento(new FuncionariosEfetivo());
        testarPagamento(new FuncionariosTemporario());
    }

    public static void testarPagamento(Funcionarios funcionario) {
        System.out.println("-------testando funcionários-----------");
        funcionario.exibirDados();
        funcionario.aumentarsalario();
        funcionario.exibirDados();
        funcionario.calcularbonus();
        funcionario.exibirDados();


    }
}
