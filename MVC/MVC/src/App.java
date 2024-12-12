import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();

        controller.rotear(view, model);

        model.atualizarDados("Olá Mundo");

        System.out.print("Digite o novo dado: ");
        String novoDado = scanner.nextLine();

        model.atualizarDados(novoDado);

        scanner.close();
    }
}
