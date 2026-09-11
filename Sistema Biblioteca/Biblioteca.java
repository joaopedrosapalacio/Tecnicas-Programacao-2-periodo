public class Biblioteca {

    private String nome;

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void realizarEmprestimo(Livro livro, Leitor leitor) {
        if (livro.isDisponivel()) {
            
            livro.setDisponivel(false);

            System.out.println("Livro foi pego emprestado!");
            
            System.out.println("Nome do Leitor: " + leitor.getNome());
            System.out.println("Nome do Livro: " + livro.getTitulo());
            
        } else {
            System.out.println("O livro não está disponível.");
            System.out.println("Empréstimo não pode ser realizado.");
        }
    }
}