
package aulaheranca1;

public class Arvore {
    private String especie;
    private double altura;
    
    public Arvore(String especie, double altura){;;
        this.especie = especie;
        this.altura = altura;
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return especie + "," + altura;
    }
    
    public void showCircunferencia(){
        
    }
    
}
