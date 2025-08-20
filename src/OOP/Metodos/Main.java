package OOP.Metodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(5, 3);
        System.out.println(soma);

        Doce doce = new Doce();
        doce.nome = "Morango do amor";
        doce.dizerNome();
    }
}
