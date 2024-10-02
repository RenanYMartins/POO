package mundoflorido;

public class MundoFlorido {

    public static void main(String[] args) {
//        Petala p1 = new Petala();
//        Petala p2 = new Petala();
//        Petala p3 = new Petala();
//
//        p1.setCor("Branco");
//        p2.setCor("azul");
//        p3.setCor("amarelo");
//
//        Flor gerbera = new Flor();
//        gerbera.setP1(p1);
//        gerbera.setP2(p2);
//        gerbera.setP3(p3);
//
//        gerbera.mostrarPetala();

        Petala x = new Petala("Azul");

        Flor margarida = new Flor(
                x,
                new Petala("Roxo"),
                new Petala("Azul"));
        
        x.setCor("Verde");
        x = null; // a outra funcao possui uma copia, entao atribuir null nao chamara o garbage collector
        
        margarida.mostrarPetala();
        
        Flor f1 = new Flor();
        f1.adicionarPetala(new Petala("Preto"));
        f1.adicionarPetala(new Petala("Preto"));
//        f1.adicionarPetala(new Ptala("Preto"));
        f1.mostrarPetala();
    }

}
