public class App {
    public static void main(String[] args) throws Exception {

        AbacaxiImp abacaxi = new AbacaxiImp();
        LaranjaImp laranja = new LaranjaImp();
       
        Fatiador fatiador = new Fatiador(laranja);
        Fatiador fatiador1 = new Fatiador(abacaxi);
        
        fatiador.fatiar();
        fatiador1.fatiar();

    }
}
