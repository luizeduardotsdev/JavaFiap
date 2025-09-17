package ListEArrayList.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VotacaoFIlme {
    public static void main(String[] args) {
        List<String> filmes = Arrays.asList("Star wars", "Vingadores", "Minecraft", "Superman");

        List<Integer> votos = new ArrayList<>(Arrays.asList(0, 0, 0, 0));

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < filmes.size(); i++) {
            System.out.println((i+1) +" - " + filmes.get(i));
        }

        System.out.println("Digite o numero do filme que deseja votar( 0-Para sair)");
        int op;
        do {
            op = input.nextInt();
            if (op > 0 && op <= filmes.size()) {
                int indice = op - 1;
                votos.set(indice, votos.get(indice));
            } else {
                System.out.println("Opcao invalida");
            }

        } while(op != 0);

        int maxVotos = 0;
        int indiceVendendor = -1;

        for (int i = 0; i < votos.size(); i++) {
            if (votos.get(i) > maxVotos) {
                maxVotos = votos.get(i);
                indiceVendendor = i;
            }
        }

        if (indiceVendendor != -1) {
            System.out.println("Vencedor " + indiceVendendor + " com total de votos " +  maxVotos);
        } else {
            System.out.println("Nenhum Vencedor");
        }









        input.close();
    }
}
