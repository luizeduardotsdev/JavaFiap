package OOP.PersonagemMagico;

public class PersonagemMagico {

    // Atributos
    public String nome;
    public String Poder;
    public int nivelDeEnergia;

    public HabilidadeEspecial habilidadeEspecial;

    // Constructors

    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    public PersonagemMagico(String nome, String Poder, int nivelDeEnergia) {
        this.nome = nome;
        this.Poder = Poder;
        this.nivelDeEnergia = nivelDeEnergia;

    }

    public PersonagemMagico() {}

    // Methods

    public void atacar() {
        if (!habilidadeEspecial.ativa) {
            System.out.println(habilidadeEspecial + " - Habilidade especial nao esta ativada");
        } else if (nivelDeEnergia >= habilidadeEspecial.custoEnergia){
            System.out.println("Voce esta usando a habiilidade " + habilidadeEspecial);
            nivelDeEnergia -= habilidadeEspecial.custoEnergia;
        } else {
            System.out.println(nome + " Voce nao tem energia suficiente");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelDeEnergia += energia;
        return nivelDeEnergia;
    }



}
