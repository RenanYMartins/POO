public class App {
    public static void main(String[] args) throws Exception {
        ModelBA model = new ModelBA();
        ViewBA view = new ViewBA();
        ControllerBA controller = new ControllerBA();
        controller.ligacaoCamadas(view, model);

        model.update("Olá mundo");
        
    }
}
