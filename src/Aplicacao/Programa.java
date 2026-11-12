package Aplicacao;

import Entidades.Animal;
import Entidades.Cachorro;
import Entidades.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    static Scanner scan = new Scanner(System.in);
    static List<Animal> animais = new ArrayList<>();
    static int proximoId = 1;

    public static void main(String[] args) {
        int op;

        System.out.print("===== SISTEMA VETERINÁRIO =====\n" +
                "\n" +
                "1 - Gerenciar Animais\n" +
                "2 - Gerenciar Veterinários\n" +
                "3 - Gerenciar Serviços\n" +
                "4 - Gerenciar Agendamentos\n" +
                "0 - Sair\n" +
                "\n" +
                "Escolha uma opção: ");
        op = scan.nextInt();
        scan.nextLine();

        switch (op) {
            case 1:
                menuAnimal();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                menuAgendamento();
                break;
            case 0:
                break;
        }
    }

    public static void menuAgendamento() {
        System.out.println("===== AGENDAMENTOS =====\n" +
                "\n" +
                "1 - Cadastrar agendamento\n" +
                "2 - Listar agendamentos\n" +
                "3 - Confirmar agendamento\n" +
                "4 - Cancelar agendamento\n" +
                "5 - Concluir atendimento\n" +
                "0 - Voltar\n" +
                "\n" +
                "Escolha uma opção: ");
    }

    public static void menuAnimal() {
        int op;
        System.out.print("========== GERENCIAMENTO DE ANIMAIS ==========\n" +
                "\n" +
                "1 - Cadastrar animal\n" +
                "2 - Listar animais\n" +
                "3 - Voltar ao menu principal\n" +
                "\n" +
                "Escolha uma opção: ");
        op = scan.nextInt();
        scan.nextLine();

        switch (op) {
            case 1:
                System.out.println("========== CADASTRO DE ANIMAL ==========\n");

                System.out.print("Tipo de animal (Cachorro/Gato) - c/g: ");
                String tipo = scan.next();
                scan.nextLine();
                System.out.println();

                System.out.print("Nome: ");
                String nome = scan.nextLine();

                System.out.print("Idade: ");
                int idade = scan.nextInt();
                scan.nextLine(); // <-- Buffer limpo

                System.out.print("Espécie: ");
                String especie = scan.nextLine();

                System.out.print("Raça: ");
                String raca = scan.nextLine();

                System.out.print("Peso: ");
                double peso = scan.nextDouble();
                scan.nextLine(); // <-- Buffer limpo

                if (tipo.equalsIgnoreCase("c")) {
                    System.out.print("Porte (Pequeno/Médio/Grande): ");
                    String porte = scan.nextLine();
                    Cachorro cachorro = new Cachorro(proximoId++, nome, especie, idade, raca, peso, porte);
                    animais.add(cachorro);
                    System.out.println("\nAnimal cadastrado com sucesso!");
                } else if (tipo.equalsIgnoreCase("g")) {
                    System.out.print("É um gato indoor? (S/N): ");
                    String isIndoor = scan.next();
                    scan.nextLine(); // <-- Buffer limpo

                    boolean indoor = isIndoor.equalsIgnoreCase("S");
                    Gato gato = new Gato(proximoId++, nome, especie, idade, raca, peso, indoor);
                    animais.add(gato);
                    System.out.println("\nAnimal cadastrado com sucesso!");
                } else {
                    System.out.println("Opção inválida!");
                }

            case 2:
                int qtd = 1;
                for (Animal obj : animais) {
                    System.out.println("Animal #" + qtd);
                    System.out.println(obj);
                    System.out.println("\n--------------------------------------\n");
                    qtd++;
                }
                break;
        }
    }
}