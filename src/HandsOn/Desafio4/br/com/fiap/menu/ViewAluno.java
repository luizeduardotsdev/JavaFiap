package HandsOn.Desafio4.br.com.fiap.menu;

import HandsOn.Desafio4.br.com.fiap.model.AlunoFiap;
import HandsOn.Desafio4.br.com.fiap.model.Cidade;
import HandsOn.Desafio4.br.com.fiap.model.Endereco;

import java.util.Scanner;

public class ViewAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoFiap alunoFiap = new AlunoFiap();
        Endereco endereco = new Endereco();
        Cidade cidade = new Cidade();


        int op;


        do {
            System.out.println("Escolha: \n1-Cadastrar Aluno \n2-Exibir Aluno \n0-Sair");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Qual o nome do aluno?");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Qual o RM?");
                    int rm = sc.nextInt();
                    alunoFiap.setNome(nome).setMatricula(rm);


                    System.out.println("Qual o logradouro do aluno?");
                    String logradouro = sc.next() + sc.nextLine();
                    System.out.println("Qual o número?");
                    int numero = sc.nextInt();
                    System.out.println("Qual o CEP?");
                    String cep = sc.next() + sc.nextLine();
                    endereco.setLogradouro(logradouro).setNumero(numero).setCep(cep);


                    System.out.println("Qual o nome da cidade?");
                    String nomeCidade = sc.next() + sc.nextLine();
                    System.out.println("Qual o estado?");
                    String estado = sc.next() + sc.nextLine();
                    System.out.println("Aluno registrado!");

                    cidade.setNome(nomeCidade).setEstado(estado);


                    break;

                case 2:
                    System.out.println(alunoFiap.getNome() + ", rm: " + alunoFiap.getMatricula());
                    System.out.println(endereco.getLogradouro() + ", " + endereco.getNumero() + ", CEP: " + endereco.getCep());
                    System.out.println(cidade.getNome() + "/" + cidade.getEstado());
                case 0:
                    System.out.println("Finalizando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }while (op != 0);


        sc.close();
    }
}
