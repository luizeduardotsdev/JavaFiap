package IntroducaoAoJava.Condicoes;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Esta ensolarado? (true: para sim, false: para nao) ");
        boolean ensolarado = input.nextBoolean();

        System.out.println("É final de semana? (true: para sim, false: para nao) ");
        boolean finalSemana = input.nextBoolean();

        if (ensolarado && finalSemana){
            System.out.println("Vamos para praia aproveitar o sol!");
        }

        input.close();
    }
}
