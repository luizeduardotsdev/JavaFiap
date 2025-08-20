package HandsOn.Desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor que deseja realizar:");
        int a = input.nextInt();

        System.out.println("Digite o segundo valor que deseja realizar:");
        int b = input.nextInt();

        int sum = a + b;
        int subtract = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiplication);
        System.out.println(division);


        input.close();
    }
}
