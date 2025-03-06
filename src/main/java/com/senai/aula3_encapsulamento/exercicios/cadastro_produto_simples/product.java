package com.senai.aula3_encapsulamento.exercicios.cadastro_produto_simples;

import java.util.Objects;

public class product {
    private String name;
    private double price;

    public product(String name, double price) {
        this.name = name;
        if (price>=0) {
            this.price = price;
        } else {
            System.out.println("Preço negativo não existe.");
            System.out.println("O preço do produto será gratuito.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        product product = (product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
