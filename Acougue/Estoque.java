import java.util.Date;

public class Estoque {

    private ProdutoV2 produto;
    private double qntdAtual;
    private Date ultimoRestoque;
    private String codigoRegistro;
    private String classe;

    public Estoque(ProdutoV2 produto, double qntdAtual, String codigoRegistro, String classe) {
        this.produto = produto;
        this.setQntdAtual(qntdAtual);
        this.ultimoRestoque = new Date();
        this.setCodigoRegistro(codigoRegistro);
        this.setClasse(classe);
    }

    public ProdutoV2 getProduto() {
        return produto;
    }

    public double getQntdAtual() {
        return qntdAtual;
    }

    public void setQntdAtual(double qntdAtual) {
        if (qntdAtual < 0) {
            System.out.println("A quantidade atual nao pode ser menor que 0");
        } else {
            this.qntdAtual = qntdAtual;
        }
    }

    public Date getUltimoRestoque() {
        return ultimoRestoque;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        if (codigoRegistro == null) {
            System.out.println("O codigo de registro nao pode ser nulo");
        } else {
            this.codigoRegistro = codigoRegistro;
        }
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        if (classe == null) {
            System.out.println("A classe nao pode ser nula");
        } else {
            this.classe = classe;
        }
    }

    public void entradaEstoque(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade de entrada deve ser maior que 0");
        } else {
            this.qntdAtual += quantidade;
            this.ultimoRestoque = new Date();
        }
    }

    public void saidaEstoque(double quantidade) {
        if (quantidade <= this.qntdAtual) {
            this.qntdAtual -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}