package IntroducaoAoJava.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;

        System.out.println("Escolha um tipo de operacao!");
        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        int operacao = sc.nextInt();

        System.out.println("Escolha o primeiro numero");
        double num1 = sc.nextDouble();
        System.out.println("Escolha o segundo numero");
        double num2 = sc.nextDouble();

        switch (operacao) {
            case 1:
                result = num1 + num2;
                System.out.println(result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(result);
                }
                System.out.println("Nao existe divisao por 0");
                break;
            default:
                System.out.println("Voce escolheu um opcao invalida! Tente novamente.");
        }

        sc.close();
    }
}
