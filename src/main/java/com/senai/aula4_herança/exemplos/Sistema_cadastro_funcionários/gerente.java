package com.senai.aula4_herança.exemplos.Sistema_cadastro_funcionários;

public class gerente extends funcionário {
    private double bonus;

    public gerente(String nome, double salário, double bonus) {
        super(nome, salário);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     *
     */
    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s , Salário: R$%f",nome,salário,bonus);
    }
}
