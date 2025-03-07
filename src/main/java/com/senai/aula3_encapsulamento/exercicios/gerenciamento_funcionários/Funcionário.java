package com.senai.aula3_encapsulamento.exercicios.gerenciamento_funcionários;

public class Funcionário {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listadecargos = {"administrador", "secretário", "gerente" , "programador", "analista"};

    public Funcionário(String nome, double salario, String cargo, int idCargo) {

        if (!nome.isBlank()) {
            this.nome = nome;
        } else {
            System.out.println("Não pode ser nulo ou vazio");
            System.out.println("O nome será 'anonimo'");
        }
        if (salario >= 1518) {
            this.salario = salario;
        } else {
            System.out.println("Salario deve ser menor que o minimo");
        }
        if (idCargo >= 1 && idCargo < listadecargos.length) {
            this.cargo = listadecargos[idCargo - 1];
        } else {
            System.out.println("Cargo Inválido");
            System.out.println("'programador'");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void increaseSalário(int percentAumento){
        if(percentAumento>0) {
            this.salario += (salario * percentAumento) / 100;
            System.out.println("aumento de" +percentAumento+"% do salário do funcionário" + nome +
                    "que passa a receber R$" + salario);
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}


