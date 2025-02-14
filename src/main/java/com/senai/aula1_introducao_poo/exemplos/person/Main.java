package com.senai.aula1_introducao_poo.exemplos.person;

import java.util.Scanner;

public class Main {
    private static boolean person;

    public static void main(String[] args) {

        Adress adress1 = new Adress(
         "Vice Presidente Francisco Alvaro Bueno de Paiva",
        179,
         "Parque São Vicente",
         "Mauá",
         "SP"
        );


        Person person1 = new Person(
        "Joel",
        20,
        1.81f,
                adress1
        );

        Person person2 = new Person(
                "Lucas",
                12,
                1.65f,
                adress1
        );

        person2.falar("Oi tudo bem, quer comer o que?");
        person1.comer("Sorvete");
        person1.falar("E o que voce nao come?");
        person1.comer("Peixe");

        String[] etiquetas = {"nome: ", "idade: ","altura: ", "Endereco:\n\trua:","\tnumero","\tbairro","\tcidade","\tUF"};
        String[] dados = new String[etiquetas.length];

        Scanner scanner= new Scanner(System.in);

        System.out.println("Preencha as informações a seguir:");
        for(int i = 0; i < etiquetas.length; i++) {
            System.out.print(etiquetas[i]);
            dados[i] = scanner.nextLine();
        }

        Person person3 = new Person(
                dados[0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                  new Adress(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7]
                  )
        );
                System.out.println(person);
    }
}
