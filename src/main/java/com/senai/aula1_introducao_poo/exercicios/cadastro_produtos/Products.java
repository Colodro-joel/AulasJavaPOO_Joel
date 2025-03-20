package com.senai.aula1_introducao_poo.exercicios.cadastro_produtos;

import java.util.Random;
import java.util.Scanner;

public class Products {
    String name;
    double price;
    int qntd;

    public Products(String name, double price, int qntd) {
        this.name = name;
        this.price = price;
        this.qntd = qntd;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + name + " custando cada unidade R$" + price + " e temos " + qntd + " unidades");
    }

    Scanner scanner = new Scanner(System.in);
    private int add;
    int adicao = this.add;

    public void AtualizaEstoque(int qntd) {
        int estoque = qntd = this.qntd;
        int adicao = scanner.nextInt();

        for (int i = 0; i < estoque; i++) {
            estoque = adicao + estoque;
        }

        System.out.println("Estoque atual: " + estoque);
    }

    public void CalcularValorEstoque(double price, int qntd) {
        double valor = price = this.price;
        int quantidade = qntd = this.qntd;

        double ValorEstoque = 0;
        for (int i = 0; i < qntd; i++) {
            ValorEstoque = quantidade * valor;
        }

        System.out.println("O valor total do estoque é: " + ValorEstoque);
    }
}

