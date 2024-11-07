
package ReflectionJava;

import java.lang.reflect.Field;

/**
 *
 * @author felipe
 */
public class ModificandoCamposViaReflection {

    public static void main(String[] args) {
        try {
            // Obtém o objeto Class da classe "Exemplo"
            Class<?> classe = Class.forName("ReflectionJava.Exemplo");

            // Cria uma nova instância da classe "Exemplo"
            Object obj = classe.getConstructor().newInstance();

            // Obtém o campo privado "campoPrivado"
            Field campoExemplo = classe.getDeclaredField("campoPrivado");

            // Torna o campo acessível
            campoExemplo.setAccessible(true);

            // Define um novo valor para o campo "campoPrivado"
            campoExemplo.set(obj, "Novo Valor");

            // Imprime o novo valor do campo
            System.out.println("Campo modificado: " + campoExemplo.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
