package HandsOn.Desafio3Loja;

import java.util.Scanner;

public class SecretShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;

        do {
            System.out.println("----------------");
            System.out.println("Welcome to the Secret Shop");
            System.out.println("1-Cadastrar Produto \n2-Exibir Produto \n3-Comprar \n4-Adicionar Estoque \n5-Adicionar Desconto \n0-Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = input.nextLine() + input.nextLine() ;
                    System.out.println("Digite o valor do produto: ");
                    double preco = input.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = input.nextInt();

                    produto = new Produto(nome, preco, quantidade);

                    break;
                case 2:
                    produto.exibirInformacoes();
                    break;
                case 3:
                    System.out.println("Quantidade que deseja comprar");
                    int quantidadeCompra = input.nextInt();
                    produto.quantidadeCompra(quantidadeCompra);
                    break;
                case 4:
                    System.out.println("Quantidade que deseja adicionar: ");
                    int quantidadeEstoque = input.nextInt();
                    produto.adicionarEstoque(quantidadeEstoque);
                    break;
                case 5:
                    System.out.println("Digite qual a % de desconto");
                    int desconto =  input.nextInt();
                    produto.adicionarDesconto(desconto);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida tente novamente");
                    break;
            }
        }while (opcao != 0);
    }
}
