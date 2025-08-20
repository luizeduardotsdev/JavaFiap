package HandsOn.Desafio5.br.com.UsbSystems.Model;

public abstract class Funcionario {
    private String nome;
    private int cpf;
    private Endereco endereco;
    private double salarioFixo;

    // Constructors

    public Funcionario(){}

    public Funcionario(String nome, int cpf, Endereco endereco, double salarioFixo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salarioFixo = salarioFixo;
    }


    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salario) {
        this.salarioFixo = salario;
    }

    public abstract double getBonus();

    public abstract String getDetalhamento();
}
