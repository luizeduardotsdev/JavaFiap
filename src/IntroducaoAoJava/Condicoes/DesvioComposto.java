package IntroducaoAoJava.Condicoes;

import java.util.Scanner;

public class DesvioComposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}
