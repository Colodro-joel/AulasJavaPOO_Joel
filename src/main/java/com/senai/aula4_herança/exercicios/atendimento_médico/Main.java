package com.senai.aula4_herança.exercicios.atendimento_médico;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Adelaide",44);
        Paciente paciente2 = new Paciente("Cilene", 45);

        paciente1.dadospaciente();
        paciente2.dadospaciente();

    }
}
