package com.senai.aula5_polimorfismo.exemplos.sistema_pagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamentos> listaPagamentos = new ArrayList<>();
        listaPagamentos.add(new CLT("Joel",2000));
        listaPagamentos.add(new PJ("Maria",20, 30));
        listaPagamentos.add(new freelancers("Luis",2333));

        listaPagamentos.forEach( pagamentos -> {
                    System.out.printf("Ss recebe R$%...2f\n",
                            pagamentos.getNome(),
                            pagamentos.calcularpagamento()
                    );
                }
        );
    }
}
