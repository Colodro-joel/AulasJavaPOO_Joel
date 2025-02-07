package com.senai.aula1_introducao_poo.exemplos.person;

public class Adress {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String UF;

    public Adress(String rua, int numero, String bairro, String cidade, String UF) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Rua " + this.rua + " , " + this.numero + " , " + this.bairro + " , " + this.cidade + " - " + this.UF;
    }
}
