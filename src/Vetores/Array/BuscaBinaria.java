package Vetores.Array;

public class BuscaBinaria {
    public static void main(String[] args) {

        int[] vetorOrdenado = {11, 12, 33, 44, 55, 66, 77, 88, 99};
        int elementoProcurado = 88;

        int inicio = 0;
        int fim = vetorOrdenado.length - 1;
        int posicaoEncontrada = -1;


        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetorOrdenado[meio] == elementoProcurado) {
                posicaoEncontrada = meio;
                break;
            } else if (vetorOrdenado[meio] < elementoProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }

        }


        if (posicaoEncontrada != -1) {
            System.out.println("elemento encontrado: " + posicaoEncontrada);
        } else {
            System.out.println("elemento nao encontrado");
        }
    }
}
