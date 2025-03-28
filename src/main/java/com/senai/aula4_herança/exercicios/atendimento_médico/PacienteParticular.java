package com.senai.aula4_herança.exercicios.atendimento_médico;

public class PacienteParticular extends Paciente {
    protected double CustoConsulta;

    public PacienteParticular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
        CustoConsulta = custoConsulta;
    }

    public double getCustoConsulta() {
        return CustoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        CustoConsulta = custoConsulta;
    }

    @Override
    public void dadospaciente() {
        System.out.println("Custo da Consulta:");
    }
}
