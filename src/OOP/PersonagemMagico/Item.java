package OOP.PersonagemMagico;

public class Item {
    public String nomeItem;
    public String descricaoItem;
    public boolean raro;
    public int nivelPoder;

    public Item(String nomeItem, String descricaoItem, boolean raro, int nivelPoder) {
        this.nomeItem = nomeItem;
        this.descricaoItem = descricaoItem;
        this.raro = raro;
        this.nivelPoder = nivelPoder;
    }

    public Item(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Item() {}
}
