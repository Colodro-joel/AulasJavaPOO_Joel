package com.senai.aula4_herança.exemplos.Sistema_cadastro_funcionários;

public class Main {
    public void main(String[] args) {
        funcionário funcionario = new funcionário("Rafael",6000);
        gerente gerente = new gerente("Rafael", 10000,1000);

        funcionário.exibirDados();
        gerente.exibirDados();
    }
}
