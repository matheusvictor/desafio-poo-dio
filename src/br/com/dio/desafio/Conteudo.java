package br.com.dio.desafio;


// uma classe abstrata não pode ser instanciada
public abstract class Conteudo {

    // um atributo estático poderá ser acessado fora da classe Conteudo
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // um método abstrato precisa ser obrigatoriamente implementado pelas classes que herdam de Conteudo
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
