package cadastropessoax;

public class Produto {

    int id;
    String nomeProduto;

    public Produto(int id, String nomeProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
    }
    
    public Produto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

}
