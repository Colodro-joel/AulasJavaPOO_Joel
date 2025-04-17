package com.senai.aula4_herança.exercicios.sistema_funcionários;

import java.io.File;
import java.util.ArrayList;

public class Main{
    public static void Main(String[] args) {
        ArrayList<Professor> Professores = new ArrayList();

        Funcionário funcionário1 = new Funcionário("Luciana", 2800);
        Funcionário funcionário2 = new Professor("Claudia", 15000, "Calculo");
        Funcionário funcionário3 = new Professor("André", 20000, "Governança");
        Funcionário funcionário4 = new Professor("Rosana", 18000, "Território e Sociedade");
        Funcionário funcionário5 = new Professor("Tércio", 12000, "Banco de Dados");
        Funcionário funcionário6 = new Professor("Ricardo", 12000, "Marcação");
        Funcionário funcionário7 = new Professor("Rafael", 12000, "Back End");
        Funcionário funcionário8 = new Professor("Rogério", 12000, "Projeto de Software");
        Funcionário funcionário9 = new Coordenador("Dacio", 35000, new ArrayList<>());

        Professores.add((Professor)funcionário2);
        Professores.add((Professor)funcionário3);
        Professores.add((Professor)funcionário4);

        Funcionário funcionário10 = new Coordenador("Denise", 20000, new ArrayList<>());

        Professores.add((Professor)funcionário5);
        Professores.add((Professor)funcionário6);
        Professores.add((Professor)funcionário7);
        Professores.add((Professor)funcionário8);

        funcionário1.DadosFuncionario();
        funcionário2.DadosFuncionario();
        funcionário3.DadosFuncionario();
        funcionário4.DadosFuncionario();
        funcionário5.DadosFuncionario();
        funcionário6.DadosFuncionario();
        funcionário7.DadosFuncionario();
        funcionário8.DadosFuncionario();
        funcionário9.DadosFuncionario();
        funcionário10.DadosFuncionario();

    }

}