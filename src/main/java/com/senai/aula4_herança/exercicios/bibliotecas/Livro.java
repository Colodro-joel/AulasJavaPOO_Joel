package com.senai.aula4_herança.exercicios.bibliotecas;

public abstract class Livro {
    private String Titulo;
    private String Autor;

    public Livro(String titulo, String autor) {
        Titulo = titulo;
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void dadoslivro(){
        System.out.println("Titulo: "+Titulo+", Livro: "+Autor);
    }

}
