package OOP.Heranca.br.com.restaurante.Model;

public class Bebida extends Produto{
    private int quantidade;

    // Constructors

    public Bebida() {

    }

    @Override
    public String getResumo() {
        return "Nome: " + this.getNome() + "preco: " + this.getPreco() + "ingredientes: " + this.getIngredientes() + "Quantidade em ml: " + this.getQuantidade();
    }

    public Bebida(String nome, double preco, String ingredientes, int quantidade) {
        super(nome, preco, ingredientes);
        this.quantidade = quantidade;

    }

    // Getters and Setters

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
