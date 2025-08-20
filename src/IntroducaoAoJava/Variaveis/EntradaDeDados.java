package IntroducaoAoJava.Variaveis;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do Produto: ");
        String product = input.nextLine();

        System.out.println("Digite o valor do Produto: ");
        double price = input.nextDouble();

        System.out.println("Digite a quantidade");
        int quantity = input.nextInt();

        System.out.println("O produto escolhido é: " + product + " no valor de: R$" + price + " e com " +quantity + " quantidades escolhida " );

        input.close();
    }
}
