package HandsOn.Desafio5.br.com.UsbSystems.Model;

public class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;


    // Constructors
    public Endereco() {}

    public Endereco(String logradouro, int numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    // Getters and Setters

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEnderecoCompleto(){
        return "Rua: " + this.logradouro + "\nNumero: " + this.numero + "\nCidade: " + this.cidade;
    }
}
