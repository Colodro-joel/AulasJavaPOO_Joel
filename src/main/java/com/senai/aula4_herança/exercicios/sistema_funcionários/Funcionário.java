package com.senai.aula4_herança.exercicios.sistema_funcionários;

public class Funcionário {
    private String nome;
    private double salario;

    public Funcionário(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void DadosFuncionario(){
        System.out.println("Nome: "+nome+", Salário: "+salario);
    }
}
