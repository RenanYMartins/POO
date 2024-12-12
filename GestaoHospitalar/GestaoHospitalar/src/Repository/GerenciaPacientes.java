package Repository;

import java.util.Scanner;

import Models.Paciente;

public class GerenciaPacientes {
    private Paciente pacientes[];
    private Scanner ent;

    public GerenciaPacientes(Paciente pacientes[]) {
        this.pacientes = pacientes;
        ent = new Scanner(System.in);
    }

    public Paciente buscarPacientePorId(int id) {
        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.getId() == id) {
                return paciente;
            }
        }
        return null;
    }

    public void cadastrar() {
        String nome, cpf, nomeConv, numConv;

        int i = 0;
        while ((i < pacientes.length) && (pacientes[i] != null)) {
            i++;
        }
        if (i < pacientes.length) {
            System.out.println("--==[Cadastro de Pacientes]==--");
            System.out.print("Nome: ");
            nome = ent.nextLine();
            System.out.print("CPF: ");
            cpf = ent.nextLine();
            System.out.print("Nome Convênio: ");
            nomeConv = ent.nextLine();
            System.out.print("Número Convênio: ");
            numConv = ent.nextLine();

            pacientes[i] = new Paciente(nome, cpf, nomeConv, numConv);
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void alterar() {
        String nome, cpf, nomeConv, numConv;
        int id, resp;

        System.out.println("--==[Alteração de Pacientes]==--");
        System.out.print("Qual paciente deseja alterar? (Entre com o ID do paciente): ");
        id = ent.nextInt();
        ent.nextLine();

        Paciente paciente = buscarPacientePorId(id);

        if (paciente != null) {
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + paciente.getNome());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo nome: ");
                nome = ent.nextLine();
                paciente.setNome(nome);
            }
            System.out.println("----------------------------------");
            System.out.println("CPF atual: " + paciente.getCpf());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo CPF: ");
                cpf = ent.nextLine();
                paciente.setCpf(cpf);
            }
            System.out.println("----------------------------------");
            System.out.println("Nome do Convênio atual: " + paciente.getNomeConvenio());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo Nome do Convênio: ");
                nomeConv = ent.nextLine();
                paciente.setNomeConvenio(nomeConv);
            }
            System.out.println("----------------------------------");
            System.out.println("Número do Convênio atual: " + paciente.getNumeroConvenio());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo Número do Convênio: ");
                numConv = ent.nextLine();
                paciente.setNumeroConvenio(numConv);
            }
            System.out.println("----------------------------------");

            System.out.println("Atualização realizada com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void excluir() {
        int id, resp;

        System.out.println("--==[Exclusão de Pacientes]==--");
        System.out.print("Qual paciente deseja excluir? (Entre com o ID do paciente): ");
        id = ent.nextInt();

        Paciente paciente = buscarPacientePorId(id);

        if (paciente != null) {
            System.out.println("-=[Dados do Paciente]=-");
            paciente.imprimir();
            System.out.print("\nConfirma exclusão? (1-sim/2-não): ");
            resp = ent.nextInt();

            if (resp == 1) {
                for (int i = 0; i < pacientes.length; i++) {
                    if (pacientes[i] != null && pacientes[i].getId() == id) {
                        pacientes[i] = null; // Remove o paciente
                        System.out.println("Exclusão efetuada com sucesso.");
                        break;
                    }
                }
            } else {
                System.out.println("Exclusão não efetuada.");
            }
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void consultar() {
        int id;

        System.out.println("--==[Consulta de Pacientes]==--");
        System.out.print("Qual paciente deseja consultar? (Entre com o ID do paciente): ");
        id = ent.nextInt();

        Paciente paciente = buscarPacientePorId(id);

        if (paciente != null) {
            System.out.println("-=[Dados do Paciente]=-");
            paciente.imprimir();
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void relatorio() {
        int pos = 0;

        System.out.println("--==[Relatório de Pacientes]==--");

        while (pos < pacientes.length) {
            if (pacientes[pos] != null) {
                pacientes[pos].imprimir();
                System.out.println("\n-----------------------------------\n");
            }

            pos++;
        }
    }
}