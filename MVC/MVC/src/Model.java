public class Model {
    View view;
    
    public void setView(View view) {
        this.view = view;
    }

    String dados = "";

    public void atualizarDados(String dados) {
        this.dados = dados;
        view.update();
    }

    public String getDados() {
        return dados;
    }
}
