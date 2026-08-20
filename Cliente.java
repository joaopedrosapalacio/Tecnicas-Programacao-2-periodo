
public class Cliente {

    private String nome;
    private String cpf;
    private int idade;
    private boolean sair = false;

    public void setCadastrar(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void setAlterar(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getExibir() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade;
    }

    public void setSair() {
        this.sair = true;
    }

    public boolean isSair() {
        return this.sair;
    }
}
