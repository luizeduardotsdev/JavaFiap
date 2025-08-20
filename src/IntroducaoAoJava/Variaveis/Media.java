package IntroducaoAoJava.Variaveis;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int a = input.nextInt();

        System.out.println("Digite a segunda nota: ");
        int b = input.nextInt();

        int media = (a + b) / 2;
        System.out.println(media);

        input.close();
    }
}
