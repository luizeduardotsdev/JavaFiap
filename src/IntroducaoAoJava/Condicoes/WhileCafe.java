package IntroducaoAoJava.Condicoes;

import java.util.Scanner;

public class WhileCafe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorTotal = 0;
        double preco = 0;
        int quantidade = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Digite o tamanho do cafe ( P, M e G)(S para cancelar)  ");
            String tamanho = input.nextLine().toUpperCase();

            if (tamanho.equals("S".toUpperCase())) {
                System.out.println("Fechando pedidos");
                continuar = false;
            } else {
                System.out.println("Digite o tipo do cafe ( E, C e L) ");
                String tipoCafe = input.nextLine().toUpperCase();

                switch (tamanho) {
                    case "P":
                        preco += 2.50;
                        break;
                    case "M":
                        preco += 3.00;
                        break;
                    case "G":
                        preco += 3.50;
                        break;
                    default:
                        System.out.println("Opcao invalida tente novamente");
                        continue;
                }

                switch (tipoCafe) {
                    case "E":
                        preco += 1.50;
                        break;
                    case "C":
                        preco += 2.00;
                        break;
                    case "L":
                        preco += 2.50;
                        break;
                    default:
                        System.out.println("Opcao invalida tente novamente");
                        continue;
                }
                valorTotal += preco;
                quantidade++;

            }

            System.out.println("O preço a se pagar é: " + valorTotal);
            System.out.println("Quantidade de cafes: "+quantidade );
            }

        input.close();
    }
}
