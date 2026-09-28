public class ProdutoV2 {

    private int id;
    private String nome;
    private double preco;

    public ProdutoV2(int id, String nome, double preco) {
        this.setId(id);
        this.setNome(nome);
        this.setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("O ID nao pode ser negativo");
        } else {
            this.id = id;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("O nome nao pode ser nulo");
        } else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("O preco nao pode ser negativo");
        } else {
            this.preco = preco;
        }
    }

    public void atualizarPreco(double novoPreco) {
        this.setPreco(novoPreco);
    }

    public String toString() {
        return "ProdutoV2{" +
                "Nome = " + nome +
                ", Preco = " + preco +
                ", ID = " + id +
                '}';
    }
}