public class App {
    public static void main(String[] args) throws Exception {

        SomaImp soma = new SomaImp();
        SubtracaoImp subtracao = new SubtracaoImp();
        
        Calculadora calculadora = new Calculadora(soma);

        System.out.println("Soma: " + calculadora.efetuarCalculo(1, 2));

        Calculadora calculadora1 = new Calculadora(subtracao);

        System.out.println("Subtração: " + calculadora1.efetuarCalculo(1, 2));

    }
}
