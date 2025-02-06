package com.senai.aula1_introducao_poo.exemplos.person;

public class Main {
    public static void main(String[] args) {

        adress adress1 = new adress();
        adress1.rua = "Vice Presidente Francisco Alvaro Bueno de Paiva";
        adress1.numero = "179";
        adress1.bairro = "Parque São Vicente";
        adress1.cidade = "Mauá";
        adress1.UF = "SP";


        Person person1 = new Person();
        person1.name = "Joel";
        person1.height = "1.81";
        person1.age = "20y";
        person1.adress = "Rua Vice Presidente Francisco Alvaro Bueno de Paiva, 179, Parque São Vicente, Mauá";

        Person person2 = new Person();

        System.out.println(person1.adress.rua);
        person1.falar("Oi, tudo bem?");
        person1.comer("coxinha");
        person2.falar("Tudo ótimo");
        person2.comer("brigadeiro");

        Person person1 = new Person("Joel","20");

        String[] etiquetas = {"nome: ", "idade: ","altura: ", "Endereco:\n\trua:","\tnumero","\tbairro","\tcidade","\tUF"};
        String[] dados = new String[etiquetas.length];

        System.out.println("Preencha as informações a seguir:");
        for(int i = 0; i < etiquetas.length; i++) {
            System.out.print(etiquetas[i]);
            dados[i] = scanner.nextLine();
        }

        Person person1 = new Person(
                dados[0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7]
                )
        );
        System.out.println(person1);

    }
}
