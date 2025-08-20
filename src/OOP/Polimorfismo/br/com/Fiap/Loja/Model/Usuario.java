package OOP.Polimorfismo.br.com.Fiap.Loja.Model;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    // Constructor
    public Usuario() {}

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

}
