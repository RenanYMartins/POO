package Models;

public class Atendimento {
    public enum EstadoAtendimento {
        ENTRADA,
        TRATAMENTO_CLINICO_GERAL,
        PREPARACAO_PRE_CIRURGIA,
        CIRURGIA,
        POS_CIRURGIA,
        ALTA_CLINICA
    }

    private Medico medico;
    private Paciente paciente;
    private EstadoAtendimento estadoAtual;

    public Atendimento(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
        this.estadoAtual = EstadoAtendimento.ENTRADA;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente paciente() {
        return paciente;
    }

    public EstadoAtendimento getEstadoAtual() {
        return estadoAtual;
    }

    public void alterarEstado(Medico medico, EstadoAtendimento novoEstado) {
        if (this.medico.equals(medico)) {
            this.estadoAtual = novoEstado;
            System.out.println("Estado alterado para: " + estadoAtual);
        } else {
            System.out.println("Somente o médico responsável pode alterar o estado.");
        }
    }

    public void imprimir() {
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico responsável: " + medico.getNome());
        System.out.println("Estado atual: " + estadoAtual);
    }

}
