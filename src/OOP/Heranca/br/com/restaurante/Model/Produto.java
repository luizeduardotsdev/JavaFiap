package OOP.Heranca.br.com.restaurante.Model;

public abstract class Produto {
    private String nome;
    private double preco;
    private String ingredientes;

    // Constructors
    public Produto() {
    }

    public Produto(String nome, double preco, String ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }


    public abstract String getResumo();

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
