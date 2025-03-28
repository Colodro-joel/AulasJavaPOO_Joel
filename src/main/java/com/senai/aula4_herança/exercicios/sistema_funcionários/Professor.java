package com.senai.aula4_herança.exercicios.sistema_funcionários;

public class Professor extends Funcionário {
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void DadosFuncionario() {
        System.out.println("Disciplina: ");
    }
}
