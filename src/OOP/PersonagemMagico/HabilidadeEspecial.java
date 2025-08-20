package OOP.PersonagemMagico;

public class HabilidadeEspecial {
    public String nomeHabilidade;
    public int custoEnergia;
    public boolean ativa;

    // Constructors

    public HabilidadeEspecial(String nomeHabilidade, int custoEnergia, boolean ativa) {
        this.nomeHabilidade = nomeHabilidade;
        this.custoEnergia = custoEnergia;
        this.ativa = ativa;
    }

    public HabilidadeEspecial() {}

    // Methods

    public void ativarHabilidade(){
        this.ativa = true;
        System.out.println(nomeHabilidade + " Foi ativado, consumindo " +custoEnergia+ " de energia"  );
    }
}
