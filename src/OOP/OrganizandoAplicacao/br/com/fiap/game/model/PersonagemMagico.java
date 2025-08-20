package OOP.OrganizandoAplicacao.br.com.fiap.game.model;

public class PersonagemMagico {

    // Atributos // é uma boa pratica manter atributos sempre private
    private String nome;
    private String Poder;
    private int nivelDeEnergia;

    HabilidadeEspecial habilidadeEspecial;

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

    // metodo para atacar
    public void atacar(String ataque) {
        if (nivelDeEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelDeEnergia -= 10;
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }

    }

    // metodo para aumentar energia
    public int aumentarEnergia(int energia) {
        nivelDeEnergia += energia;
        return nivelDeEnergia;
    }

    // metodo para usar habilidade espcial
    public void ativarHabilidadeEspecial() {
        if (!habilidadeEspecial.isAtiva()){
            System.out.println("Habilidade especial nao esta ativa");
        } else if (nivelDeEnergia >= habilidadeEspecial.getCustoEnergia()) {
            nivelDeEnergia = nivelDeEnergia - habilidadeEspecial.getCustoEnergia();
            System.out.println("Ativando habilidade especial " +habilidadeEspecial.getNomeHabilidade());
            System.out.println(nivelDeEnergia);
        } else {
            System.out.println(nome + " esta sem energia para usa habilidade especial");
        }
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public PersonagemMagico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getPoder() {
        return Poder;
    }

    public PersonagemMagico setPoder(String poder) {
        Poder = poder;
        return this;
    }

    public int getNivelDeEnergia() {
        return nivelDeEnergia;
    }

    public PersonagemMagico setNivelDeEnergia(int nivelDeEnergia) {
        this.nivelDeEnergia = nivelDeEnergia;
        return this;
    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public PersonagemMagico setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
        return this;
    }


}
