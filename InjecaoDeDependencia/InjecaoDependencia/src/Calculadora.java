public class Calculadora {
    ICalculo calculo; // objeto sendo injetado 

    public Calculadora(ICalculo calculo) { // injecao de dependencia
        this.calculo = calculo;
    }

    public double efetuarCalculo(double a, double b) {
        // inversao de controle
        return calculo.efetuar(a, b);
    }
}
