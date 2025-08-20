package HandsOn.Desafio3Loja;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    // Constructors
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto() {}

    // Methods
    public void exibirInformacoes() {

        if (quantidadeEstoque > 0) {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: " + preco);
            System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        } else {
            System.out.println("Nao existem produtos");
        }

    }

    public void quantidadeCompra(int quantidadeComprada) {
        if (quantidadeEstoque >= quantidadeComprada) {
            quantidadeEstoque -= quantidadeComprada;
            System.out.println("Quantidade comprada: " + quantidadeComprada + " restam " +  quantidadeEstoque );
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println(quantidade + " Foi adcionado ao estoque");
        System.out.println("estoque total é: " + quantidadeEstoque);
    }

    public void adicionarDesconto(int desconto) {
        double percentual = desconto / 100;
        double novoPreco = preco - percentual;
        System.out.println("Desconto final de " + percentual + " o novo preco: " + novoPreco);
    }

}
