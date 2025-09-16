package Vetores.Array.Vetor;

import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] produtos = new String[5];
        //String[] produtos = {"Notebook", "Smartphone", "Tablet", "Fone de ouvido", "Carregador portatil"};

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto "+ i + ": ");
            produtos[i] = input.nextLine();
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

        System.out.println("Digite o nome do produto: ");
        String produtoProcurado  = input.nextLine();

        boolean produtoEncontrado = false;
        int i = 0;

        while (!produtoEncontrado && i < produtos.length) {
            if (produtos[i].equals(produtoProcurado)) {
                produtoEncontrado = true;
            }
            i++;
        }

        if (produtoEncontrado) {
            System.out.println("Produto encontrado");
        } else {
            System.out.println("Produto nao encontrado");
        }

        input.close();
    }
}
