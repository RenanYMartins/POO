package cadastropessoax;

import java.util.HashMap;

public class CadastroProduto {

    public static void main(String[] args) {
        DAOProduto daoProduto = new DAOProduto();
        daoProduto.create(new Produto(1, "Betoneira"));
        
        System.out.println(daoProduto.listAll());

    }
}
