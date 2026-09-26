import java.util.Calendar;
import java.util.Scanner;


public class Produto {
    Scanner sc = new Scanner("System.in");

    private int id;
    private String nome;
    private double preco;
    private double custo;
    private String diaDesconto;
    private double percentualDesconto;

    public Produto(double custo, String diaDesconto, int id, String nome, double percentualDesconto, double preco) {
        this.custo = custo;
        this.diaDesconto = diaDesconto;
        this.setId(id);
        this.setNome(nome);
        this.percentualDesconto = percentualDesconto;
        this.setPreco(preco);
    }

    public Produto() {
        this.setId(id);
        this.setNome(nome);
        this.setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("O ID nao pode ser negativo");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            this.nome = nome;  
        } catch (NullPointerException e) {
            System.out.println("Erro. Digite um nome valido!"); 
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preco nao pode ser negativo");
        }
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDiaDesconto() {
        return diaDesconto;
    }

    public void setDiaDesconto(String diaDesconto) {
        this.diaDesconto = diaDesconto;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco < 0) {
            throw new IllegalArgumentException("O preco nao pode ser negativo");
        }
        this.preco = novoPreco;
    }

    public boolean estaEmDesconto() {
        return diaDesconto != null && diaDesconto.equalsIgnoreCase(obterDiaAtual());
    }

    public double getPrecoComDesconto() {
        if (estaEmDesconto()) {
            return preco - (preco * percentualDesconto / 100);
        }
        return preco;
    }

    public double calcularValorFinal(double quantidade) {
        return getPrecoComDesconto() * quantidade;
    }

    public double calcularLucro(double quantidade) {
        return (getPrecoComDesconto() - custo) * quantidade;
    }

    private String obterDiaAtual() {
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dia) {
            case Calendar.SUNDAY:
                return "Domingo";
            case Calendar.MONDAY:
                return "Segunda";
            case Calendar.TUESDAY:
                return "Terça";
            case Calendar.WEDNESDAY:
                return "Quarta";
            case Calendar.THURSDAY:
                return "Quinta";
            case Calendar.FRIDAY:
                return "Sexta";
            case Calendar.SATURDAY:
                return "Sábado";
            default:
                return "";
        }
    }

    public void cadastrarProduto() {
        System.out.println("Digite o nome do produto");
        nome = sc.nextLine();

        System.out.println("Digite o preco");
        preco = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Digite o id");
        id = sc.nextInt();

        Produto produto = new Produto();

        System.out.println("Produto cadastrado com sucesso");
    }
}
