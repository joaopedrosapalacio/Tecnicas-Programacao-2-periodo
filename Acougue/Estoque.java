import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estoque{

    private List <Produto> produtos = new ArrayList<>();
    private double qntdAtual;
    private double qntdMinima;
    private Date ultimoRestoque;
    private String codigoRegistro;
    private Date dataValidade;
    private String classe;

    public Estoque() {
        this.classe = classe;
        this.codigoRegistro = codigoRegistro;
        this.dataValidade = dataValidade;
        this.setQntdAtual(qntdAtual);
        this.setQntdMinima(qntdMinima);
        this.ultimoRestoque = ultimoRestoque;
    }

    public double getQntdAtual() {
        return qntdAtual;
    }

    public void setQntdAtual(double qntdAtual) {
        if (qntdAtual < 0) {
            throw new IllegalArgumentException("A quantidade atual nao pode ser negativo");
        }
        this.qntdAtual = qntdAtual;
    }

    public double getQntdMinima() {
        return qntdMinima;
    }
    
    public void setQntdMinima(double qntdMinima) {
        if (qntdMinima < 0) {
            throw new IllegalArgumentException("Quantidade minima invalida");
        }
        this.qntdMinima = qntdMinima;
    }

    public Date getUltimoRestoque() {
        return ultimoRestoque;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void entradaEstoque(double quantidade) {
        this.qntdAtual += quantidade;
        this.ultimoRestoque = new Date();
    }

    public void saidaEstoque(double quantidade) {
        if (quantidade <= this.qntdAtual) {
            this.qntdAtual -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public boolean estaVencido() {
        return dataValidade != null && dataValidade.before(new Date());
    }

    public boolean estoqueBaixo() {
        return qntdAtual <= qntdMinima;
    }
}
