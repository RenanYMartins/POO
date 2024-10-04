
package visitano;

import java.util.Random;
import java.util.Scanner;

public class VisitaNo {

    public static void main(String[] args) {
        Sala salaDeEntrada = new Sala();
        Sala salaoNobre = new Sala();
        
        salaDeEntrada.setNomeDaSala("Sala de Entrada");
        salaoNobre.setNomeDaSala("Salao Nobre");
        
        salaDeEntrada.setSalaLeste(salaoNobre);
        salaoNobre.setSalaOeste(salaDeEntrada);
        
        Personagem mario = new Personagem();
        mario.setNome("Mario");
        mario.setSala(salaDeEntrada);
        
        Personagem crash = new Personagem();
        crash.setNome("Crash");
        crash.setSala(salaDeEntrada);
        
        mario.vaParaSala("Oeste");
        mario.vaParaSala("Leste");
        mario.vaParaSala("Oeste");
        
        Random r = new Random();
        Scanner leitor = new Scanner(System.in);
        int opcao=0;
        String[] direcoes = {"Norte", "Sul", "Leste", "Oeste"};

        while(opcao!=5){
            System.out.println("1 - N");
            System.out.println("2 - S");
            System.out.println("3 - L");
            System.out.println("4 - O");
            System.out.println("5 - Sair");
            opcao = leitor.nextInt();
            if(opcao > 0 && opcao < 5){
                mario.vaParaSala(direcoes[opcao-1]);
            }
            crash.vaParaSala(direcoes[r.nextInt(4)]);
        }
    }
    
}
