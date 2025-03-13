package com.senai.aula4_herança.exercicios.Sistema_cadastro_funcionários;

public class funcionário {
    protected String nome;
    protected double salário;

    public funcionário(String nome, double salário) {
        this.nome = nome;
        this.salário = salário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s , Salário: R$%f",nome,salário);
    }
}
