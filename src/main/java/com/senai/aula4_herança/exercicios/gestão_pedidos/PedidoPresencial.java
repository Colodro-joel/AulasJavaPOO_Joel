package com.senai.aula4_herança.exercicios.gestão_pedidos;

public class PedidoPresencial extends Pedidos {
    private double desconto;

    public PedidoPresencial(int numeroPedido, double valorTotal, double desconto) {
        super(numeroPedido, valorTotal);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto<0) {
            System.out.println("Desconto inexistente, coloque um valor positivo!");
        } else if (desconto > (getValorTotal())){
            System.out.println("O desconto não pode ser maior que o valor total");
        } else {
            this.desconto = desconto;
        }
    }

    public double calcularDesconto(double valorTotal) {
        return valorTotal - desconto;
    }

    @Override
    public int exibirDetalhes() {
        System.out.println("O desconto é: "+calcularDesconto());
        return 0;
    }
}


