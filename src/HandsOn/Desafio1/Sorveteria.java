package HandsOn.Desafio1;

import java.util.Scanner;

public class Sorveteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtndSorvete = 0;
        double valorTotal = 0;
        double valorSorvete = 0;
        boolean finalizarPedido = true;

        while (finalizarPedido) {
            System.out.println("1 Bola casquinha R$ 6,00");
            System.out.println("2 Bola casquinha R$ 9,00");
            System.out.println("3 Bola casquinha R$ 12,00");
            System.out.println("Tente novamente ou 0 para cancelar");
            int opcao = input.nextInt();

            switch (opcao) {
                case 0:
                    finalizarPedido = false;
                    break;
                case 1:
                    valorSorvete = 6.00;
                    break;
                case 2:
                    valorSorvete = 9.00;
                    break;
                case 3:
                    valorSorvete = 12.00;
                    break;
                default:
                    System.out.println("Tente novamente ou 0 para cancelar");
                    break;
            }

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("Deseja quantas quantidades desse sorvete");
                int qntd = input.nextInt();
                qtndSorvete += qntd;
                valorTotal = valorSorvete * qntd;

                for (int i = 0; i < qntd; i++) {
                    System.out.println("Deseja adicionar cobertura 1 - Sim - 2 Nao");
                    int cobertura = input.nextInt();

                    if (cobertura == 1) {
                        System.out.println("Opcoes de cobertura ");
                        System.out.println("1 Cobertura de chocolate R$2,00");
                        System.out.println("2 Cobertura de avela R$3,00");
                        System.out.println("3 Cobertura de morango R$2,00");
                        int saborCobertura = input.nextInt();

                        switch (saborCobertura) {
                            case 1:
                                valorTotal += 2.00;
                                break;
                            case 2:
                                valorTotal += 3.00;
                                break;
                            case 3:
                                valorTotal += 2.00;
                            default:
                                System.out.println("Numero invalido");
                                break;
                        }

                    }
                }
            }
        }

        System.out.println(qtndSorvete);
        System.out.println("Valor total: " + valorTotal);

        input.close();
    }
}
