package acessobanco;

public class Contatos {

    private int idContato;
    private String nomeContato;

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }    
    
    @Override
    public String toString() {
        return this.idContato + ": " + this.nomeContato;
    }

}
