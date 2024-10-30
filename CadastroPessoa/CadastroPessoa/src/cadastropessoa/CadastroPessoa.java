package cadastropessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class CadastroPessoa {

    public static void main(String[] args) {
//        ArrayList<String> times = new ArrayList<String>();
//        times.add("Arsenal");
//        times.add("Chelsea");
//        times.add("PSG");
//        
//        System.out.println(times.get(2));
//        System.out.println(times.size());
//        
//        for(int i=0; i<times.size();i++)
//            System.out.println(times.get(i));
//        times.remove(1);
//        for(String t:times)
//            System.out.println(t);
        
        //Map
        HashMap<String, String> cpfNome = new HashMap();
        cpfNome.put("12345678", "Joao da Silva");
        cpfNome.put("23456789", "Maria do Carmo");
        cpfNome.put("34567891", "Joaquim Jose Xavier");
        
        System.out.println(cpfNome.get("34567891"));
        
        Set<String> chaves=cpfNome.keySet();
        for(String cpf:cpfNome.keySet()){
            System.out.println(cpf);
            System.out.println(cpfNome.get(cpf));
        }
    }

}
