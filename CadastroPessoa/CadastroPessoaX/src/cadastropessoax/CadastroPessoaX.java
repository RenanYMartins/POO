package cadastropessoax;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoaX {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList();
        
        Pessoa p1 = new Pessoa();
        p1.setCpf("9123");       
        p1.setNome("Jose da Silva");       
        
        Pessoa p2 = new Pessoa();
        p2.setCpf("2345");       
        p2.setNome("Maria Carvalho");       
        
        Pessoa p3 = new Pessoa();
        p3.setCpf("3456");       
        p3.setNome("John Doe");     
        
//        for(int i=1; i<4; i++)
//            listaPessoas.add("p"+i);
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
        
        listaPessoas.remove(p1);
        
        for(Pessoa p:listaPessoas){
            System.out.println(p.getCpf() + " " + p.getNome());
        }
        
        Pessoa xp = listaPessoas.get(0);
        System.out.println(xp.getNome());
        
        boolean contemObjeto = listaPessoas.contains(p2);
        
        // DAO = Data Access Object
        //======================================
        DAOPessoa daoPessoa = new DAOPessoa();
        daoPessoa.create(new Pessoa(1, "111", "Joao"));
        daoPessoa.create(new Pessoa(2, "222", "Maria"));
        daoPessoa.create(new Pessoa(3, "333", "Jose"));
        
        System.out.println(daoPessoa.listAll());
        
        // exclusao
        Pessoa pessoaSD = daoPessoa.read(1);
        if(daoPessoa.delete(pessoaSD))
            System.out.println("Exclusao com sucesso");
        else
            System.out.println("Exclusao falhou");
        
        // update
        Pessoa pessoaUp = new Pessoa(2, "444", "Maria Jose");
        daoPessoa.update(pessoaUp);
        
        System.out.println(daoPessoa.listAll());
    }
    
}
