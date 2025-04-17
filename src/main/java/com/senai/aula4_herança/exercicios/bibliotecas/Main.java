package com.senai.aula4_herança.exercicios.atendimento_médico;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Joel",20);
        Paciente paciente2 = new PacienteConvenio("Adelaide",44,50.00);
        Paciente paciente3 = new PacienteParticular("Cilene", 45,60.00);

        paciente1.dadospaciente();
        paciente2.dadospaciente();
        paciente3.dadospaciente();

    }
}