package com.senai.aula6_Abstração.exemplos_interface.Aparelho_eletronico;

public class Computador implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("Computador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }
}
