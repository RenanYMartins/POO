package Repository;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Atendimento;
import Models.Medico;
import Models.Paciente;

public class GerenciaAtendimento {
    private ArrayList<Atendimento> atendimentos;
    private Scanner entrada;

    public GerenciaAtendimento() {
        atendimentos = new ArrayList<>();
        entrada = new Scanner(System.in);
    }

    public void cadastrar(Medico[] medicos, Paciente[] pacientes) {
        System.out.println("--------------------[Cadastro de Atendimento]--------------------");

        System.out.println("Selecione o paciente pelo ID:");
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i] != null) {
                System.out.println(i + " - " + pacientes[i].getNome());
            }
        }
        int pacienteId = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Selecione o médico pelo ID:");
        for (int i = 0; i < medicos.length; i++) {
            if (medicos[i] != null) {
                System.out.println(i + " - " + medicos[i].getNome());
            }
        }
        int medicoId = entrada.nextInt();
        entrada.nextLine();

        if (pacientes[pacienteId] != null && medicos[medicoId] != null) {
            Atendimento atendimento = new Atendimento(medicos[medicoId], pacientes[pacienteId]);
            atendimentos.add(atendimento);
            System.out.println("Atendimento cadastrado com sucesso!");
        } else {
            System.out.println("Paciente ou médico inválido!");
        }
    }

    public void alterarEstado(Medico[] medicos) {
        System.out.println("--------------------[Alteração do Estado de Atendimento]--------------------");

        for(int i = 0; i <  atendimentos.size(); i++) {
            System.out.println(i + " - ");
            atendimentos.get(i).imprimir();
        }
        System.out.println("Escolha o atendimento pelo ID:");
        int atendimentoId = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o ID do médico para validação: ");
        int idMedico = entrada.nextInt();
        Medico medicoLogado = null;

        for(Medico medico : medicos) {
            if(medico.getId() == idMedico) {
                medicoLogado = medico;
                break;
            }
        }

        if(medicoLogado != null) {
            System.out.println("Selecione o novo estado: ");
            for(Atendimento.EstadoAtendimento estado : Atendimento.EstadoAtendimento.values()) {
                System.out.println(estado.ordinal() + " - " + estado);
            }
            int estadoId = entrada.nextInt();
            entrada.nextLine();

            Atendimento atendimento = atendimentos.get(atendimentoId);
            atendimento.alterarEstado(medicoLogado, Atendimento.EstadoAtendimento.values()[estadoId]);
        } else {
            System.out.println("Médico não encontrado.");
        }
    }
    
    public void relatorio() {
        System.out.println("--------------------[Relatório de Atendimentos]--------------------");
        for(Atendimento atendimento : atendimentos) {
            atendimento.imprimir();
            System.out.println("---------------------------");
        }
    }
}
