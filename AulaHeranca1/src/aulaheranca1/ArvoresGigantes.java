package aulaheranca1;

public class ArvoresGigantes extends Arvore{
    private int idade;
    
    public ArvoresGigantes(String especie, double altura, int idade){
        super(especie, altura);
        setIdade(idade);
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

}
