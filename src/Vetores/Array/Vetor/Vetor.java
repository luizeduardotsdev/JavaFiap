package Vetores.Array.Vetor;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite um valor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para a posicao [" + i + "] do array");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();

    }
}
