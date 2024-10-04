
package visitano;

public class Sala {
    String nomeDaSala = "";
    Sala norte, sul, leste, oeste;
    
    public void setNomeDaSala(String nome){
        this.nomeDaSala = nome;
    }
    
    public void setSalaNorte(Sala sala){
        this.norte = sala;
    }
    
    public void setSalaSul(Sala sala){
        this.sul = sala;
    }
    
    public void setSalaLeste(Sala sala){
        this.leste = sala;
    }
    
    public void setSalaOeste(Sala sala){
        this.oeste = sala;
    }
    
    public Sala getSala(String direcao){
        switch (direcao) {
            case "Norte":
                return norte;
            case "Sul":
                return sul;
            case "Leste":
                return leste;
            case "Oeste":
                return oeste;
            default:
                break;
        }
        return null;
    }
    
    public String toString(){
        return nomeDaSala;
    }
}
