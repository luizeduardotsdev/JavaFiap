package ListEArrayList.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTeste {
    public static void main(String[] args) {
        // Criacao de uma lista de Strings
        List<String> cores = new ArrayList<>();

        // Adicao de elemento
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Branco");

        // Acesso de um elemento
        System.out.println(cores.get(2));

        // Modificacao de um elemento
        cores.set(2, "Roxo");
        System.out.println(cores);

        // Remocao de elementos
        cores.remove("Amarelo");
        cores.remove(2);
        System.out.println("Lista apos remocao "+ cores);

        // Tamanho da Lista
        System.out.println("Tamanho da lista " + cores.size());

        // Verifica se um elemento esta presente
        if (cores.contains("Branco")) {
            System.out.println("A cor esta presente");
        } else {
            System.out.println("A cor nao esta presente");

        }

        // Percorre a lista
        for (int i = 0; i < cores.size(); i++) {
            System.out.println("Cor de posicao numero " + (i+1) + ": " + cores.get(i));
        }

        // for each
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Limpar a lista
        cores.clear();
        System.out.println("Lista vazia: " + cores);

        // Verifica se a lista esta vazia
        if (cores.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Lista contem elementos");
        }



    }
}
