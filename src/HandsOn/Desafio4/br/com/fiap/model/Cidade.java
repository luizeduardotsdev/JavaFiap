package HandsOn.Desafio4.br.com.fiap.model;

public class Cidade {
    private String nome;
    private String estado;

    // Constructors
    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public Cidade() {}

    // Getters and Setters


    public String getNome() {
        return nome;
    }

    public Cidade setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public Cidade setEstado(String estado) {
        this.estado = estado;
        return this;
    }
}
