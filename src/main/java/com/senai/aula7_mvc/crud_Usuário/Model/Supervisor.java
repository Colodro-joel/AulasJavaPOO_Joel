package com.senai.aula7_mvc.crud_Usuário.Model;

public class Supervisor extends Usuário{
    private String area;

    public Supervisor(String nome, int id, String area) {
        super(nome, id);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nome: %s, Setor: %s", super.getId(), super.getNome(), area);
    }
}
