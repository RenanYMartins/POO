package SerializacaoObjetos;

import com.google.gson.Gson;

public class PrincipalObjetosJSON {

    public static void main(String[] args) {
        Pessoa pessoaToJson = new Pessoa("João", 30);
        Gson gson = new Gson();
        String json = gson.toJson(pessoaToJson);
        System.out.println(json);
        
        Pessoa pessoaFromJson=gson.fromJson(json,Pessoa.class);
    }

}

//https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10/