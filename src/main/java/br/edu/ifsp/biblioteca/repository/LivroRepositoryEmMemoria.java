package br.edu.ifsp.biblioteca.repository;

import br.edu.ifsp.biblioteca.domain.Livro;
import com.sun.org.apache.bcel.internal.generic.LOOKUPSWITCH;

import java.util.*;

public class LivroRepositoryEmMemoria implements ILivroRepository{

    private final Map<Long, Livro> livros = new HashMap<Long, Livro>();
    private Long sequenciaId = 0L;

    @Override
    public Livro salvar(Livro livro) {

        if (livro.getId() == null){
            this.sequenciaId = this.sequenciaId + 1;
            livro.setId(this.sequenciaId);
        }

        this.livros.put(livro.getId(), livro);

        return livro;//insere a entrada no hashmap
    }

    @Override
    public List<Livro> listarTodos() {

//        List<Livro> todosOsLivros = new ArrayList<>();
//
//        for(Livro livro : this.livros.values()){
//            todosOsLivros.add(livro);
//        }
//
//        return todosOsLivros;

    //outra forma
//        List<Livro> colecaoLivros = new ArrayList<>(this.livros.values());
//        return colecaoLivros;
        //return new ArrayList<>(this.livros.values());
    }

    @Override
    public Optional<Livro> buscarPorId(Long id) {

        return Optional.ofNullable(this.livros.get(id));

       /*
       operador ternario

       return l == null ? Optional.empty() : Optional.of(l);
       Livro l = this.livros.get(id);

        if(l == null){
            return Optional.empty();
        }

        return Optional.of(l);
        */
    }

    @Override
    public Optional<Livro> buscarPorIsbn(String isbn) {

            List<Livro> colecaoLivros = new ArrayList<>(this.livros.values());

            for (int i = 0 ; i < colecaoLivros.size(); i++){

                Livro livro = colecaoLivros.get(i);
                String livroIsbn = livro.getIsbn();

                if(livroIsbn.equals(isbn)){
                    return Optional.of(livro);
                }
            }

        return Optional.empty();
    }

    @Override
    public List<Livro> buscarPorTitulo(String titulo) {

        List<Livro>encontrados = new ArrayList<>();

        for(Livro livro : this.livros.values()){

            String livroTitulo = livro.getTitulo().toLowerCase();

            if(livroTitulo.contains(titulo.toLowerCase())){
                encontrados.add(livro);
            }
        }

        return encontrados;
    }
}
