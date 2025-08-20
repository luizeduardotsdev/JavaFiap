package IntroducaoAoJava.Condicoes;

import java.util.Scanner;

public class SistemaPedidoCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cafePequeno = 2.50;
        double cafeMedio = 3.00;
        double cafeGrande = 3.50;

        double expresso = 1.50;
        double cappuccino = 2.00;
        double latte = 2.50;


        System.out.println("Escolha o tamnho do cafe ( P, M e G)");
        String tamanho = input.nextLine().toLowerCase();

        switch (tamanho) {
            case "p":
                System.out.println("Digite o tipo do cafe(E, C e L)");
                String tipo1 = input.nextLine().toLowerCase();
                switch (tipo1) {
                    case "e":
                        System.out.println(cafePequeno + expresso);
                        break;
                    case "c":
                        System.out.println(cafePequeno + cappuccino);
                        break;
                    case "l":
                        System.out.println(cafePequeno + latte);
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }
                break;

            case "m":
                System.out.println("Digite o tipo do cafe(E, C e L)");
                String tipo2 = input.nextLine().toLowerCase();
                switch (tipo2) {
                    case "e":
                        System.out.println(cafeMedio + expresso);
                        break;
                    case "c":
                        System.out.println(cafeMedio + cappuccino);
                        break;
                    case "l":
                        System.out.println(cafeMedio + latte);
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            case "g":
                System.out.println("Digite o tipo do cafe(E, C e L)");
                String tipo3 = input.nextLine().toLowerCase();
                switch (tipo3) {
                    case "e":
                        System.out.println(cafeGrande + expresso);
                        break;
                    case "c":
                        System.out.println(cafeGrande + cappuccino);
                        break;
                    case "l":
                        System.out.println(cafeGrande + latte);
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
        }

        input.close();

    }
}
