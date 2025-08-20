package HandsOn.Desafio1;

import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo maior que 1: ");
        int num = input.nextInt();

        if (num <= 1){
            System.out.println("Numero invalido");
        } else {
            boolean isPrimo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo){
                System.out.println("Primo " + num);
            } else {
                System.out.println("Nao é primo " + num);
            }
        }


        input.close();
    }
}
