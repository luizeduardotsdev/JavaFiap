package OOP.Heranca.br.com.restaurante.View;

import OOP.Heranca.br.com.restaurante.Model.Bebida;
import OOP.Heranca.br.com.restaurante.Model.PratoQuente;

public class ViewProdutos {
    public static void main(String[] args) {

        /*
        * Produto é uma classe abstrata
        * Produto p = new Produto();
        * */

        PratoQuente pratoQuente = new PratoQuente("Omelete", 20, "Ovo, tomate, cebola", 1);
        System.out.println("Nome do prato: " + pratoQuente.getNome());
        System.out.println("Preco do prato: " + pratoQuente.getPreco());
        System.out.println("Ingredientes do prato: " + pratoQuente.getIngredientes());
        System.out.println("Serve pessoas: " + pratoQuente.getServe());

        System.out.println("---------------------------");

        Bebida bebida = new Bebida();
        bebida.setNome("Suco de laranja");
        bebida.setPreco(7);
        bebida.setIngredientes("laranja, agua, açucar");
        bebida.setQuantidade(100);
        System.out.println("Nome da bebida: " + bebida.getNome());
        System.out.println("Preco da bebida: " + bebida.getPreco());
        System.out.println("ingredientes da bebida: " + bebida.getIngredientes());
        System.out.println("quantidade em ml: " + bebida.getQuantidade()+ "ml");

        System.out.println("-----------");
        System.out.println(bebida.getResumo());
        System.out.println("-----------");
        System.out.println(pratoQuente.getResumo());

    }
}
