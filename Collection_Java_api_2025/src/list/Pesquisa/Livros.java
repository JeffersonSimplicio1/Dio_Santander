package list.Pesquisa;

public class Livros {
    private String titulo;
    private  String autor;
    private Integer anoPublicacao;

    public Livros(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return " Livros {" +
                " titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", anoPublicacao = " + anoPublicacao +
                '}';
    }
}
