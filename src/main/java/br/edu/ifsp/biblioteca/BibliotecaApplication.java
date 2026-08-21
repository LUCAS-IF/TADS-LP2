package br.edu.ifsp.biblioteca;

import br.edu.ifsp.biblioteca.domain.Livro;

public class BibliotecaApplication {
    public static void main(String[] args) {

        Livro livro = new Livro( //Instanciando uma classe
                1L, // CASTING PARA O TIPO LONG, POIS ELE ENTENDE POR PADRAO COM INT
                "9788508145607",
                "Dom Casmurro",
                2026
        );

        System.out.println(livro);

        Livro livro2 = new Livro(
                2L,
                "9788573264579",
                "Dom Quixote",
                2026
        );

        System.out.println(livro2);

        Livro livro3 = new Livro(
                3L,
                "9788573266467",
                "Crime e Castigo ",
                2026
        );

        System.out.println(livro3);
    }
}
