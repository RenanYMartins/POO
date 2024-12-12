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

    public Medico buscarMedicoPorId(int id) {
        for (Medico medico : medicos) {
            if (medico != null && medico.getId() == id) {
                return medico;
            }
        }
        return null;
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
        int id, resp;
    
        System.out.println("--==[Alteração de Médicos]==--");
        System.out.print("Qual médico deseja alterar? (Entre com o ID do médico): ");
        id = ent.nextInt();
        ent.nextLine();
    
        Medico medico = buscarMedicoPorId(id);
    
        if (medico != null) {
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + medico.getNome());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
    
            if (resp == 1) {
                System.out.print("Digite o novo nome: ");
                nome = ent.nextLine();
                medico.setNome(nome);
            }
            System.out.println("----------------------------------");
            System.out.println("CPF atual: " + medico.getCpf());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo CPF: ");
                cpf = ent.nextLine();
                medico.setCpf(cpf);
            }
            System.out.println("----------------------------------");
            System.out.println("CRM atual: " + medico.getCrm());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite o novo CRM: ");
                crm = ent.nextLine();
                medico.setCrm(crm);
            }
            System.out.println("----------------------------------");
            System.out.println("Especialidade atual: " + medico.getEspecialidade());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if (resp == 1) {
                System.out.print("Digite a nova Especialidade: ");
                especialidade = ent.nextLine();
                medico.setEspecialidade(especialidade);
            }
            System.out.println("----------------------------------");
    
            System.out.println("Atualização realizada com sucesso.");
        } else {
            System.out.println("Médico não encontrado.");
        }
    }
    
    public void excluir() {
        int id, resp;
    
        System.out.println("--==[Exclusão de Médicos]==--");
        System.out.print("Qual médico deseja excluir? (Entre com o ID do médico): ");
        id = ent.nextInt();
    
        Medico medico = buscarMedicoPorId(id);
    
        if (medico != null) {
            System.out.println("-=[Dados do Médico]=-");
            medico.imprimir();
            System.out.print("\nConfirma exclusão? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
    
            if (resp == 1) {
                for (int i = 0; i < medicos.length; i++) {
                    if (medicos[i] != null && medicos[i].getId() == id) {
                        medicos[i] = null; // Remove o médico
                        System.out.println("Exclusão efetuada com sucesso.");
                        break;
                    }
                }
            } else {
                System.out.println("Exclusão não efetuada.");
            }
        } else {
            System.out.println("Médico não encontrado.");
        }
    }
    
    public void consultar() {
        int id;
    
        System.out.println("--==[Consulta de Médicos]==--");
        System.out.print("Qual médico deseja consultar? (Entre com o ID do médico): ");
        id = ent.nextInt();
    
        Medico medico = buscarMedicoPorId(id);
    
        if (medico != null) {
            System.out.println("-=[Dados do Médico]=-");
            medico.imprimir();
        } else {
            System.out.println("Médico não encontrado.");
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