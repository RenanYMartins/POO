public class Fatiador {
    IFatiar ifatiar;

    Fatiador(IFatiar ifatiar) {
        this.ifatiar = ifatiar;
    }

    public void fatiar() {
        ifatiar.acao();
    }
}
