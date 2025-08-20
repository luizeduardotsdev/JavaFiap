package OOP.Polimorfismo.br.com.Fiap.Loja.View;

import OOP.Polimorfismo.br.com.Fiap.Loja.Model.Produto;

import java.util.Scanner;

public class ViewProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        Produto produto = new Produto(nome, valor);



        System.out.println("Escolha o tipo de desconto: \n1-valor em reais \n2-cupom de desconto");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Digite o valor do desconto em reais: ");
                double reais = sc.nextDouble();
                System.out.println("O desconto em reais foi de: " + produto.calcularDesconto(reais));
                break;
            case 2:
                System.out.println("Digite o cupom de desconto: ");
                String cupom = sc.next();
                System.out.println("O desconto em reais foi de: " + produto.calcularDesoconto(cupom.toUpperCase()));
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }



        sc.close();
    }
}
