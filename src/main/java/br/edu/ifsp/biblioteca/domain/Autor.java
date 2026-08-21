package br.edu.ifsp.biblioteca.domain;

public class Autor {
    private Long id;
    private String nome;

    public Autor(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){ // implementada para formatar o tipo de mensagem que será mostrada, CASO NAO TENHA A FUNÇÃO TOsTRING ELE GERA UYM HASH CODE QUE IDENTIFICA O OBJETO. POIS TODA CLASSE HERDA DA CLASSE OBJECT QUE POSSUI A FUNCAO toString POR ISSO USAMOS O OVERRIDE, PARA SOBRESCREVER A FUNCAO DA MANEIRA QUE QUEREMOS
        return this.nome;
    }
}
