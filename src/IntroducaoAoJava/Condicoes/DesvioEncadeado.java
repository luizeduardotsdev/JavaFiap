package IntroducaoAoJava.Condicoes;

import java.util.Scanner;

public class DesvioEncadeado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto o cliente gastou: ");
        double gasto = input.nextDouble();

        System.out.println("Quantas compras foram realizdas: ");
        int compras = input.nextInt();

        if (gasto > 2000 && compras >= 10) {
            System.out.println("Categoria Vip");
        } else if (gasto > 1000) {
            System.out.println("Categoria Ouro");
        } else if (gasto > 500 || compras > 5) {
            System.out.println("Categoria Prata");
        } else {
            System.out.println("Categoria Bronze");
        }

        input.close();
    }
}
