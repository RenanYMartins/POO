package aulaheranca1;

public class AulaHeranca1 {

    public static void main(String[] args) {
        Arvore arvore = new Arvore("Jacaranda", 30);
        Arbusto arbusto = new Arbusto("Margarida", 0.3, "verical");
        MiniArbusto mini = new MiniArbusto("relva", 0.1, "horizontal");

        Arvore ar = new Arbusto("aaa", 0.9, "oblongo"); // se for chamado algum metodo, e o mesmo existir tanto no pai quanto no filho, sera chamado o metodo do filho. Caso contrario, sera do pai
        
        imprime(arbusto);
        imprime(arbusto, mini);
    }
    
    public static void imprime(Arvore m){
        System.out.println(m);
    }
    
    // polimorfismo estatico. Tem o mesmo nome e recebe parametros diferentes
    // na chamada do programa, eh diferenciado tipo e quantidade para definir qual sera o metodo chamado.
    public static void imprime(Arvore m, Arvore n){
        System.out.println(m);
        System.out.println(n);
    }

}
