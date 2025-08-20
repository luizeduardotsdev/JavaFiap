package OOP.Polimorfismo.br.com.Fiap.Loja.View;

import OOP.Polimorfismo.br.com.Fiap.Loja.Model.Usuario;

public class ViewUsuario {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("123@gmail.com", "admin123");
        Usuario usuario3 = new Usuario("Luiz", "fiap@gmail.com", "admin123");
    }
}
