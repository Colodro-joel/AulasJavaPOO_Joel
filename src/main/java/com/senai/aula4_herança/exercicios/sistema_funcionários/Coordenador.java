package com.senai.aula4_herança.exercicios.sistema_funcionários;

import java.util.ArrayList;

public class Coordenador extends Funcionário {
    protected  ArrayList<Professor> equipe;

    public Coordenador(String nome, double salario, ArrayList<Professor> equipe) {
        super(nome, salario);
        this.equipe = equipe;
    }

    public ArrayList<Professor> getEquipe() {
        return equipe;
    }

    public void setEquipe(ArrayList<Professor> equipe) {
        this.equipe = equipe;
    }

    @Override
    public void DadosFuncionario() {
        System.out.println("Equipe de professores: "+equipe);
        if (equipe.isEmpty()) {
            for(Professor professor : equipe) {
                System.out.println(" ---"+ equipe.getFirst());
            }
        } else {
            System.out.println(("Nenhum professor coordenado"));
        }
    }
}