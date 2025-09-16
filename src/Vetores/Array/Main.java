package Vetores.Array;

public class Main {
    public static void main(String[] args) {
//        int[] meuVetor = new int [10];
        int[] meuVetor = {1, 10, 30, 40, 25 };

        meuVetor[2] = 35;

        System.out.println(meuVetor.length);
        System.out.println(meuVetor[2]);

        for (int i = 0; i < meuVetor.length ; i++) {
            System.out.println(meuVetor[i]);
        }

    }
}
