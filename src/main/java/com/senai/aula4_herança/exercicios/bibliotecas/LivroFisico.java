package com.senai.aula4_herança.exercicios.bibliotecas;

public class LivroFisico extends Livro {
    private double NumeroPaginas;

    public LivroFisico(String titulo, String autor, double numeroPaginas) {
        super(titulo, autor);
        NumeroPaginas = numeroPaginas;
    }

    public double getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(double numeroPaginas) {
        this.NumeroPaginas = numeroPaginas;
    }

    @Override
    public void dadoslivro() {
        System.out.println("Numero de páginas: ");
    }
}
