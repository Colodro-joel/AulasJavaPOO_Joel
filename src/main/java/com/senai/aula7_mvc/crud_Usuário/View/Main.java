package com.senai.aula7_mvc.crud_Usuário.View;

import com.senai.aula7_mvc.crud_Usuário.Controller.OperadorController;

import com.senai.aula7_mvc.crud_Usuário.Controller.SupervisorController;
import com.senai.aula7_mvc.crud_Usuário.Model.Operador;
import com.senai.aula7_mvc.crud_Usuário.Model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                        Menu
                        1 - Cadastrar Usuários
                        2 - Deletar Usuários
                        3 - Atualizar Usuários
                        4 - Exibir Usuários
                        5 - Ligar Máquina
                        6 - Demitir Operador
                        7 - Sair
                        """;
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
        scanner.nextLine();
            System.out.println("Qual é o tipo de Usuário??");
            System.out.println("1 - Operador");
            System.out.println("2 - Supervisor");
            int escolherTipo = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Preencha os dados a seguir:");
                    System.out.println("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println("Nome: ");

                    if(escolherTipo == 1){
                        System.out.println("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        if (opController.cadastrarOperador(operador)){
                            System.out.println("Cadastrado com sucesso!!!");
                        } else {
                            System.out.println("Não foi possivel cadastrar!!!");
                        }
                    } else if (escolherTipo == 2) {
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.cadastrarSupervisor(supervisor);
                        if (opController.cadastrarSupervisor(supervisor)) {
                            System.out.println("Cadastrado com sucesso!!");
                        }else{
                            System.out.println("Não foi possivel cadastrar!!!");
                        }
                    }
                    break;
                case 2:
                    if (escolherTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);
                    else if (escolherTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);
                    System.out.println("Escolha um usuário pelo ID para deletar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if(escolherTipo == 1)
                        opController.deletarOperador(id);
                    else if (escolherTipo == 2) {
                        supController.deletarSupervisor(id);
                        break;

                        case 3:
                            if (escolherTipo == 1)
                            opController.listarOperadores().forEach(System.out::println);
                            else if (escolherTipo == 2) ;
                            supController.listarSupervisores().forEach(System.out::println);

                            System.out.println("Escolha um usuário para atualizar");
                            id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Atualize as seguintes informações: ");
                            System.out.println("Nome: ");
                            nome = scanner.nextLine();

                            if (escolherTipo == 1) {
                                System.out.println("Setor: ");
                                String area = scanner.nextLine();
                                opController.atualizarOperador(operador);
                            } else if {
                            System.out.println("Area: ");
                            String area = scanner.nextLine();
                            Supervisor supervisor = new Supervisor(nome, id, area);
                            supController.atualizarSupervisor(Supervisor);
                        }
                        System.out.println("Usuário atualizado com sucesso!!");
                        break;
                        case 4:
                            if (escolherTipo == 1) {
                                opController.listarOperadores().forEach(System.out::println);
                            } else if (escolherTipo = 2) {
                                supController.listarSupervisores().forEach(System.out.println);

                            }
                            break;
                        case 5:
                            break;
                        case 6:
                            break:
                        default:
                            System.out.println("Saindo do sistema!!");
                            break;

                    }
            }
        } while();
        scanner.close();
    }
}
