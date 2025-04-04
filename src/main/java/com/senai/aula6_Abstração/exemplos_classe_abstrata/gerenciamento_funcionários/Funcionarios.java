package com.senai.aula6_Abstração.exemplos_classe_abstrata.gerenciamento_funcionários;

public abstract class Funcionarios {
    protected String nome;
    protected double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarsalario(int porcentagem){
        salario += salario;
    }

    public abstract double calcularbonus();

    public void exibirDados(){
        System.out.printf("%s Receber R$,.2f", nome, salario);
    }
}
