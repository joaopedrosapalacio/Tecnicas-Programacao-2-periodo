public class BombaCombustivel {

    private String tipoCombustivel;
    private double precoPorLitro;
    private double capacidadeTanqueLitros;
    private double estoqueAtualLitros;

    public BombaCombustivel(String tipoCombustivel, double capacidadeTanqueLitros, double estoqueAtualLitros, double precoPorLitro) {
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
        this.estoqueAtualLitros = estoqueAtualLitros;
        this.precoPorLitro = precoPorLitro;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        if (precoPorLitro < 0){
            System.out.println("Erro: preco invalido");
        } else {
        this.precoPorLitro = precoPorLitro;
        }
    }

    public double getCapacidadeTanqueLitros() {
        return capacidadeTanqueLitros;
    }

    public void setCapacidadeTanqueLitros(double capacidadeTanqueLitros) {
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
    }

    public double getEstoqueAtualLitros() {
        return estoqueAtualLitros;
    }

    public void setEstoqueAtualLitros(double estoqueAtualLitros) {
        if (estoqueAtualLitros > capacidadeTanqueLitros) {
            System.out.println("Estoque ultrapassou a capacidade total");
        } else if (estoqueAtualLitros < 0) {
            System.out.println("Erro: estoque invalido");
        } else {
        this.estoqueAtualLitros = estoqueAtualLitros;
        }
    }
}