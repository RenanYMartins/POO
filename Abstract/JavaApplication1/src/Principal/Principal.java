package Principal;

public class Principal {
    public static void main(String[] args) {
        Gato g = new Gato();
        Cao c = new Cao();
        
        darUmTapaNo(g);
        darUmTapaNo(c);
    }
    
    public static void darUmTapaNo(AnimalX animal){
        animal.emitirRuido();
    }
}
