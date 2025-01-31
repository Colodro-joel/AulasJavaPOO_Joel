package com.senai.aula1_introducao_poo.exemplos.person;

public class adress {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String UF;

    public adress(String rua) {
        this.rua = rua;
    }

    public adress(int numero) {
        this.numero = numero;
    }

    public adress(String bairro) {
        this.bairro = bairro;
    }

    public adress(String cidade) {
        this.cidade = cidade;
    }

    public adress(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Rua " + this.rua + " , " + this.numero + " , " + this.bairro + " , " + this.cidade + " - " + this.UF;
    }
}
