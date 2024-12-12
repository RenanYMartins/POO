public class View {
    Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    String dados = "";

    public void mostrarDados() {
        System.out.println(dados);
    }

    public void update() {
        dados = model.getDados(); // a view tem a responsabilidade de "puxar" os dados da model, e nao esperar eles serem disponibilizados
        mostrarDados();
    }

    public void atualizaDados(String dados) {
        model.atualizarDados(dados);
    }
}