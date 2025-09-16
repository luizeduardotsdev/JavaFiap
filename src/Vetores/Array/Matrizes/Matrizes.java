package Vetores.Array.Matrizes;

public class Matrizes {
    public static void main(String[] args) {

        int [][] matriz = new int[3][2]; // matriz de 3 linhas 2 colunas
        int[][] matrizDireta = {{1,2},{3,4},{5,6}};
        int elemento = matrizDireta[0][1];
        matrizDireta[0][1] = 10;

        for (int i = 0; i < matrizDireta.length; i++) {
            for (int j = 0; j < matrizDireta[i].length; j++) {
                System.out.println(matrizDireta[i][j]);
            }
        }
    }

}
