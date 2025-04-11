package com.senai.aula4_herança.exemplos.Sistema_cadastro_funcionários;

public class Main {
    public void main(String[] args) {
        funcionário f1 = new funcionário("Rafael",6000);
        gerente g1 = new gerente("Rafael", 10000,1000);

        f1.exibirDados();
        g1.exibirDados();
    }
}
