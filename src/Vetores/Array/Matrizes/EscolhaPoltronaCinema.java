package Vetores.Array.Matrizes;

import java.util.Scanner;

public class EscolhaPoltronaCinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] salaCinema = {
            {0, 0, 1, 0 ,0},
            {0, 0, 0, 0 ,1},
            {1, 0, 1, 0 ,0},
            {0, 0, 0, 1 ,0}
        };

        for (int i = 0; i < salaCinema.length; i++) {
            for (int j = 0; j < salaCinema[i].length; j++) {
                System.out.print(salaCinema[i][j] == 0 ? "L " : "O ");
            }
            System.out.println(" <-- Fila " + (i+1));

        }

        System.out.println("Escolha a fila: ");
        int fila = input.nextInt() - 1;

        System.out.println("Escolha o numero do assento: ");
        int numeroAssento = input.nextInt() - 1;

        if (fila >= 0 && fila < salaCinema.length && numeroAssento >=0 && numeroAssento < salaCinema[fila].length) {
            if (salaCinema[fila][numeroAssento] == 0) {
                salaCinema[fila][numeroAssento] = 1;
                System.out.println("Assento reservado");
            }
        } else {
            System.out.println("Nenhum assento foi encontrado.");
        }


        input.close();

    }
}
