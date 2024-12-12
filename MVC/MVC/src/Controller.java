public class Controller {
    // o objetivo do controller eh ligar a model com a view
    
    public void rotear(View view, Model model) {
        view.setModel(model);
        model.setView(view);
    }
}
