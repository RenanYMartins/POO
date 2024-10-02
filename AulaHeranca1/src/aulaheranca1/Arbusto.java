package aulaheranca1;

// Classe de especializacao de arvore
public class Arbusto extends Arvore{
    String formato;
    
    public Arbusto(String especie, double altura, String formato){
        super(especie, altura); // esta instanciando o objeto arvore para utilizar como modelo para a classe arbusto
        setFormato(formato);
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    
    @Override
    public void showCircunferencia(){
        super.showCircunferencia(); // acessa o metodo da superclasse
        showCircunferencia(); // acessa o metodo da classe
    }
}
