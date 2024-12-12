public class ModelBA {
    String dados = "";
    ControllerBA controller;

    public void setController(ControllerBA controller) {
        this.controller = controller;
    }

    public void update(String dados) {
        this.dados = dados;
        controller.sendMessageToView(dados);
    }
}