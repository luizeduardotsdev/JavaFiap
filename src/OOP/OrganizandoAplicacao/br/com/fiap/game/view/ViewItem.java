package OOP.OrganizandoAplicacao.br.com.fiap.game.view;

import OOP.PersonagemMagico.Item;

import java.util.Scanner;

public class ViewItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OOP.PersonagemMagico.Item Item = null;
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção: \n1-Digite o nome do item \n2-Exibir Item \n3-Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Item: ");
                    String nome = input.next() + input.nextLine();
                    System.out.println("Digite a descricao do item: ");
                    String descricao = input.next() + input.nextLine();
                    System.out.println("O item é raro ");
                    boolean raro = input.nextBoolean();
                    System.out.println("Digite o nivel de poder: ");
                    int poder = input.nextInt();

                    Item = new Item(nome, descricao, raro, poder);

                    break;
                case 2:
                    if (Item == null) {
                        System.out.println("Nenhum item foi cadastrado");
                    } else {
                        System.out.println("Nome do item: " + Item.nomeItem + " Poder " + Item.descricaoItem + " é raro? " + Item.raro + " nivel de poder " + Item.nivelPoder);
                    }
                    break;
                case 3:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida. tente novamente");
                    break;
            }

        } while (opcao != 3);


        input.close();
    }
}