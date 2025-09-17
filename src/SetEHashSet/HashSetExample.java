package SetEHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();

        frutas.add("Maça");
        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Uva");

        System.out.println("Lista: " + frutas);

        // remover um elemento
        frutas.remove("Morango");

        // verifica se contem o elemento
        if (frutas.contains("Uva")) {
            System.out.println("Esta no Set");
        } else {
            System.out.println("o elemento nao esta");
        }

        // quantos elementos unicos estao no conjunto
        for (String item : frutas) {
            System.out.println(item);
        }

        // Remove todos os elementos
        frutas.clear();
        System.out.println("Lista vazia: " + frutas);

        // Verifica se esta vazia
        if (frutas.isEmpty()) {
            System.out.println("esta vazia");
        } else {
            System.out.println("Nao esta vazia");
        }

    }
}
