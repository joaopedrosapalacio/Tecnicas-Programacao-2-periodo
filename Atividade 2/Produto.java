public class Produto {

    private String nome;
    private double preco;
    private String validade;
    private String tipo;
    private String marca;

    public Produto() {}

    public Produto(String nome, double preco, String validade, String tipo, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getNome() {
        return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome; 
    }

    public double getPreco() {
        return preco; 
    }
    public void setPreco(double preco) {
        this.preco = preco; 
    }

    public String getValidade() {
        return validade; 
    }

    public void setValidade(String validade) {
        this.validade = validade; 
    }

    public String getTipo() {
        return tipo; 
    }

    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }

    public String getMarca() {
        return marca; 
    }

    public void setMarca(String marca) {
        this.marca = marca; 
    }

    public void listar() {
        System.out.println("Nome: " + nome + " | Preço: R$ " + preco + 
                           " | Validade: " + validade + " | Tipo: " + tipo + 
                           " | Marca: " + marca);
    }

    public void alterar(String nome, double preco, String validade, String tipo, String marca) {
        setNome(nome);
        setPreco(preco);
        setValidade(validade);
        setTipo(tipo);
        setMarca(marca);
    }

    void setCadastrar(String nome, double preco, String validade, String tipo, String marca) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}