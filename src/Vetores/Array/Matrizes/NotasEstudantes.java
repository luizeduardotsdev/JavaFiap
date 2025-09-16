package Vetores.Array.Matrizes;

public class NotasEstudantes {
    public static void main(String[] args) {

        double[][] notas = {
                {7.5, 8.0, 9.9},
                {7.5, 6.0, 8.5},
                {8.0, 9.0, 9.5},
        };

        for (int i = 0; i < notas.length; i++) {
            double somaNotas = 0;
            for (int j = 0; j < notas.length; j++) {
                somaNotas += notas[i][j];
            }

            double media = somaNotas / notas.length;
            System.out.println("Media do estudante  " + (i+1) + ": " + media);

        }



    }
}
