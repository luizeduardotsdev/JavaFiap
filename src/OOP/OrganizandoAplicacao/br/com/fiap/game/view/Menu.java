package OOP.OrganizandoAplicacao.br.com.fiap.game.view;


import OOP.OrganizandoAplicacao.br.com.fiap.game.model.HabilidadeEspecial;
import OOP.OrganizandoAplicacao.br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int opcao;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Realizar ataque \n4-Aumentar energia \n5-Ativar habilidade Especial \n0-Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = input.next() + input.nextLine();
                    System.out.println("Digite o poder do personage: ");
                    String poder = input.next() + input.nextLine();
                    System.out.println("Digite o nivel de erngia: ");
                    int energia = input.nextInt();

                    // Usando set builder
                    personagem.setNome(nome).setPoder(poder).setNivelDeEnergia(energia);

                    System.out.println("Digite a habilidade especial ");
                    String nomeHabilidade = input.next() + input.nextLine();
                    System.out.println("Digite quanto de energia gasta: ");
                    int energiaGasta = input.nextInt();
                    System.out.println("A habilidade esta ativa (true/false)");
                    boolean ativa = input.nextBoolean();

                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, energiaGasta, ativa);

                    personagem.setHabilidadeEspecial(habilidadeEspecial);

                    break;
                case 2:
                    System.out.println("Nome do personagem: " + personagem.getNome() + " Poder " + personagem.getPoder() + " nivel de energia " + personagem.getNivelDeEnergia());
                    System.out.println("Nome da habilidade: " + personagem.getHabilidadeEspecial().getNomeHabilidade() + " Quanto gasta de energia: " + personagem.getHabilidadeEspecial().getCustoEnergia() + " habilidade esta ativa? " + personagem.getHabilidadeEspecial().isAtiva());
                    break;
                case 3:
                    System.out.println("Realizar ataque normal");
                    String ataque = input.next() + input.nextLine();
                    personagem.atacar(ataque);

                    break;
                case 4:
                    System.out.println("Quanto de energia aumentar: ");
                    int energiaAumenta = input.nextInt();
                    personagem.aumentarEnergia(energiaAumenta);
                    break;
                case 5:
                    System.out.println("Ativar habilidade Especial");
                    personagem.ativarHabilidadeEspecial();
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
