package OOP.PersonagemMagico;

import java.util.Scanner;

public class ViewPersonagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int opcao;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Realizar ataque \n4-Aumentar energia \n5-Ativar habilidade Especial \n6-Habilitar habilidade especial\n0-Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = input.next() + input.nextLine();
                    System.out.println("Digite o poder do personagem: ");
                    String poder = input.next() + input.nextLine();
                    System.out.println("Digite o nivel de erngia: ");
                    int energia = input.nextInt();
                    personagem.nome = nome;
                    personagem.Poder = poder;
                    personagem.nivelDeEnergia = energia;

                    System.out.println("Digite a habilidade especial ");
                    String skill = input.next() + input.nextLine();
                    System.out.println("Digite quanto de energia gasta: ");
                    int energiaGasta = input.nextInt();
                    System.out.println("A habilidade esta ativa (true/false)");
                    boolean ativa = input.nextBoolean();

                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(skill, energiaGasta, ativa);

                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome do personagem: " + personagem.nome + " Poder " + personagem.Poder + " nivel de energia " + personagem.nivelDeEnergia);
                    System.out.println("Nome da habilidade: " + personagem.habilidadeEspecial.nomeHabilidade + " Quanto gasta de energia: " + personagem.habilidadeEspecial.custoEnergia + " habilidade esta ativa? " + personagem.habilidadeEspecial.ativa);
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque");
                    String ataque = input.next() + input.nextLine();
                    personagem.atacar();
                    break;
                case 4:
                    System.out.println("Quanto de energia aumentar: ");
                    int energiaAumenta = input.nextInt();
                    personagem.aumentarEnergia(energiaAumenta);
                    break;
                case 5:
                    System.out.println("Ativar habilidade especial ");
                    personagem.atacar();
                    break;
                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida. tente novamente");
                    break;
            }

        } while (opcao != 0);


        input.close();

    }
}
