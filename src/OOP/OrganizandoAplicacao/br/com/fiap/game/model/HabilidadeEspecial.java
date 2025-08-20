package OOP.OrganizandoAplicacao.br.com.fiap.game.model;

public class HabilidadeEspecial {
    private String nomeHabilidade;
    private int custoEnergia;
    private boolean ativa;

    // Constructors

    public HabilidadeEspecial(String nomeHabilidade, int custoEnergia, boolean ativa) {
        this.nomeHabilidade = nomeHabilidade;
        this.custoEnergia = custoEnergia;
        this.ativa = ativa;
    }

    public HabilidadeEspecial() {}

    public void atualizarHabilidadeEspecial(){
        ativa = true;
    }

    // Getters and Setters

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public int getCustoEnergia() {
        return custoEnergia;
    }

    public void setCustoEnergia(int custoEnergia) {
        this.custoEnergia = custoEnergia;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
