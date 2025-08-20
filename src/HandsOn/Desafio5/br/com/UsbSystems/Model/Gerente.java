package HandsOn.Desafio5.br.com.UsbSystems.Model;

public class Gerente extends Funcionario {
    private int sala;
    private int ramal;
    private double FaturamentoSemestral;


    // Constructors
    public Gerente() {
        super();
    }

    public Gerente(String nome, int cpf, Endereco endereco, double salarioFixo, int sala, int ramal, double FaturamentoSemestral) {
        super(nome, cpf, endereco, salarioFixo);
        this.sala = sala;
        this.ramal = ramal;
        this.FaturamentoSemestral = FaturamentoSemestral;

    }


    // Getters and Setters

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double getFaturamentoSemestral() {
        return FaturamentoSemestral;
    }

    public void setFaturamentoSemestral(double faturamentoSemestral) {
        FaturamentoSemestral = faturamentoSemestral;
    }

    @Override
    public double getBonus() {
        return this.getFaturamentoSemestral() * 0.05;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome() + "\nEndereco: " + this.getEndereco().getEnderecoCompleto() + "\nSalario Fixo: " + this.getSalarioFixo() + "\nSala: " + this.getSala() + "\nRamal: " + this.getRamal() + "\nFaturamento semestral: " + this.getFaturamentoSemestral() + "\nBonus semestral: " + this.getBonus();
    }
}
