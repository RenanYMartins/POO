package Models;

public class Pessoa {
    private int id;
    private static int idInicial = 0;
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.id = idInicial++; 
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println("Id             : " + id);
        System.out.println("Nome           : " + nome);
        System.out.println("CPF            : " + cpf);
    }
}
