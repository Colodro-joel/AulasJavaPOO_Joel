package com.senai.aula4_herança.exercicios.gestão_pedidos;

public class Pedidos {
    private int NumeroPedido;
    private double ValorTotal;

    public Pedidos(int numeroPedido, double valorTotal) {
        NumeroPedido = numeroPedido;
        ValorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        NumeroPedido = numeroPedido;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }

    public int exibirDetalhes(){
        System.out.println("Numero do Pedido: " +NumeroPedido+ ", Valor: " +ValorTotal);
        return 0;
    }
}
