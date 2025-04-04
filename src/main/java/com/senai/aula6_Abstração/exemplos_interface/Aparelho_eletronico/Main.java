package com.senai.aula6_Abstração.exemplos_interface.Aparelho_eletronico;

public class Main {
    public static void main(String[] args) {

    }

    public static void testarAparelho(AparelhoEletronico aparelhoEletronico) {
        System.out.println("----- Testando Aparelhos --------");
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
