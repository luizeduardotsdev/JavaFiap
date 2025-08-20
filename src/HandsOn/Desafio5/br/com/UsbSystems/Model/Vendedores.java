package HandsOn.Desafio5.br.com.UsbSystems.Model;

public class Vendedores extends Funcionario {
    private int numeroDeVendas;


    // Constructors

    public Vendedores() {
        super();
    }
    public Vendedores(String nome, int cpf, Endereco endereco, double salarioFixo, int numeroDeVendas) {
        super(nome, cpf, endereco, salarioFixo);
        this.numeroDeVendas = numeroDeVendas;
    }

    // Getters and Setters

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    @Override
    public double getBonus() {
        return getNumeroDeVendas() * 0.015;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome()
                + " Endereco: " + this.getEndereco()
                + " Salario Fixo: " + this.getSalarioFixo()
                + " Bonus semestral: " + this.getBonus();
    }
}
