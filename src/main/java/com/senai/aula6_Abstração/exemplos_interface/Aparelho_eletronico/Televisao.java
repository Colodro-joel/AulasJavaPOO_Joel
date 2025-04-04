package com.senai.aula6_Abstração.exemplos_interface.Aparelho_eletronico;

public class Televisao implements AparelhoEletronico {

    @Override
    public void ligar() {
        System.out.println("Televisão ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada!");
    }
}
