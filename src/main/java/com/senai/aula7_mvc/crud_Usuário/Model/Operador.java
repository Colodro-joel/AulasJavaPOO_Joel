package com.senai.aula7_mvc.crud_Usuário.Model;

public class Operador extends Usuário{
    private String setor;

    public Operador(String nome, int id, String setor) {
        super(nome, id);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Operador{" + "setor='" + setor + '\'' + '}';
    }

}
