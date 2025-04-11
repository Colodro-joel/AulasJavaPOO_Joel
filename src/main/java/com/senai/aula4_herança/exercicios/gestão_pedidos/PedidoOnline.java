package com.senai.aula4_herança.exercicios.gestão_pedidos;

public class PedidoOnline extends Pedidos{
    private double TaxaDeEntrega;

    public PedidoOnline(int numeroPedido, double valorTotal, double TaxaDeEntrega) {
        super(numeroPedido, valorTotal);
        TaxaDeEntrega = TaxaDeEntrega;
    }

    public double getTaxaDeEntrega() {
        return TaxaDeEntrega;
    }

    public void setTaxaDeEntrega(double taxaDeEntrega) {
        if(taxaDeEntrega < 0){
            System.out.println("A taxa de entrega não pode ser menor que 0");
            this.TaxaDeEntrega = 0;
        } else {
            this.TaxaDeEntrega = TaxaDeEntrega;
        }
    }
    public double calcularTaxadeEntrega() {
        return getValorTotal() + TaxaDeEntrega;
    }

    @Override
    public int exibirDetalhes() {
        System.out.println("A taxa de entrega é: "+calcularTaxadeEntrega());
        return 0;
    }
}


