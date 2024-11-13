package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class DAOPizza {
    private List<Pizza> databasePizza = new ArrayList();
    
    public void create(Pizza p){
        databasePizza.add(p);
    }
    
    public Pizza read(int id){
        for (Pizza p : databasePizza) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
     public String listAll() {
        String report = "";
        for (Pizza p : databasePizza) {
            report += "Id: " + p.getId() + "\n";
            report += "Sabor: " + p.getSabor() + "\n";
            report += "Valor: R$ " + p.getValor() + "\n";
//            "--------------------------------------\n";
        }
        return report;
    }
}
