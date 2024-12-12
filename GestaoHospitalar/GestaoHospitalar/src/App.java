import java.util.Scanner;

import Models.Medico;
import Models.Paciente;
import Repository.GerenciaAtendimento;
import Repository.GerenciaMedicos;
import Repository.GerenciaPacientes;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Medico[] medicos = new Medico[100];
        Paciente[] pacientes = new Paciente[100];

        GerenciaMedicos gerenciaMedicos = new GerenciaMedicos(medicos);
        GerenciaPacientes gerenciaPacientes = new GerenciaPacientes(pacientes);
        GerenciaAtendimento gerenciaAtendimento = new GerenciaAtendimento();

        int opcao;

        do {
            System.out.println("--==[Gestão Hospitalar]==--");
            System.out.println("1 - Médicos");
            System.out.println("2 - Pacientes");
            System.out.println("3 - Atendimento");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuMedico(scanner, gerenciaMedicos);
                    break;
                case 2:
                    menuPaciente(scanner, gerenciaPacientes);
                    break;
                case 3:
                    menuAtendimento(scanner, gerenciaAtendimento, gerenciaMedicos, gerenciaPacientes, pacientes,
                            medicos);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void menu(String tituloMenu) {
        System.out.println("\n--==[" + tituloMenu + "]==--");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Consultar");
        System.out.println("5 - Relatório");
        System.out.println("6 - Voltar ao menu principal");
        System.out.print("Opção: ");
    }

    public static void menuMedico(Scanner scanner, GerenciaMedicos gm) {
        int opcao;

        do {
            menu("Médicos");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gm.cadastrar();
                    break;
                case 2:
                    gm.alterar();
                    break;
                case 3:
                    gm.excluir();
                    break;
                case 4:
                    gm.consultar();
                    break;
                case 5:
                    gm.relatorio();
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    public static void menuPaciente(Scanner scanner, GerenciaPacientes gp) {
        int opcao;

        do {
            menu("Pacientes");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gp.cadastrar();
                    break;
                case 2:
                    gp.alterar();
                    break;
                case 3:
                    gp.excluir();
                    break;
                case 4:
                    gp.consultar();
                    break;
                case 5:
                    gp.relatorio();
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    public static void menuAtendimento(Scanner scanner, GerenciaAtendimento ga, GerenciaMedicos gm,
            GerenciaPacientes gp, Paciente[] pacientes, Medico[] medicos) {
        int opcao;

        do {
            System.out.println("--==[Atendimentos]==--");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar Estado");
            System.out.println("3 - Relatório");
            System.out.println("4 - Voltar ao menu principal");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ga.cadastrar(medicos, pacientes);
                    break;
                case 2:
                    ga.alterarEstado(medicos);
                    break;
                case 3:
                    ga.relatorio();
                    break;
            }

        } while (opcao != 4);
    }
}