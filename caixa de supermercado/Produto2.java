public class Produto2 {
    private String nome;
    private int codigo;
    private double precoUnitario;
    private int quantidadeEstoque;
    private String categoria;

    public Produto2(String nome, int codigo, double precoUnitario, int quantidadeEstoque, String categoria){
        this.nome = nome;
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;    
    }
    public String getNome () {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo () {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario <= 0) {
            System.out.println("Preco invalido");
        } else {
            this.precoUnitario = precoUnitario;
        }
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0){
            System.out.println("Quantidade invalida");
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public boolean darBaixa(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Operacao recusada. Quantidade insuficiente");
            return false;        
        }
        quantidadeEstoque -= quantidade;
        return true;
    }
    public double calcularImposto() {
        double aliquota = switch (categoria) {
            case "Cesta Basica" -> 0.07;
            case "Produtos de Limpeza" -> 0.12;
            case "Geral" -> 0.15;
            case "Bebidas" -> 0.18;
            default -> 0.0;
        };
        return precoUnitario * aliquota;
    }
    
}