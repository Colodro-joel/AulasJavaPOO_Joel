package com.senai.aula4_herança.exemplos.veiculos;

    public class Veiculo {
        private String marca;
        private int ano;

        public Veiculo(String marca, int ano) {
        }


        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public void exibirDetalhes(){
            System.out.print("Marca: "+marca+", Ano: "+ano);
        }
    }

