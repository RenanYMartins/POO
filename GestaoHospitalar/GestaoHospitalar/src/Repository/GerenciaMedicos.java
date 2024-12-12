package Repository;

import java.util.Scanner;

import Models.Medico;

public class GerenciaMedicos {
    private Medico medicos[];
    private Scanner ent;

    public GerenciaMedicos(Medico meds[]) {
        medicos = meds;
        ent = new Scanner(System.in);
    }

    public void cadastrar() {
        String nome, cpf, crm, especialidade;

        int i = 0;
        while ((i < medicos.length) && (medicos[i] != null)) {
            i++;
        }
        if (i < medicos.length) {
            System.out.println("--==[Cadastro de Médicos]==--");
            System.out.print("Nome: ");
            nome = ent.nextLine();
            System.out.print("CPF: ");
            cpf = ent.nextLine();
            System.out.print("CRM: ");
            crm = ent.nextLine();
            System.out.print("Especialidade: ");
            especialidade = ent.nextLine();

            medicos[i] = new Medico(nome, cpf, crm, especialidade);
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void alterar() {
        String nome, cpf, crm, especialidade;
        int pos, resp;

        System.out.println("--==[Alteração de Médicos]==--");
        System.out.print("Qual médico deseja alterar? (Entre com o ID do médico): ");
        pos = ent.nextInt();
        ent.nextLine();
        if (medicos[pos] != null) {
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + medicos[pos].getNome());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();

            if (resp == 1) {
                System.out.print("Digite o novo nome: ");
                nome = ent.nextLine();
                medicos[pos].setNome(nome);
            }
            System.out.println("----------------------------------");
            System.out.println("CPF atual: " + medicos[pos].getCpf());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo CPF: ");
                cpf = ent.nextLine();
                medicos[pos].setCpf(cpf);
            }
            System.out.println("----------------------------------");
            System.out.println("CRM atual: " + medicos[pos].getCrm());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo CRM: ");
                crm = ent.nextLine();
                medicos[pos].setCrm(crm);
            }
            System.out.println("----------------------------------");
            System.out.println("Especialidade atual: " + medicos[pos].getEspecialidade());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite a nova Especialidade: ");
                especialidade = ent.nextLine();
                medicos[pos].setEspecialidade(especialidade);
            }
            System.out.println("----------------------------------");

            System.out.println("Atualização realizada com sucesso.");
        } else {
            System.out.println("Médico não encontrado.");
        }
    }

    public void excluir() {
        int pos, resp;

        System.out.println("--==[Exclusão de Médicos]==--");
        System.out.print("Qual médico deseja excluir? (Entre com o ID do médico): ");
        pos = ent.nextInt();

        if (medicos[pos] != null) {
            System.out.println("-=[Dados do Médico]=-");
            medicos[pos].imprimir();
            System.out.print("\nConfirma exclusão? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();

            if (resp == 1) {
                medicos[pos] = null;
                System.out.println("Exclusão efetuada com sucesso.");
            } else {
                System.out.println("Exclusão não efetuada.");
            }
        } else {
            System.out.println("Médico não existe.");
        }
    }

    public void consultar() {
        int pos;

        System.out.println("--==[Consulta de Médicos]==--");
        System.out.print("Qual médico deseja consultar? (Entre com o ID do médico): ");
        pos = ent.nextInt();

        if (medicos[pos] != null) {
            System.out.println("-=[Dados do Médico]=-");
            medicos[pos].imprimir();
        } else {
            System.out.println("Médico não existe.");
        }
    }

    public void relatorio() {
        int pos = 0;

        System.out.println("--==[Relatório de Médicos]==--");

        while (pos < medicos.length) {
            if (medicos[pos] != null) {
                medicos[pos].imprimir();
                System.out.println("\n-----------------------------------\n");
            }

            pos++;
        }
    }
}