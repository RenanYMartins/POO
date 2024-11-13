/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Pizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAOPizza daoPizza = new DAOPizza();
        
        Pizza p1 = new Pizza();
        p1.setId(1);
        p1.setSabor("Napolitano");
        p1.setValor(79.00);
        
        daoPizza.create(p1);
        System.out.println(daoPizza.listAll());
        
//        Pizza p2 = new Pizza();
//        Pizza p3 = new Pizza();
        
        
    }
    
}
