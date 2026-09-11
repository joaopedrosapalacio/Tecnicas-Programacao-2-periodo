public class sistemaBiblioteca {
    public static void main(String[] args) {
        
        Livro livro;
        Leitor leitor;
        Biblioteca biblioteca;

        livro =  new Livro("02/02/1928", "HP Lovecraft", true, "1234567890123", "O chamado de Cthulhu");
        leitor = new Leitor(1234567, "Joao");
        biblioteca = new Biblioteca("Alexandria");

        biblioteca.realizarEmprestimo(livro, leitor);
    }
}