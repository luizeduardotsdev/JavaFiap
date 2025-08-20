package OOP.Heranca.br.com.restaurante.Model;

public class PratoQuente extends Produto {
    private int serve;

    // Constructors
    public PratoQuente() {
        super();
    }

    @Override
    public String getResumo() {
        return "Nome: " + this.getNome() + "preco: " + this.getPreco() + "ingredientes: " + this.getIngredientes() + "Serve: " + this.getServe();

    }


    public PratoQuente(String nome, double preco, String ingrediente, int serve) {
        super(nome, preco, ingrediente);
        this.serve = serve;
    }

    // Getters and Setters

    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }
}
