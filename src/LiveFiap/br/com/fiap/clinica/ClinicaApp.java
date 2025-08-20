package LiveFiap.br.com.fiap.clinica;

import LiveFiap.br.com.fiap.clinica.model.Paciente;

public class ClinicaApp {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.nome = "Lucas";
        paciente1.altura = 173;
        paciente1.peso = 70;
        paciente1.exibirDadosDoPaciente();

        Paciente paciente2 = new Paciente();
        paciente2.nome = "Ana maria";
        paciente2.altura = 163;
        paciente2.peso = 60;
        paciente2.exibirDadosDoPaciente();

        Paciente paciente3 = paciente1;
        paciente3.exibirDadosDoPaciente();


        System.out.println(paciente1);
        System.out.println(paciente2);
        System.out.println(paciente3);

    }
}
