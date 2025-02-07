package com.senai.aula1_introducao_poo.exemplos.cadastro_produtos;

public class Products {
    String nome;
    double preco;
    int qntd;

    public Products(String nome, double preco, int qntd) {
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }

    public void exibirDetalhes(){
        System.out.println("Produto: "+nome+" custando cada unidade R$"+preco+" e temos "+qntd+" unidades");
    }
}
