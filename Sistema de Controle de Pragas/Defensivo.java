public class Defensivo {

    private String nome;
    private String tipoDePraga;
    private double dosagemPorHectare;
    private double precoPorLitro;
    private double estoqueLitros;
    private double percentualEficacia;

    public Defensivo(String nome, String tipoDePraga, double dosagemPorHectare, double precoPorLitro, double estoqueLitros, double percentualEficacia) {
        this.dosagemPorHectare = dosagemPorHectare;
        this.estoqueLitros = estoqueLitros;
        this.nome = nome;
        this.percentualEficacia = percentualEficacia;
        this.precoPorLitro = precoPorLitro;
        this.tipoDePraga = tipoDePraga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDePraga() {
        return tipoDePraga;
    }

    public void setTipoDePraga(String tipoDePraga) {
        this.tipoDePraga = tipoDePraga;
    }

    public double getDosagemPorHectare() {
        return dosagemPorHectare;
    }

    public void setDosagemPorHectare(double dosagemPorHectare) {
        if (dosagemPorHectare < 0.0) {
            System.out.println("Dosagem por hectare não pode ser negativa.");
        } else {
            this.dosagemPorHectare = dosagemPorHectare;
        }
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        if (precoPorLitro < 0.0) {
            System.out.println("Preço por litro não pode ser negativo.");
        } else {
            this.precoPorLitro = precoPorLitro;
        }
    }

    public double getEstoqueLitros() {
        return estoqueLitros;
    }

    public void setEstoqueLitros(double estoqueLitros) {
        this.estoqueLitros = estoqueLitros;
    }

    public double getPercentualEficacia() {
        return percentualEficacia;
    }

    public void setPercentualEficacia(double percentualEficacia) {
        this.percentualEficacia = percentualEficacia;
    }

    public double aplicar(double area){
        
        double quantidadeNecessaria = area * dosagemPorHectare;
        if (quantidadeNecessaria > estoqueLitros) {
            System.out.println("Estoque insuficiente para aplicar o defensivo na área especificada.");
            return 0.0;
        } else {
            estoqueLitros -= quantidadeNecessaria;
            System.out.println("Aplicação realizada com sucesso. Quantidade utilizada: " + quantidadeNecessaria + " litros.");
            return quantidadeNecessaria;
        }
    }
    
}