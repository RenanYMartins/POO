
package visitano;

public class Personagem {
    String nome;
    Sala sala;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSala(Sala sala){
        this.sala = sala;
    }
    
    public Sala vaParaSala(String direcao){
        if(sala.getSala(direcao) == null){
            System.out.println(sala + "->Colidiu!");
            return sala;
        }
        sala = sala.getSala(direcao);
        System.out.println(sala);
        return sala;
    }
    
    public String toString(){
        return nome + ":" + sala;
    }
}
