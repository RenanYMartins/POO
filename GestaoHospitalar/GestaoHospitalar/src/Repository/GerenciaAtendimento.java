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
        for (Paciente paciente : pacientes) {
            if (paciente != null) {
                // Exibe o ID do paciente e o nome
                System.out.println(paciente.getId() + " - " + paciente.getNome());
            }
        }
        int pacienteId = entrada.nextInt();
        entrada.nextLine();
    
        // Verifica se o paciente existe com o ID
        Paciente pacienteSelecionado = null;
        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.getId() == pacienteId) {
                pacienteSelecionado = paciente;
                break;
            }
        }
        
        if (pacienteSelecionado == null) {
            System.out.println("Paciente inválido!");
            return;
        }
    
        System.out.println("Selecione o médico pelo ID:");
        for (Medico medico : medicos) {
            if (medico != null) {
                // Exibe o ID do médico e o nome
                System.out.println(medico.getId() + " - " + medico.getNome());
            }
        }
        int medicoId = entrada.nextInt();
        entrada.nextLine();
    
        // Verifica se o médico existe com o ID
        Medico medicoSelecionado = null;
        for (Medico medico : medicos) {
            if (medico != null && medico.getId() == medicoId) {
                medicoSelecionado = medico;
                break;
            }
        }
        
        if (medicoSelecionado == null) {
            System.out.println("Médico inválido!");
            return;
        }
    
        // Cria o atendimento com base nos médicos e pacientes
        Atendimento atendimento = new Atendimento(medicoSelecionado, pacienteSelecionado);
        atendimentos.add(atendimento);
        System.out.println("Atendimento cadastrado com sucesso!");
    }
    

    public void alterarEstado(Medico[] medicos) {
        System.out.println("--------------------[Alteração do Estado de Atendimento]--------------------");

        for (int i = 0; i < atendimentos.size(); i++) {
            System.out.println(i + " - ");
            atendimentos.get(i).imprimir();
        }
        System.out.println("Escolha o atendimento pelo ID:");
        int atendimentoId = entrada.nextInt();
        entrada.nextLine();

        if (atendimentoId < 0 || atendimentoId >= atendimentos.size()) {
            System.out.println("Atendimento inválido!");
            return;
        }

        System.out.println("Digite o ID do médico para validação: ");
        int idMedico = entrada.nextInt();
        entrada.nextLine();

        Medico medicoLogado = null;
        for (Medico medico : medicos) {
            if (medico != null && medico.getId() == idMedico) {
                medicoLogado = medico;
                break;
            }
        }

        if (medicoLogado == null) {
            System.out.println("Médico não encontrado com o ID informado! Retornando ao menu.");
            return;
        }

        System.out.println("Selecione o novo estado: ");
        for (Atendimento.EstadoAtendimento estado : Atendimento.EstadoAtendimento.values()) {
            System.out.println(estado.ordinal() + " - " + estado);
        }
        int estadoId = entrada.nextInt();
        entrada.nextLine();

        if (atendimentoId >= 0 && atendimentoId < atendimentos.size()) {
            Atendimento atendimento = atendimentos.get(atendimentoId);
            atendimento.alterarEstado(medicoLogado, Atendimento.EstadoAtendimento.values()[estadoId]);
            System.out.println("Estado do atendimento alterado com sucesso.");
        } else {
            System.out.println("Atendimento não encontrado.");
        }
    }

    public void relatorio() {
        System.out.println("--------------------[Relatório de Atendimentos]--------------------");
        for (Atendimento atendimento : atendimentos) {
            atendimento.imprimir();
            System.out.println("---------------------------");
        }
    }

}
