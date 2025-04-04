package com.senai.aula6_Abstração.exemplos_classe_abstrata.gerenciamento_funcionários;

public class Main {
    public static void main(String[] args) {
        testarPagamento(new FuncionariosEfetivo("Maria", 4000, 300));
        testarPagamento(new FuncionariosTemporario("Sara", 2800, 200));
    }

    public static void testarPagamento(Funcionarios funcionario) {
        System.out.println("-------testando funcionários-----------");
        funcionario.exibirDados();
        funcionario.aumentarsalario(6);
        funcionario.exibirDados();
        funcionario.calcularbonus();
        funcionario.exibirDados();


    }
}
