package com.senai.aula2_colecoes.exercicios.gerenciador_tarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Adicionar tarefa                             |
                    |       2- Listar Tarefas                               |
                    |       3- Marcar tarefa como concluída                 |
                    |       4- Remover Tarefa                               |
                    |       5- Sair                                         |
                    _________________________________________________________
                    
                    """;
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
        }

        while ();

        }

        Task task1 = new Task("estudar Java", S);
    }

}