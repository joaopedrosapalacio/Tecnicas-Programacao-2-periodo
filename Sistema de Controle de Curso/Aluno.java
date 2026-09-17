public class Aluno {

    private String nome;
    private int matricula;
    private int idade;
    private String email;

    public Aluno (String nome, int matricula, int idade, String email) {
        this.nome = nome;
        this.matricula = matricula;
        setIdade(idade);
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        if (idade < 0) {
            System.out.println("Idade invalida");
        }
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Idade: " + this.idade);
        System.out.println("Email: " + this.email);
    }

    public boolean verificarMaioridade() {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}