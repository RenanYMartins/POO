public class ViewBA {
    String dados = "";
    ControllerBA controller;

    public void setController(ControllerBA controller) {
        this.controller = controller;
    }

    public void update(String dados) {
        this.dados = dados;
        mostrar();
    }

    public void mostrar() {
        System.out.println(dados);
    }

    public void insertData(String dados) {
        controller.sendMessageToModel(dados);
    }
}
