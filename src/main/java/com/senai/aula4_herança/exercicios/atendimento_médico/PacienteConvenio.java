package com.senai.aula4_herança.exercicios.atendimento_médico;

public class PacienteConvenio extends Paciente{
    protected double DescontoConsulta;

    public PacienteConvenio(String nome, int idade, double DescontoConsulta) {
        super(nome, idade);
        this.DescontoConsulta = DescontoConsulta;
    }

    public double DescontoConsulta() {
        return DescontoConsulta;
    }

    public void setDescontoConsulta(double DescontoConsulta) {
        this.DescontoConsulta = DescontoConsulta;
    }

    @Override
    public void dadospaciente() {
        System.out.println("O seu desconto será de:");;
    }
}
