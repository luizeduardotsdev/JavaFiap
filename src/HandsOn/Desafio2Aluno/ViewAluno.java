package HandsOn.Desafio2Aluno;

import java.util.Scanner;

public class ViewAluno {
    public static void main(String[] args) {

        AlunoFiap alunoFiap = new AlunoFiap();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        alunoFiap.nomeAluno = input.nextLine();
        System.out.println("Digite o matricula do aluno");
        alunoFiap.matricula = input.nextInt();


        // Acessa EnderecoAluno
        System.out.println("Digite o logradouro do aluno: ");
        alunoFiap.enderecoAluno.logradouro = input.next() + input.nextLine();
        System.out.println("Digite o cep: ");
        alunoFiap.enderecoAluno.cep = input.nextInt();
        System.out.println("Digite a referencia: ");
        alunoFiap.enderecoAluno.referencia = input.next() + input.nextLine();


        // Acessa CidadeAluno passando pelo EnderecoAluno
        System.out.println("Digite a cidade do aluno: ");
        alunoFiap.cidadeAluno.nomeCidade = input.next() + input.nextLine();
        System.out.println("Digite o estado do aluno: ");
        alunoFiap.cidadeAluno.estadoCidade = input.next() + input.nextLine();

        System.out.println("O aluno " +  alunoFiap.nomeAluno + " com matricula " + alunoFiap.matricula);
        System.out.println("Cujo logradouro é " +alunoFiap.enderecoAluno.logradouro + " Com o cep " +alunoFiap.enderecoAluno.cep+ " e a referencia " + alunoFiap.enderecoAluno.referencia);
        System.out.println("E mora na cidade: " +alunoFiap.cidadeAluno.nomeCidade+ " no estado de: " + alunoFiap.cidadeAluno.estadoCidade );



        input.close();

    }
}
