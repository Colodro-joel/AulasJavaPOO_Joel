package com.senai.aula4_herança.exercicios.bibliotecas;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Biblia","Deus");
        Livro livro2 = new Livro("Extraordinário", "RJ Palacio");

        livro1.dadoslivro();
        livro2.dadoslivro();
    }
}
