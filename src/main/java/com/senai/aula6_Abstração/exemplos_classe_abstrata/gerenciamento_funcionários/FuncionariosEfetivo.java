package com.senai.aula6_Abstração.exemplos_classe_abstrata.gerenciamento_funcionários;

public class FuncionariosEfetivo extends Funcionarios{
    private double bonusMensal;

    public FuncionariosEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularbonus() {
        return salario+=bonusMensal;
    }
}
