public class Espaco {

    private String nome;
    private String endereco;
    private int capacidade;
    private String tipo;

    public Espaco(int capacidade, String endereco, String nome, String tipo) {
        this.capacidade = capacidade;
        this.endereco = endereco;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tipo do espaco: " + tipo);
    }
    
}