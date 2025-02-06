package com.senai.aula1_introducao_poo.exemplos.concessionaria;

public class Car {
    String marca;
    String modelo;
    String cor;
    int ano;
    int quilometragem;
    double valor;

    public void TesteDriver(){
        System.out.println("Vrummmm! ,"+modelo+"sendo testado.");
    }

    public Car(String marca, String modelo, String cor, String ano, String quilometragem, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = int ano;
        this.quilometragem = int quilometragem;
        this.valor = double valor;
    }

    public void comprar(String nomeCliente){
        System.out.println("Parabens! "+nomeCliente+" você comprou o "+marca+" "+modelo);

    }

    public void valorTabelaFipe(String anoatual){
        int IdadeCarro = anoatual = this.ano;
        double valorComDesvalorizacao = valor;


        for(int i = 0; 1 < IdadeCarro; i++){
            valorComDesvalorizacao = valorComDesvalorizacao*0.02;
        }
        System.out.println("O "+modelo+" no ano "+anoatual+" vale R$"+valorComDesvalorizacao+" na tabela FIPE.");
    }

    @Override
    public String toString(){
        return "Carro(" +
                "marca='" + marca + "\'" +
                ", modelo='" + modelo + "\'" +
                ", cor='" + cor + "\'" +
                ", ano=' " +  ano + "\'" +
                ", quilometragem=' " + quilometragem + "\'" +
                ", valor=" + valor +
                ")";
    }
}
