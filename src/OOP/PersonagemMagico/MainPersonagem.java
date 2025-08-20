package OOP.PersonagemMagico;

import java.util.Locale;

public class MainPersonagem {
    public static void main(String[] args) {
        
        PersonagemMagico mago = new PersonagemMagico("Gendalf", "Magia", 20);

        System.out.println(mago.nome);
        System.out.println(mago.Poder);
        System.out.println(mago.nivelDeEnergia);

        System.out.println("--------------");

        PersonagemMagico elfo = new PersonagemMagico("Legolas", "Arco e Flecha", 10);

        System.out.println(elfo.nome);
        System.out.println(elfo.Poder);
        System.out.println(elfo.nivelDeEnergia);

        System.out.println("--------------");

        PersonagemMagico anao = new PersonagemMagico("Anakin SkyWalker");
        System.out.println(anao.nome);
        System.out.println(anao.Poder);
        System.out.println(anao.nivelDeEnergia);
    }
}
