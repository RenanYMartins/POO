package Models;

public class Paciente extends Pessoa {
    private String nomeConvenio;
    private String numeroConvenio;

    public Paciente(String nome, String cpf, String nomeConv, String numConv) {
        super(nome, cpf);
        this.nomeConvenio = nomeConv;
        this.numeroConvenio = numConv;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Nome Convênio  : " + nomeConvenio);
        System.out.println("Número Convênio: " + numeroConvenio);
    }
}
