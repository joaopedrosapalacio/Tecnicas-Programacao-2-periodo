public class Passageiro extends Pessoa {
    
    private int codigoCartao;
    private double saldo;
    private String categoria;

    public Passageiro(String categoria, int codigoCartao, double saldo, String cpf, int id, String nome, String telefone) {
        super(cpf, id, nome, telefone);
        this.categoria = categoria;
        this.setCodigoCartao(codigoCartao);
        this.saldo = saldo;
    }

    public int getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(int codigoCartao) {
        if (codigoCartao < 0) {
            System.out.println("O codigo do cartao nao pode ser negativo");
        } else {
            this.codigoCartao = codigoCartao;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null) {
            System.out.println("A categoria nao pode ser nula");
        } else {
            this.categoria = categoria;
        }
    }

    @Override 
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("ID: " + this.id);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Codigo do cartao: " + this.codigoCartao);
        System.out.println("Saldo: " + this.saldo);
    }

    public double calcularValorTarifa(double tarifaBase) {
        return switch (categoria) {
            case "COMUM" -> tarifaBase;
            case "ESTUDANTE" -> tarifaBase / 2;
            case "IDOSO" -> 0;
            default -> throw new AssertionError();
        };
    }

    public void debitarTarifa(double tarifaBase) {
        if (saldo < tarifaBase) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Passagem comprada");
            saldo -= tarifaBase;
        }
    }
}
