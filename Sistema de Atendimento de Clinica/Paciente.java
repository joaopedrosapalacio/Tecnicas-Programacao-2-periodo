public class Paciente {

    private String nome;
    private String cpf;
    private int idade;
    private int telefone;

    public Paciente(String cpf, int idade, String nome, int telefone) {
        this.cpf = cpf;
        setIdade(idade);
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade nao pode ser negativa");
        }
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
    }

}