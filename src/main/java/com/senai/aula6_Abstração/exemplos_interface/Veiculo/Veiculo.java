package com.senai.aula6_Abstração.exemplos_interface.Veiculo;

public interface Veiculo {
    void acelerar();

    default void buzinar() {
        System.out.println("BI BI BI!");
    }
}
