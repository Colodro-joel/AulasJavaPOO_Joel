package com.senai.aula2_colecoes.exemplos.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person pessoa1 = new Person("Joel",20);
        Person pessoa2 = new Person("Lucas", 12);
        Person pessoa3 = new Person("Pedro",6);

        Person[] matrizPersons = new Person[4];

        matrizPersons[0] = pessoa1;
        matrizPersons[1] = pessoa2;
        matrizPersons[2] = pessoa3;

        for(Person person : matrizPersons) {
            System.out.println(person);
        }

        matrizPersons[0].talk("Que legal");
        matrizPersons[3] = new Person("Voce", 0);
        System.out.println(matrizPersons[3].name);

        ArrayList lista = new ArrayList<>();

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Person person = (Person) lista.get(3);
        person.talk("teste");

        ArrayList<Person> listaPersons = new ArrayList<Person>();

        listaPersons.add(pessoa1);
        listaPersons.add(new Person("Maria",30));

        System.out.println("tamanho da lista: " + listaPersons.size());

        listar(listaPersons);
        listaPersons.remove(pessoa1);
        listar(listaPersons);

        listaPersons.set(0, pessoa2);
        listar(listaPersons);

        listaPersons.add(0,pessoa3);
        listar(listaPersons);
        System.out.println("---------teste---------");
        listaPersons.forEach(System.out::println);

        List<Person> listaFiltrada = listaPersons.stream().filter(p -> p.age>=10).collect(Collectors.toList());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as informações a seguir:");
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Idade: ");
        int age = scanner.nextInt();
        listaPersons.add(new Person(name,age));

    }

    public static void listar(ArrayList<Person> lista) {
        System.out.println();
        for(Person person : lista) {
            System.out.println(person);
        }

    }
}
