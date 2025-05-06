package com.senai.aula7_mvc.crud_Usuário.Model;

public abstract class Usuário {
    private String Nome;
    private int id;

    public Usuário(String nome, int id) {
        this.Nome = Nome;
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuário{" +
                "Nome='" + Nome + '\'' +
                ", id=" + id +
                '}';
    }
}
