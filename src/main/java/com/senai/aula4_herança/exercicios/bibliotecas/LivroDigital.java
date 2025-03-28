package com.senai.aula4_herança.exercicios.bibliotecas;

public class LivroDigital extends Livro{
    private double TamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);
        TamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return TamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo){
        this.TamanhoArquivo = TamanhoArquivo;
    }

    @Override
    public void dadoslivro() {
        System.out.println("Tamanho do Arquivo: ");
    }


}
