package com.senai.aula6_Abstração.exemplos_classe_abstrata.gerenciamento_funcionários;

public class FuncionariosTemporario extends Funcionarios{
    private int HorasExtras;
    private double valorHorasExtras;

    public FuncionariosTemporario(String nome, double salario, double valorHorasExtras) {
        super(nome, salario);
        this.valorHorasExtras = valorHorasExtras;
    }

    @Override
    public double calcularbonus() {
        return salario+= HorasExtras*valorHorasExtras;
    }
}
