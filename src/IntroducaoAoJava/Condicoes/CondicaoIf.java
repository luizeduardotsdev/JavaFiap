package IntroducaoAoJava.Condicoes;

import java.util.Scanner;

public class CondicaoIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Acesso concedido");
        }

        input.close();
    }
}
