package com.senai.aula4_herança.exercicios.gestão_pedidos;

public class Main {
    public static void main(String[] args) {
        Pedidos pedido1 = new Pedidos(12477,145.88);
        Pedidos pedido2 = new PedidoOnline(12472,99.6,7.90);
        Pedidos pedido3 = new PedidoPresencial(12479,387.70,38.70);

        pedido1.exibirDetalhes();
        pedido2.exibirDetalhes();
        pedido3.exibirDetalhes();
    }
}
