package IntroducaoAoJava.Condicoes;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int secretNum = rand.nextInt(20)+1;

        System.out.println("Jogo do numero secreto");
        System.out.println("tente adivinhar um numero de 1 a 20");


        int tentativas = 0;
        boolean advinhou = false;

        while (!advinhou) {
            System.out.println("Digite sua resposta:");
            int chute = input.nextInt();
            tentativas++;

            if (chute == secretNum) {
                System.out.println("Voce acertou o numero secreto!" + secretNum);
                advinhou = true;
            } else if (chute < secretNum) {
                System.out.println("O numero secreto é maior. Tente novamente!");
            } else {
                System.out.println("O numero secreto é menor. Tente novamente!");
            }
        }

        input.close();
    }
}
