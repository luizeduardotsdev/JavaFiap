package LiveFiap.br.com.fiap.clinica.model;

import java.time.LocalDate;

public class Paciente {
    public String nome;
    public int peso;
    public int altura;
    private LocalDate dataNascimento;
    private String email;

    private double calculaImc() {
        double alturaEmMetros = altura/100.0;
        double imc = peso / (alturaEmMetros * alturaEmMetros);
        return imc;
    }

    private String classificarImc() {
        double imc = calculaImc();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc > 18.5 && imc < 25) {
            return "Peso ideal";
        } else if (imc > 25 && imc < 30) {
            return "Acima do peso";
        } else {
            return "Obesidade";
        }
    }

    public void exibirDadosDoPaciente() {
        System.out.println("nome do paciente: " + nome);
        System.out.println("peso: " + peso);
        System.out.println("altura: " + altura);
        System.out.println("Imc: " + calculaImc());
        System.out.println("classificarImc: " + classificarImc());
        System.out.println("-----------------------");
    }
}
