
package cadastropessoax;

import java.util.HashMap;

public class DAOProduto {
    private HashMap<Integer, Produto> databaseProduto = new HashMap();
    
    public void create(Produto p) {
        databaseProduto.put(p.id, p);
    }
    
    public Produto read(int id) {
        databaseProduto.get(id);
        return null;
    }
    
    public String listAll(){
        String report = "";
         for(final Produto p : this.databaseProduto.values()){
            report += p.getId() + " ";
            report += p.getNomeProduto() + "\n";
        }
        return report;
    }
      
}
