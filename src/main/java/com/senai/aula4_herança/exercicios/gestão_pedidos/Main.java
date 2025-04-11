package com.senai.aula4_herança.exercicios.gestão_pedidos;

public class Main {
    public static void main(String[] args) {
        Pedidos pedido1 = new Pedidos(12477,145.88);
        Pedidos pedido2 = new PedidoOnline(12472,8.90);

        pedido1.exibirDetalhes();
        pedido2.exibirDetalhes();
    }
}
