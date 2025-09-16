package Vetores.Array.Vetor;

import java.util.Scanner;

public class GerenciadorDeNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[5];
        double somaNotas = 0;


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a "+ (i+1) +" nota: ");
            notas[i] = input.nextDouble();
        }


        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        System.out.println("Media: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        input.close();

    }
}
