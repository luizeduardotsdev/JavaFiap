package HandsOn.Desafio5.br.com.UsbSystems.Model;

public class Programadores extends Funcionario{
    private int Ramal;

    // Constructors
    public Programadores() {
        super();
    }

    public Programadores(String nome, int cpf, Endereco endereco, double salarioFixo, int Ramal) {
        super(nome, cpf, endereco, salarioFixo);
        this.Ramal = Ramal;
    }

    // Getters and Setters
    public int getRamal() {
        return Ramal;
    }

    public void setRamal(int ramal) {
        Ramal = ramal;
    }

    @Override
    public double getBonus() {
        return getSalarioFixo() * 0.2;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome()
                + " Endereco: " + this.getEndereco()
                + " Salario Fixo: " + this.getSalarioFixo()
                + " Ramal: " + this.getRamal()
                + " Bonus semestral: " + this.getBonus();
    }

}
