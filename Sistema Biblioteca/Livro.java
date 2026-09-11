public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private String anoPublicacao;
    private boolean disponivel; 

    public Livro(String anoPublicacao, String autor, boolean disponivel, String isbn, String titulo) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.disponivel = disponivel;
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano de publicacao: " + anoPublicacao);
        System.out.println("Disponivel: " + disponivel);
    }
    
}