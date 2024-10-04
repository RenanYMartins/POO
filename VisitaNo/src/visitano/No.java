
package visitano;

public class No {
    String nomeDoNo = "";
    No no;
    
    public void setNomeDoNo(String nome){
        this.nomeDoNo = nome;
    }
        
    public void setNo(No no){
        this.no = no;
    }
    
    public No getNo(){
        return no;
    }
    
    public String toString(){
        return nomeDoNo;
    }
}
