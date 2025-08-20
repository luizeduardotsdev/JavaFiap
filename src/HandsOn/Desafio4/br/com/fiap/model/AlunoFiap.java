package HandsOn.Desafio4.br.com.fiap.model;

public class AlunoFiap {

    private String nome;
    private int matricula;
    private Endereco endereco;

    // Constructors
    public AlunoFiap(int matricula, String nome, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public AlunoFiap() {}

    // Getters and Setters


    public String getNome() {
        return nome;
    }

    public AlunoFiap setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getMatricula() {
        return matricula;
    }

    public AlunoFiap setMatricula(int matricula) {
        this.matricula = matricula;
        return this;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public AlunoFiap setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }
}
